//package code.day09_Webtables_windows;
//
//import code.base.TestBase;
//import code.utilities.BrowserUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import java.util.Set;
//
//public class c2_Tabs extends TestBase {
//<<<<<<< HEAD
//
//    // oop concept inheritance method
//
//    @Test
//    public void TC1_TabHandle(){
//
//        // Navigate to https://renas-practice.herokuapp.com/home
//
//        driver.get("https://renas-practice.herokuapp.com/home ");
//
//        // Click on Elements
//
//        driver.findElement(By.id("selenium-Elements")).click();
//
//        // Click on Windows
//
//
//        BrowserUtils.wait(4); // Let's wait a little bit before click....
//        driver.findElement(By.id("WindowsII")).click();
//
//        // This will store current and only one window
//        String currentWindow=driver.getWindowHandle();
//        System.out.println("current window"+driver.getTitle());
//=======
//    //oop concept, inheritance method
//
//
//    @Test
//    public void TC1_TabHandle(){
//        //navigate to https://renas-practice.herokuapp.com/home
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
//>>>>>>> da30bc3f139fb838d73bbeba704174c35cca2aff
//
//        WebElement openTabButton=driver.findElement(By.id("open-tab"));
//        openTabButton.click();
//
//<<<<<<< HEAD
//        System.out.println("The current title "+driver.getTitle());
//        Set<String> allTabs=driver.getWindowHandles(); // This will store all tabs
//        for (String tab:allTabs){
//            driver.switchTo().window(tab);
//            BrowserUtils.wait(5);
//            System.out.println(driver.getTitle());
//        }
//
//=======
//        System.out.println("The current title"+driver.getTitle());
//
//        Set<String> allTabs=driver.getWindowHandles();//this will store all tabs
//        for(String tab:allTabs){
//            driver.switchTo().window(tab);
//            BrowserUtils.wait(2);
//            System.out.println(driver.getTitle());
//        }
//>>>>>>> da30bc3f139fb838d73bbeba704174c35cca2aff
//    }
//}
