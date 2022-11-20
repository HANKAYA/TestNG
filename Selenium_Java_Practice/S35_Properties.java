package Selenium_Java_Practice;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class S35_Properties {

    @Test
    public void T1_Properties(){
        // Java has some properties that we can get as a system info
        System.out.println(System.getProperty("os.name"));
    }
    @Test
    public void configurationProperties() throws FileNotFoundException {
        // To be able to make our code understand properties file You need to connect the file
        Properties properties= new Properties();
        // This is a path for configuration.properties file
        String pathForPropertiesFile="configuration.properties";
        // Tell compiler to open the file
        FileInputStream fileInputStream= new FileInputStream(pathForPropertiesFile);
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("SmartBear_url"));
        System.out.println(properties.getProperty("SmartBear_username"));
    }
}
