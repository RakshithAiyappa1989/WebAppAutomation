package genericUtility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
    public String getPropertyKeyValue(String key) throws IOException {
        FileReader reader = new FileReader("src/main/java/properties/common.properties");
        Properties properties = new Properties();
        properties.load(reader);
        String prop = properties.getProperty(key);
        return prop;
    }
}
