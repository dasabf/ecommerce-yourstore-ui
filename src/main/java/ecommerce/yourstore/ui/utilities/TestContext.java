package ecommerce.yourstore.ui.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestContext {
    Properties prop = null;
    public TestContext(){
        try{
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/config" +
                    "/EnvironmentConfig.properties");
            this.prop = new Properties();
            this.prop.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
    public String getValueFromProperties(String key){
        return prop.getProperty("key");
    }
}
