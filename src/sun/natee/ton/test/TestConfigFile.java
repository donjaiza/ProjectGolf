package sun.natee.ton.test;

public class TestConfigFile {
    
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
    
    public static void main(String[] args) {
        System.out.println(getDBFromURL("jdbc:mysql://localhost:3306/MyCRMbranchGlof?charset=tis620"));
    }
}
