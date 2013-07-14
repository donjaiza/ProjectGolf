package sun.natee.ton.control.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileUtility {
    
    public static void main(String[] args) {
        String []macno = readFile("C:/macno.txt");
        System.out.println(macno[0]);
    }
    
    public static String[] readFile(String file){
        String str="";
        try {
            FileInputStream fs = new FileInputStream(file);  
            DataInputStream ds = new DataInputStream(fs);
            BufferedReader br = new BufferedReader(new InputStreamReader(ds));
            String tmp;  
            while ((tmp = br.readLine()) != null)   {
                str+=tmp+"-";
            }  
            br.close();
            ds.close();
            fs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new String[]{};
        }
        
        return str.split("-");
    }
    
    public static void writeFile(String file, String data){
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter out = new BufferedWriter(fw);
            out.write(data);
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
