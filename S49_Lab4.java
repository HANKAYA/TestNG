package Selenium_Java_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class S49_Lab4 {

    // 1. Open Chrome browser
    // 2. Go to https://demo.guru99.com/test/radio.html
    // 3. Verify all checkboxes are not selected (you can use find-elements to store in list and use for loop to validate)
    // 4. Click to checkbox3
    // 5. Verify checkbox3 is selected

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");

        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        int count=0;
        for (WebElement each:checkBoxes) {
            if(!each.isSelected()){
                count++;}}
        if(count==checkBoxes.size()){
            System.out.println(checkBoxes.size()+" check boxes are not selected verification has been passed");
        }else {
            System.out.println((checkBoxes.size()-count)+" check box selected verification has been failed");
        }
        checkBoxes.get(2).click();
        if (checkBoxes.get(2).isSelected()){
            System.out.println(" checkbox3 selected verification has been passed");
        }else {
            System.out.println("checkbox3 not selected verification has been failed");

        }
        driver.quit();
    }
}
