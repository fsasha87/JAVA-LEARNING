package io.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println(new Util().getPropertiesValue("one"));

    }
}
class Util {
    public String getPropertiesValue(String propertyKey) throws IOException {
    String propertyValue = "";
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/my.properties");
        prop.load(fis);
    return propertyValue;
    }
}
