package sun.natee.ton.utility;

public class ConfigFileUtil {
    public static String getDBFromURL(String url) {
        int indexQ = url.indexOf("?");
        int indexS = 0;
        for (int i = 0; i < url.length(); i++) {
            char data = url.charAt(i);
            if (data == '/') {
                indexS = i;
            }
        }
        String dbName;
        if (indexQ > 0) {
            dbName = url.substring(indexS + 1, indexQ);
        }else{
            dbName = "";
        }
        
        return dbName;
    }
    
    public static String getCharSetFromURL(String url) {
        String charSet;
        String []split = url.split("=");
        if(split.length>1){
            charSet = split[1];
        }else{
            charSet = "";
        }
        return charSet;
    }
    
    public static String getPortFromURL(String url) {
        String port;
        String []split = url.split(":");
        if(split.length>3){
            port = split[3];
            int point = port.indexOf("/");
            port = port.substring(0, point);
        }else{
            port = "";
        }
        return port;
    }
    
    public static void main(String[] args) {
        System.out.println(getPortFromURL("jdbc:mysql://localhost:3306/MyGolf?charset=tis620"));
    }
}
