package Selenium_Java_Practice;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class S14_RadioButtons {

    // Navigate to https://courses.letskodeit.com/practice
    // click on BMW RADIO button
    // verify that its selected

    WebDriver driver= WebDriverUtil.getDriver("chrome");

    public void setDriver(WebDriver driver) {
        this.driver = driver;
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Click on BMW RADIO button
        WebElement BMWRadioButton=driver.findElement(By.xpath("//input[@id='bmwradio']"));
        BMWRadioButton.click();
        // verify that BMW radio button is selected
        boolean bmwRadioSelected=BMWRadioButton.isSelected();
        if(bmwRadioSelected){
            System.out.println("BMW is selected and verification has passed");
        }else {
            System.out.println("BMW is not selected and verification has failed");
        }
        //Verify that Honda is not selected
        WebElement HondaRadioButton=driver.findElement(By.id("hondaradio"));
        if(!HondaRadioButton.isSelected()){
            System.out.println("Honda is not selected and verification has passed");
        }else {
            System.out.println("Honda is selected and verification has failed");
        }

    }

}
