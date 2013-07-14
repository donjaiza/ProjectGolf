package sun.natee.ton.control.api;

public class Prop {
    public static void printAllGuaranteedProperties() {
       printAProperty ("java.version", "Java version number");
       printAProperty ("java.vendor", "Java vendor specific string");
       printAProperty ("java.vendor.url", "Java vendor URL");
       printAProperty ("java.home", "Java installation directory");
       printAProperty ("java.class.version", "Java class version number");
       printAProperty ("java.class.path", "Java classpath");
       printAProperty ("os.name", "Operating System Name");
       printAProperty ("os.arch", "Operating System Architecture");
       printAProperty ("os.version", "Operating System Version");
       printAProperty ("file.separator", "File separator");
       printAProperty ("path.separator", "Path separator");
       printAProperty ("line.separator", "Line separator");
       printAProperty ("user.name", "User account name");
       printAProperty ("user.home", "User home directory");
       printAProperty ("user.dir", "User's current working directory");
    }
    public static void printAProperty (String propName, String desc) {
       System.out.println ("Value for '" + desc + "' is '" + System.getProperty(propName) + "'.");
    }
    
    public static void main(String[] args) {
        printAllGuaranteedProperties();
    }
}
