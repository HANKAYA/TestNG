package Selenium_Java_Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class S15_TestNG {
    @BeforeMethod
    public void setup() {
        System.out.println("Before method is running");
    }

    @AfterMethod
    public void closing(){
        System.out.println("After Method is running");
    }

    @Test
    public void TC1_test(){
        System.out.println("test1 is running");
    }

    @Test
    public void TC2_test(){
        System.out.println("test2 is running");
    }
}
