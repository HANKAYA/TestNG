package code.day06_DropDown;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class c2_DropDown {

    WebDriver driver;
    @BeforeClass
    public void beforeclass(){
        System.out.println("Test is starting...");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("Test is completed...");
    }
    @BeforeMethod
    public  void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/");
    }
    @Test
    public void TC1_VerifyDropDown(){
        System.out.println("Test 1 is running...");
        // 3 Click on dropdown
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        // Confirm default selected dropdown
        WebElement DropDownBox=driver.findElement(By.id("dropdown"));
        // We use select method
        Select dropdown=new Select(DropDownBox);

        String defaultoption=dropdown.getFirstSelectedOption().getText();
        String expectedDefaultOption="Please select an option";
        Assert.assertEquals(defaultoption, expectedDefaultOption,"Default option verification has failed!");
        driver.quit();

    }
    @Test
    public void TC2_VerifyOptionsFromDropDown() throws InterruptedException {
        System.out.println("Test 2 is running...");

        // 1- Open Chrome browser  2- Go to http://the-internet.herokuapp.com/
        // 3- Chose option 2 from DropDown 4- Chose option 1
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        WebElement DropDownBox=driver.findElement(By.id("dropdown"));
        Select dropdown=new Select(DropDownBox);
        Thread.sleep(3000);
        // Chose option 2
        dropdown.selectByVisibleText("Option 2");
        Thread.sleep(3000);
        // Chose option 1
        dropdown.selectByValue("1");
        Thread.sleep(3000);
        dropdown.selectByIndex(2);
    }
    @AfterMethod
    public void closing(){
        driver.close();

    }
}
