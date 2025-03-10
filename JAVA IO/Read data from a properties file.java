import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        prop.load(fis);
        System.out.println("Database: " + prop.getProperty("database"));
        System.out.println("User: " + prop.getProperty("user"));
        fis.close();
    }
}
