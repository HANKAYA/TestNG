package Selenium_Java_Practice;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class S50_Lab5 {

    // Go to Amazon //enter Desk in search box
    // Then search for desks (Use this task with TestNG framework)
    public class lab05 {
        WebDriver driver = WebDriverUtil.getDriver("chrome");

        @BeforeMethod
        public void setup() {

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.get("http://amazon.com");
            driver.manage().window().maximize();
        }

        @AfterMethod
        public void close() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }

        @Test
        public void TC1() {
            System.out.println("TC1 is running");
            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Desk");
            driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();

        }
    }
}
