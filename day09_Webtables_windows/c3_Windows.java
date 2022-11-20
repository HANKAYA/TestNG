//package code.day09_Webtables_windows;
//
//import code.base.TestBase;
//import code.utilities.BrowserUtils;
//<<<<<<< HEAD
//import com.sun.org.apache.bcel.internal.generic.NEW;
//=======
//>>>>>>> da30bc3f139fb838d73bbeba704174c35cca2aff
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//
//public class c3_Windows extends TestBase {
//<<<<<<< HEAD
//    @Test
//    public void TC1_MultiWindows(){
//        driver.get("https://renas-practice.herokuapp.com/home");
//        driver.findElement(By.id("selenium-Elements")).click();
//        // Click on Windows
//        BrowserUtils.wait(4); // Let's wait a little bit before click....
//        driver.findElement(By.id("WindowsII")).click();
//        // This will store current and only one window
//        String currentWindow=driver.getWindowHandle();
//        System.out.println("current window"+driver.getTitle());
//        WebElement openWindowButton=driver.findElement(By.id("open-window"));
//        openWindowButton.click();
//        BrowserUtils.wait(5);
//        // Change focus of selenium on second window
//
//        Set<String> allWindows=driver.getWindowHandles(); // Store all windows
//=======
//
//    @Test
//    public void TC1_MultiWindows(){
//        driver.get("https://renas-practice.herokuapp.com/home");
//        //click on elements
//        driver.findElement(By.id("selenium-Elements")).click();
//        //click on windows
//        BrowserUtils.wait(4);
//        driver.findElement(By.id("WindowsII")).click();
//
//        //this will store current and only one window
//        String currentWindow= driver.getWindowHandle();
//
//        System.out.println("current window= "+currentWindow);
//        System.out.println("current title= "+driver.getTitle());
//        WebElement openWindowButton=driver.findElement(By.id("open-window"));
//        openWindowButton.click();
//
//        //after clicking, now we have 2 windows,
//        // in order to work on second window, change focus of selenium on second window
//
//        Set<String> allWindows= driver.getWindowHandles(); //store all windows
//>>>>>>> da30bc3f139fb838d73bbeba704174c35cca2aff
//        List<String> windowList=new ArrayList<>();
//        for(String NewWindow:allWindows){
//            windowList.add(NewWindow);
//            driver.switchTo().window(NewWindow);
//<<<<<<< HEAD
//            System.out.println("Current title is: "+driver.getTitle());
//        }
//        driver.switchTo().window(windowList.get(1));
//        System.out.println(driver.getTitle());
//    }
//
//=======
//            System.out.println("current title is: "+driver.getTitle());
//
//        }
//
//        //another method to switch windows
//        driver.switchTo().window(windowList.get(1));
//        System.out.println(driver.getTitle());
//    }
//>>>>>>> da30bc3f139fb838d73bbeba704174c35cca2aff
//}
