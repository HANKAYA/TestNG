package Selenium_Java_Practice;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class S20_DropDown {

    // T A S K - 1
    // 1. Open Chrome browser --> 2. Go to "http://the-internet.herokuapp.com/" -->
    // 3. Click on dropdown   --> confirm default selected dropdown is "Please select an option"

    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.out.println("Test is starting");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("The test has completed");
    }
    @BeforeMethod
    public void setUp(){
        // 1. Open Chrome browser --> 2. Go to "http://the-internet.herokuapp.com/"
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/");
    }
    @Test
    public void TC1_VerifyDropDown(){
        // 3. Click on DropDown
        System.out.println("Test1 is running");
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        // Confirm default selected dropdown is "Please select an option"
        WebElement DropDownBox= driver.findElement(By.id("dropdown"));
        // We use Select Mode
        Select dropdown=new Select(DropDownBox);
        String defaultOption=dropdown.getFirstSelectedOption().getText();
        String expectedDefaultOption="Please select an option";
        Assert.assertEquals(defaultOption,expectedDefaultOption,"the default option verification is failed");

    }
    @Test
    public void TC2_VerifyOptionFromDropDown() throws InterruptedException{
        System.out.println("Test 2 is running");

        // T A S K 2
        // 1. Open Chrome browser --> 2. Go to "http://the-internet.herokuapp.com/" --> 3. Click on dropdown
        // Choose  option 2 from dropdown --> Choose option 1 from dropdown --> Choose option 2 from dropdown

        // 3. Click on dropdown
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        // Select dropdowns are created by using <Select> tag in HTML
        // And if it is select dropdown you can handle by using Select class
        WebElement DropDownBox= driver.findElement(By.id("dropdown"));
        // We use Select Method
        Select dropdown=new Select(DropDownBox);
        Thread.sleep(3000);
        // choose  option 2 from dropdown
        dropdown.selectByVisibleText("Option 2");
        // choose option 1 from dropdown
        Thread.sleep(3000);
        dropdown.selectByValue("1");
        // choose option 2 from dropdown
        Thread.sleep(3000);
        dropdown.selectByIndex(2);

    }
    @AfterMethod
    public void closing(){
        driver.close();
    }


}
