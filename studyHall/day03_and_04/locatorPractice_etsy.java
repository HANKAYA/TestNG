package code.studyHall.day03_and_04;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class locatorPractice_etsy {
    WebDriver driver;
    @BeforeMethod
    public void setup(){

    }
    @AfterClass
    public void tearDownDriver(){

        driver.quit();
    }
    @Test
    public void TC1_searchForEarrings(){
        //Search for earrings
        //Add some filters to the search
        WebDriverManager.chromedriver().setup();
        driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://www.etsy.com/ca/");


        //First way to sendKeys and hit enter
        WebElement searchBox= driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("earrings");
        WebElement searchButton= driver.findElement(By.xpath("//button[@value='Search']"));
        searchButton.click();
       // second way to sendKeys and hit enter
       // searchBox.sendKeys("earrings"+ Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expectedUrlContains="earrings";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlContains));

    }

    @Test
    public void TC_2_addFilters() throws InterruptedException {//Search with filter
        driver.findElement(By.id("search-filter-button")).click();
        Thread.sleep(3000);

//        WebElement freeShippingCheckBox=driver.findElement(By.id("special-offers-free-shipping"));
//        Thread.sleep(3000);
//        freeShippingCheckBox.click(); // we will come back to this part later

        WebElement customBox=driver.findElement(By.id("search-filter-min-price-input"));
        Thread.sleep(5000);
        customBox.sendKeys("12");

      WebElement applyButton=  driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
      applyButton.click();

    }
}
