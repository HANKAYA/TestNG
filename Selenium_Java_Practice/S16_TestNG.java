package Selenium_Java_Practice;

import org.testng.annotations.*;

public class S16_TestNG {

    @BeforeClass
    public void setupCLass(){ System.out.println("Before class is running");}

    @AfterClass
    public void setupAfterClass(){System.out.println("After class is running");}

    @BeforeMethod
    public void setup(){System.out.println("Before method is running");}

    @AfterMethod
    public void closing(){System.out.println("After method is running");}

    @Test
    public void TC1(){System.out.println("Test 1 is running");}

    @Test
    public void TC2(){System.out.println("Test2 is running");}

    @Test
    public void TC3(){System.out.println("Test3 is running");}

}
