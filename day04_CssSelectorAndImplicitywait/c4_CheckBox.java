package code.day04_CssSelectorAndImplicitywait;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class c4_CheckBox {
    //1. Open Chrome browser
    //2. Go to https://demo.guru99.com/test/radio.html
    //3. Verify checkbox1 is not selected
    //4. Click to checkbox2
    //5. Verify checkbox2 is selected

    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        //2. Go to https://demo.guru99.com/test/radio.html
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/radio.html");
        //3. Verify checkbox1 is not selected
        WebElement checkBox1=driver.findElement(By.id("vfb-6-0"));

        if(!checkBox1.isSelected()){
            System.out.println("checkBox1 is not selected, verification has passed");
        }else {
            System.out.println("checkBox1 is selected, verification has failed");
        }


        //4. Click to checkbox2
        WebElement checkBox2=driver.findElement(By.id("vfb-6-1"));
        checkBox2.click();
        if(checkBox2.isSelected()){
            System.out.println("Check box2 verification has passed");
        }else {
            System.out.println("Check box2 verification has failed");
        }
        Thread.sleep(2000);
        driver.quit();

    }


}