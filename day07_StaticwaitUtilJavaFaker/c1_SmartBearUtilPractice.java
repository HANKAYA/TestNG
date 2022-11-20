package code.day07_StaticwaitUtilJavaFaker;

import code.utilities.BrowserUtils;
import code.utilities.SmartBearUtils;
import code.utilities.WebDriverUtil;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import code.utilities.BrowserUtils;
import code.utilities.SmartBearUtils;
import code.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c1_SmartBearUtilPractice {

    //1- Open a Chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Enter username --->Tester
    //4- Enter password --->test
    //5- Click “Login” button
    //6- Verify title equals: Web Orders

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        //1- Open a chrome browser
        //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @AfterMethod
    public void closing()  {
        BrowserUtils.wait(2);

        driver.close();

         driver.close();

    }

    @Test
    public void TC1_loginSmartBearWithUtil(){
        SmartBearUtils.loginForSmartBear(driver);
        //6- Verify title equals: Web Orders
        Assert.assertTrue(driver.getTitle().equals("Web Orders"),"Login failed!!!");


    }
}

