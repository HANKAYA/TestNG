package code.day06_DropDownAndSelectClass;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_GoogleTestNG {

    //go to google
    //search macbook
    //verify title
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //go to google
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

    }
    @Test
    public void TC1_GoogleTitleVerification(){
        System.out.println("TC1 is running");
        //search "macbook"
        WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("macbook", Keys.ENTER);
        //verify title contain macbook
        String actualTitle=driver.getTitle();
        String expectedTitle="macbook";
        boolean b=actualTitle.contains(expectedTitle);
        Assert.assertTrue(b,"assertion failed, title does not contain macbook");
    }

    @AfterMethod
    public void closing(){

        driver.quit();
    }

}
