package Selenium_Java_Practice;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class S13_CheckBox {
    public static void main(String[] args) throws InterruptedException{

        // Open Chrome browser --> Go to https://demo.guru99.com/test/radio.html -->
        // Verify checkbox1 is not selected --> Click to checkbox2 --> Verify checkbox2 is selected

        // 1- Open Chrome Browser
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        // 2. Go to https://demo.guru99.com/test/radio.html
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/radio.html");
        // 3. Verify checkbox1 is not selected
        WebElement checkBox1= driver.findElement(By.id("vfb-6-0"));
        if (checkBox1.isSelected()){
            System.out.println("CheckBox1 is not selected, verification has successfully passed.");
        }else {
            System.out.println("CheckBox1 is selected, verification has failed.");
        }
        Thread.sleep(2000);
        driver.quit();


    }
}
