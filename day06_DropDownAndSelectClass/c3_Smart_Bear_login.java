package code.day06_DropDownAndSelectClass;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c3_Smart_Bear_login {

    //1- Open a chrome browser
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
       // driver.close();
    }

    @Test
    public void TC1_loginVerification(){
        //3- Enter username --->Tester
        //4- Enter password --->test
        //5- Click “Login” button
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement Login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();
        //6- Verify title equals: Web Orders
        String actualTitle=driver.getTitle();
        String expectedTitle="Web Orders";
        Assert.assertEquals(expectedTitle,actualTitle,"title verification has failed");



    }

}
