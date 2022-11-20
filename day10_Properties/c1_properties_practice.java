//package code.day10_Properties;
//
//import org.testng.annotations.Test;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//
//public class c1_properties_practice {
//<<<<<<< HEAD
//    @Test
//    public void TC1_System_properties(){
//        System.out.println(System.getProperty("os.name"));
//    }
//    @Test
//    public void configurationProperties() throws FileNotFoundException {
//        Properties properties=new Properties();
//        String pathForPropertiesFile="configuration.properties";
//        // Tell compiler to open new file
//        FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);
//
//        try{
//            properties.load(fileInputStream);
//        }catch (IOException e){
//            e.printStackTrace();
//            System.out.println("Properties file not found");
//        }
//        System.out.println(properties.getProperty("SmartBear_username"));
//        System.out.println(properties.getProperty("SmartBear_password"));
//        System.out.println(properties.getProperty("SmartBear_url"));
//    }
//=======
//
//    @Test
//    public void TC1_System_properties(){
//        //java has some properties that we can get as a system info
//        System.out.println(System.getProperty("os.name"));
//    }
//
//
//    @Test
//    public void configurationProperties() throws FileNotFoundException {
//        //to be able to make our code understand properties file You need to connect the file
//        Properties properties=new Properties();
//
//        //this is a path for configuration.properties file
//        String pathForPropertiesFile="configuration.properties";
//
//        //tell compiler to open the file
//        FileInputStream fileInputStream= new FileInputStream(pathForPropertiesFile);
//
//        try{
//            properties.load(fileInputStream);
//            //file needs to be load in automation framework
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        System.out.println(properties.getProperty("SmartBear_url"));
//        System.out.println(properties.getProperty("SmartBear_username"));
//    }
//
//
//>>>>>>> da30bc3f139fb838d73bbeba704174c35cca2aff
//}
