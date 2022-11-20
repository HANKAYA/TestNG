//package code.day11_actions;
//
//import code.base.TestBase2;
//import code.utilities.BrowserUtils;
//import code.utilities.DriverUtil;
//import code.utilities.PropertiesReadingUtil;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class c1_driverUtilPractice extends TestBase2 {
//    //go to google
//    //search for hello
//    //verify title contains hello
//
//    @Test
//    public void TC1(){
//        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));
//        WebElement searchBox=DriverUtil.getDriver().findElement(By.name("q"));
//<<<<<<< HEAD
//=======
//
//>>>>>>> da30bc3f139fb838d73bbeba704174c35cca2aff
//        String searchItem=PropertiesReadingUtil.getProperties("google_search_data");
//        searchBox.sendKeys(searchItem+ Keys.ENTER);
//
//        BrowserUtils.wait(2);
//        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(searchItem));
//
//
//<<<<<<< HEAD
//    }
//
//=======
//
//
//
//    }
//>>>>>>> da30bc3f139fb838d73bbeba704174c35cca2aff
//}
