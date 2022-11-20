package code.day05_RadioButtonAndTestNG;

import org.testng.annotations.*;

public class c3_TestNGPractice {
    @BeforeClass
    public void setupClass(){ System.out.println("Before class is running"); }
    @AfterClass
    public void setupAfterClass(){ System.out.println("After class is running"); }
    @BeforeMethod
    public void setup(){ System.out.println("Before method is running"); }
    @AfterMethod
    public void closing(){ System.out.println("After method is running"); }
    @Test
    public void TC1(){
        System.out.println("test1 is running");
    }

    @Test
    public void TC2(){
        System.out.println("Test2 is running");
    }
    @Test
    public void TC3(){
        System.out.println("Test3 is running");
    }



}
