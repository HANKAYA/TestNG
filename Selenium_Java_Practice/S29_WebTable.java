package Selenium_Java_Practice;

import code.utilities.SmartBearUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class S29_WebTable {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test
    public void TC1_StreetVerification(){
        SmartBearUtils.loginForSmartBear(driver);
        Assert.assertEquals(driver.getTitle(),"Web Orders");
    }

    @Test(dataProvider ="TestDataforStreetName" )
    public void TC2_StreetVerification2(String streetName){
        SmartBearUtils.loginForSmartBear(driver);
        SmartBearUtils.verifyStreet(driver,streetName);

    }
    @DataProvider(name="TestDataforStreetName")
    public static Object[][]test(){
        return new Object[][]{
                {"17, Park Avenue"},
                {"55 bordeaux-cartierville"},
                {"44 Joseph-Napoléon-Henri Bourassa boulevard"},
                {"21B Baker Street"}
        };
    }
}
