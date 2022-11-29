package Selenium_Java_Practice;

import code.base.TestBase2;
import code.utilities.BrowserUtils;
import code.utilities.DriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S55_Lab11 {
    // Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
    // Enter Any Customer id //After entering the customer ID, Click on the “Submit” button.
    // Reject/accept the alert.

    // Task 2:
    // Go to http://the-internet.herokuapp.com/hovers
    // Move mouse to third image(you may use move to element method in actions)
    // verify text of image present on the screen
    public class lab11 extends TestBase2 {
        Actions actions;

        @Test
        public void TC() {
            String cusId = "45879823";
            DriverUtil.getDriver().get("http://demo.guru99.com/test/delete_customer.php");
            DriverUtil.getDriver().findElement(By.name("cusid")).sendKeys(cusId);
            DriverUtil.getDriver().findElement(By.name("submit")).click();
            BrowserUtils.wait(4);
            Alert alert = DriverUtil.getDriver().switchTo().alert();
            BrowserUtils.wait(4);
            System.out.println(alert.getText());
            alert.accept();
            BrowserUtils.wait(4);
            // Alert alert1=DriverUtil.getDriver().switchTo().a  //NO GO!
            DriverUtil.getDriver().switchTo().alert().accept(); //NO GO!

        }

        @Test
        public void TC2() {
            DriverUtil.getDriver().get("http://the-internet.herokuapp.com/hovers");
            actions = new Actions(DriverUtil.getDriver());
            WebElement element = DriverUtil.getDriver().findElement(By.xpath("//div[@class='example']//div[3]//img"));
            actions.moveToElement(element).perform();
            String ActualText = DriverUtil.getDriver().findElement(By.xpath("//h5[text()='name: user3']")).getText();
            String ExpectedText = "name: user3";
            Assert.assertEquals(ActualText, ExpectedText, "verification failed");
            System.out.println("ActualText is = " + ActualText + " verification passed");
        }
    }
}
