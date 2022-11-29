package Selenium_Java_Practice;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class S53_Lab9 {

    /*
    website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
Test Scenario:

	Go to the above URL.
	Get the current window’s handle and write to the console window.

It must be the first window handle.

	Locate the “Visit W3Schools.com!” link and click it.
	Get all window handles and hold them in a list.
	Write to total window handle number to the console. It must be 2.
	Switch t the second window.

	Get the current window’s handle and write to the console window.

It must be a second window handle.

	Check the upper left side logo in the second window.
	Go back (Switch) to the first window.

	Get the current window’s handle and write to the console window.

It must be the first window handle.

	Check the See Run Button Text. It must contain “Run >” text.
 */

    public class lab09 {
        WebDriver driver;

        @BeforeMethod
        public void setup() {
            driver = WebDriverUtil.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
            driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");

        }

        @AfterMethod
        public void closing() {
            BrowserUtils.wait(2);
            // driver.close();
        }

        @Test
        public void TC1() {
            String currentWindow = driver.getWindowHandle();
            System.out.println("currentWindow = " + currentWindow);
            System.out.println("currentTitle " + driver.getTitle());
            driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']")).click();

            Set<String> allWindow = driver.getWindowHandles();
            List<String> windowList = new ArrayList<>();
            for (String eachWindow : allWindow) {
                windowList.add(eachWindow);
                driver.switchTo().window(eachWindow);
                System.out.println("currentTitle " + driver.getTitle());
            }

            System.out.println(windowList.size());
            driver.switchTo().window(windowList.get(1));
            System.out.println("currentTitle " + driver.getTitle());
            System.out.println("currentWindow = " + currentWindow);

            System.out.println(driver.findElement(By.xpath("//a[@title='Home']")).getText());

            driver.switchTo().window(windowList.get(0));
            System.out.println(driver.getTitle());
            System.out.println(currentWindow);

            String expectedText = "Run >";
            String actualText = driver.findElement(By.id("runbtn")).getText();
            if (actualText.contains(expectedText)) {
                System.out.println("Verification has been passed");
            } else {
                System.out.println("Verification has been passed");
            }
            System.out.println("expectedText = " + expectedText);
            System.out.println("actualText = " + actualText);
        }
    }
}
