package code.day05_RadioButtonAndTestNG;

import org.testng.Assert;
import org.testng.annotations.*;

 import java.sql.SQLOutput;

public class TestNGExamples {
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
        System.out.println("Test 1 is running...");
    }
    @Test
    public void TC3(){
        System.out.println("Test 3 is running...");
        String actualState= "New York";
        String expectedState="Ontario";
        Assert.assertEquals(actualState,expectedState);
    }
@Test
    public void TC2(){
    System.out.println("Test 2 is running...");
    String name1="KAZIM";
    String name2="KAZIM";
    Assert.assertEquals(name1,name2);
    ;
}


}
