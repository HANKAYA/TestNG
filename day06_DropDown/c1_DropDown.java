package code.day06_DropDown;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_DropDown {
    // Go to Google
    WebDriver driver;
    @BeforeMethod
    public void beforeClass(){
        System.out.println("Test is starting");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Test has completed");

    }
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.get("https://the-internet,herokuapp.com/");

    }
    @Test
    public void TC1_verifyDefaultOptionInDropdown(){
        System.out.println("TC1 is running");
        //2. Go to "http://the-internet.herokuapp.com/" //done
        //3 click on dropdown
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();

        //confirm default selected dropdown is "Please select an option"
        WebElement dropDownBox=driver.findElement(By.id("dropdown"));
        //we use select method here
        Select dropdown=new Select(dropDownBox);

        String defaultOption=dropdown.getFirstSelectedOption().getText();
        String expectedDefault="Please select an option";

        System.out.println("default option is:"+defaultOption);
        Assert.assertEquals(defaultOption,expectedDefault,"The default option verification has failed..");

    }
    @Test
    public void TC2_verifyOptionsFromDropDown(){
        System.out.println("Test 2 is running...");

    }


    //select dropdowns are created by using <Select> tag in HTML
    //and if it is select dropdown you can handle by using Select class

    WebElement DropDownBox=driver.findElement(By.id("dropdown"));
    Select dropdown=new Select(DropDownBox);





}
