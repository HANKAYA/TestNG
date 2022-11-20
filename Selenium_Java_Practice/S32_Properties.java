package Selenium_Java_Practice;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class S32_Properties {

    @Test
    public void T_SystemProperties(){
        // Java has some properties that we can not get system info
        System.out.println(System.getProperty("os.name"));
    }
    @Test
    public void configurationProperties() throws FileNotFoundException{
        // To be able to make our code understand properties file you need to connect the file
        Properties properties= new Properties();
        // This is a path for configuration properties
        String pathForProperties= "configuration.properties";
        // Tell compiler to open up the File
        FileInputStream fileInputStream= new FileInputStream(pathForProperties);
        try{
            properties.load(fileInputStream);
            // File need to be load in Automation Framework
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("SmartBear_url"));
        System.out.println(properties.getProperty("SmartBear_username"));
    }

}
