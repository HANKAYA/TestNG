package code.day08_Alert_Webtable_Iframe;

import code.utilities.BrowserUtils;
import code.utilities.SmartBearUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_WebTable {
//    Smartbear software street verification
//       1. Open browser and login to Smartbear software
//       2. Click on View all orders
//       3. Verify Mark Smith has street as  “9, Maple Valley”

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        //1- Open a chrome browser
        //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //3.Login
        SmartBearUtils.loginForSmartBear(driver);
    }
    @AfterMethod
    public void closing(){
        BrowserUtils.wait(2);
        driver.close();
    }
    @Test
    public void TC1_VerifyMarkStreetName(){
        //       3. Verify Mark Smith has street as  “9, Maple Valley”
       //parent to child method
       // WebElement markStreet=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]/td[6]"));
        // Child to parent method
        WebElement markStreet=driver.findElement(By.xpath("//td[.='770077007700']//..//td[6]"));
        System.out.println("mark street name= "+markStreet.getText());

        String actualStreet=markStreet.getText();
        String expectedStreet="9, Maple Valley";
        Assert.assertEquals(actualStreet,expectedStreet,"street name verification has failed!");



    }
}
