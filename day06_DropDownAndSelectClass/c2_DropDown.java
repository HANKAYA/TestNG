package code.day06_DropDownAndSelectClass;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class c2_DropDown {
//task1
    //1. Open Chrome browser
    //2. Go to "http://the-internet.herokuapp.com/"
    //3 click on dropdown
    //confirm default selected dropdown is "Please select an option"


    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.out.println("Test is starting");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("the test has completed");
    }
    @BeforeMethod
    public void setUp(){
        //1. Open Chrome browser
        //2. Go to "http://the-internet.herokuapp.com/"
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/");
    }
    @Test
    public void TC1_verifyDropdown() {
        //3 click on dropdown
        System.out.println("Test1 is running");
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();

        //confirm default selected dropdown is "Please select an option"
        WebElement DropDownBox=driver.findElement(By.id("dropdown"));
        //we use Select Method
        Select dropdown=new Select(DropDownBox);
        String defaultOption=dropdown.getFirstSelectedOption().getText();
        String expectedDefaultOption="Please select an option";
        Assert.assertEquals(defaultOption,expectedDefaultOption,"the default option verification is failed");




    }

    @Test
    public void TC2_VerifyOptionsFromDropDown() throws InterruptedException {
        System.out.println("test2 is running");
        //task2
        //1. Open Chrome browser
        //2. Go to "http://the-internet.herokuapp.com/"
        //3 click on dropdown
        //choose  option 2 from dropdown
        //choose option 1 from dropdown
        //choose option 2 from dropdown


        //3 click on dropdown
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        //select dropdowns are created by using <Select> tag in HTML
        //and if it is select dropdown you can handle by using Select class
        WebElement DropDownBox=driver.findElement(By.id("dropdown"));
        //we use Select Method
        Select dropdown=new Select(DropDownBox);
        Thread.sleep(3000);
        //choose  option 2 from dropdown
        dropdown.selectByVisibleText("Option 2");
        //choose option 1 from dropdown
        Thread.sleep(3000);
        dropdown.selectByValue("1");
        //choose option 2 from dropdown
        Thread.sleep(3000);
        dropdown.selectByIndex(2);


    }
    @AfterMethod
    public void closing(){
        driver.close();
    }

}
