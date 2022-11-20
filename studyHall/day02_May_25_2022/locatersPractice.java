package code.studyHall.day02_May_25_2022;

import code.utilities.WebDriverUtil;
import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class locatersPractice {
    @Test(priority = 1)
    public void TC_1(){
        //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected
        WebDriverManager.chromedriver().setup();
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://demo.guru99.com/test/radio.html");

        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement each:checkBoxes){
            if (!each.isSelected()){

                System.out.println(each.getAttribute("value")+" is not selected");
            }else {
                System.out.println(each.getAttribute("value")+" is selected");
            }
        }

    }

    @Test
    public void TC_2(){
        //Go to Amazon
//enter Desk in search box
//Then search for desks
      //  (Use this task with TestNG framework)
        WebDriverManager.chromedriver().setup();
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://demo.guru99.com/test/radio.html");

    }

    @Test
    public void Testing()  {
        WebDriverManager.chromedriver().setup();
        WebDriver shopping =new ChromeDriver();
        shopping.get("https://www.amazon.com/");
        shopping.findElement(By.id("twotabsearchtextbox")).sendKeys("Desks");
        shopping.findElement(By.id("nav-search-submit-button")).click();

        String expectedTitle="Desks";
        String actualTitle=shopping.getTitle();

        System.out.println(actualTitle+" is the actual title"+ expectedTitle +" is expected title");
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
}
