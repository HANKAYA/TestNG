//package code.day11_actions;
//
//import code.base.TestBase2;
//import code.utilities.BrowserUtils;
//import code.utilities.DriverUtil;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
//
//public class c4_Action extends TestBase2 {
//    //go to http://demo.guru99.com/test/simple_context_menu.html
//    //double click to double click button
//    //then accept the alert that pops up
//
//<<<<<<< HEAD
//    Actions actions;
//=======
//Actions actions;
//>>>>>>> da30bc3f139fb838d73bbeba704174c35cca2aff
//
//    @Test
//    public void TC1_doubleClick(){
//        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
//
//        WebElement doubleClickButton=DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
//        actions=new Actions(DriverUtil.getDriver());
//        //double click to double click button
//        actions.doubleClick(doubleClickButton).perform();
//        //then accept the alert that pops up
//        Alert alert=DriverUtil.getDriver().switchTo().alert();
//        BrowserUtils.wait(3);
//        alert.accept();
//
//
//    }
//    @Test
//    public void TC2_rightClick(){
//<<<<<<< HEAD
//        //go to http://demo.guru99.com/test/simple_context_menu.html
//=======
//         //go to http://demo.guru99.com/test/simple_context_menu.html
//>>>>>>> da30bc3f139fb838d73bbeba704174c35cca2aff
//        //right click to right click button
//        //then click on edit button
//        //then accept the alert that pops up
//
//        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
//        WebElement rightClickButton=DriverUtil.getDriver().findElement(By.xpath("//span[.='right click me']"));
//        //right click to right click button
//        actions=new Actions(DriverUtil.getDriver());
//        actions.contextClick(rightClickButton).perform();
//        //then click on edit button
//        BrowserUtils.wait(2);
//        DriverUtil.getDriver().findElement(By.xpath("//span[.='Edit']")).click();
//        Alert alert=DriverUtil.getDriver().switchTo().alert();
//        BrowserUtils.wait(3);
//        alert.accept();
//
//    }
//
//    @Test
//    public void TC3DragDrop(){
////go to http://demo.guru99.com/test/drag_drop.html
//        DriverUtil.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
//        WebElement dragFrom=DriverUtil.getDriver().findElement(By.id("credit2"));
//        WebElement dropTo=DriverUtil.getDriver().findElement(By.xpath("//ol[@id='bank']/li"));
//
//        actions=new Actions(DriverUtil.getDriver());
//        actions.dragAndDrop(dragFrom,dropTo).perform();
//
//        //then drag 5000 to debit-amount section and drop it
//        //2 things needs to be done here
//        //first specify location of drag
//        //second specify location of drop
//
//        WebElement dragFrom2=DriverUtil.getDriver().findElement(By.id("fourth"));
//        WebElement dropTo2=DriverUtil.getDriver().findElement(By.xpath("//ol[@id='amt7']/li"));
//
//        actions=new Actions(DriverUtil.getDriver());
//        actions.dragAndDrop(dragFrom2,dropTo2).perform();
//
//    }
//<<<<<<< HEAD
//=======
//
//
//>>>>>>> da30bc3f139fb838d73bbeba704174c35cca2aff
//}
