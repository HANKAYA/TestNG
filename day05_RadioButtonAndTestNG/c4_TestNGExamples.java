package code.day05_RadioButtonAndTestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class c4_TestNGExamples {
    @BeforeClass
    public void setupClass(){ System.out.println("Before class is running"); }
    @AfterClass
    public void setupAfterClass(){ System.out.println("After class is running"); }
    @BeforeMethod
    public void setup(){ System.out.println("Before method is running"); }
    @AfterMethod
    public void closing(){ System.out.println("After method is running"); }

    @Test(priority = 3)
    public void TC1(){
        System.out.println("Test 1 is running");
    }
    @Test(priority = 1)
    public void TC3(){
        System.out.println("test3 is running");

        String actualState="New York";
        String expectedState="Ontario";
        //if assertion is failed next line of codes will not execute
        Assert.assertEquals(actualState,expectedState);
    }
    @Test(priority = 2)
    public void TC2(){
        System.out.println("Test2 is running");
        String name1="Oscar";
        String name2="Oscar";
        Assert.assertEquals(name1,name2);
    }
}
