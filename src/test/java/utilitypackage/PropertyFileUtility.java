package utilitypackage;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility
{
    public  String getData(String key) throws Exception
    {
        FileInputStream fis = new FileInputStream("./src/test/resources/CommonDataFolder/Config.properties");

        Properties properties = new Properties();

        properties.load(fis);

        return properties.getProperty(key);
    }
}
