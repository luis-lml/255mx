package config;

import java.io.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import Test.dosCincoCinco;

public class PropertiesFile {

    static Properties properties = new Properties();

    public static void main(String[] args) {
        readPropertiesFile();
        writePropertiesFile();
//        readPropertiesFile();
    }

    public static void readPropertiesFile() {
        Properties properties = new Properties();
        try {
            InputStream input = new FileInputStream("/Users/255_Studio/Documents/Dev-Projects/255mx/src/main/java/config/config.properties");
            properties.load(input);
            properties.getProperty("browser");
            //System.out.println(properties.getProperty("browser"));
            dosCincoCinco.browser = properties.getProperty("browser");
            System.out.println(dosCincoCinco.browser);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void writePropertiesFile() {
        try {
            OutputStream output = new FileOutputStream("/Users/255_Studio/Documents/Dev-Projects/255mx/src/main/java/config/config.properties");
            properties.setProperty("browser", "Chrome");
            properties.setProperty("result", "pass");
            properties.store(output, null);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
