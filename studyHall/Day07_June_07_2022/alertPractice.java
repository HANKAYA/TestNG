package code.studyHall.Day07_June_07_2022;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alertPractice {

    WebDriver driver;
    @Test
    public void TC_1_alertPractice(){
        WebDriverManager.chromedriver().setup();
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        WebElement inputBox=driver.findElement(By.xpath("//input[@name='cusid']"));

        inputBox.sendKeys("libby123" + Keys.ENTER);

        Alert alert= driver.switchTo().alert();
        alert.accept();

        String alertMessage= alert.getText();
        String expectedAlertMessage="1Customer Successfully Delete!";

        alert.accept();
        Assert.assertTrue(alertMessage.contains(expectedAlertMessage));





    }
}
