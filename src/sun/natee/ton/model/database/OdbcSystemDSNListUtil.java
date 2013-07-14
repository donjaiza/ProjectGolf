package sun.natee.ton.model.database;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.ArrayList;  
import java.util.List;  
  
/** 
* @author Nimish 
* Apr 9, 2010 
* changed to use ArrayList - Mark Amabile 
*/  
  
public class OdbcSystemDSNListUtil {  
  
  public static List<String> getODBCSystemDNS() {
    String PERSONAL_FOLDER_CMD ="HKEY_LOCAL_MACHINE\\SOFTWARE\\ODBC\\ODBC.INI";  
    String []command = new String[] {"reg","query",PERSONAL_FOLDER_CMD};  
    List dsnList = new ArrayList();  
    try {  
       Process process = Runtime.getRuntime().exec(command);  
       BufferedReader stream = new BufferedReader(new InputStreamReader(process.getInputStream()));  
       String dsn = "";  
       while((dsn=stream.readLine())!=null) {  
          if(dsn.indexOf(PERSONAL_FOLDER_CMD+"\\") != -1) {  
             dsnList.add(dsn.substring(dsn.lastIndexOf("\\")+1));  
          }  
       }  
  
    } catch (IOException e) {  
        System.out.println(e.getMessage());
    }  
    return dsnList;  
  }
  
  public static void main(String[] args) {  
    List<String> dsnList = getODBCSystemDNS();  
    for(String dsn:dsnList) {  
       System.out.println("dsn name: "+ dsn);  
    }
  }  
}