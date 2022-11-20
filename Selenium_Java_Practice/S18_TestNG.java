package Selenium_Java_Practice;

import org.testng.Assert;
import org.testng.annotations.*;

public class S18_TestNG {
    @BeforeClass
    public void setupClass(){ System.out.println("Before class is running"); }
    @AfterClass
    public void setupAfterClass(){ System.out.println("After class is running"); }
    @BeforeMethod
    public void setup(){ System.out.println("Before method is running"); }
    @AfterMethod
    public void closing(){ System.out.println("After method is running"); }

    //TC1 is depends on TC3, if test TC3 is failed, TC1 will be ignored
    @Test(priority = 3,dependsOnMethods ="TC3" )
    public void TC1()
    {
        System.out.println("Test1 is running");
    }
    @Test(priority = 1)
    public void TC3(){
        System.out.println("Test3 is running");
        String expectedCar="Tesla";
        String actualCar="Honda";
        Assert.assertEquals(expectedCar,actualCar);
        //if assertion is failed next line of code will not execute
        System.out.println("Assertion for cars is passed");
    }
    @Test(priority = 2)
    public void TC2(){
        System.out.println("Test2 is running");
        String country1="USA";
        String country2="USA";
        Assert.assertEquals(country1,country2);
    }

    @Ignore
    @Test
    public void TC4(){
        System.out.println("Test4 is running");
    }

}
