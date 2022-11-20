package Selenium_Java_Practice;

import code.base.TestBase2;
import code.utilities.BrowserUtils;
import code.utilities.DriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S40_Actions extends TestBase2 {
    // Go to http://demo.guru99.com/test/simple_context_menu.html --> Double click to double-click button
    // Then accept the alert that pops up

    Actions actions;

    @Test
    public void TC1_DoubleClick (){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement doubleClickButton= DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
        actions= new Actions(DriverUtil.getDriver());
        // Double click to double button
        actions.doubleClick(doubleClickButton).perform();
        // Then accept the alert that pops up
        Alert alert= DriverUtil.getDriver().switchTo().alert();
        BrowserUtils.wait(4);
        alert.accept();
    }
    @Test
    public void TC2_rightClick (){
        // Go to http://demo.guru99.com/test/simple_context_menu.html -> Right click to right-click button
        // Then click on edit button -> Then accept the alert that pops up
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClickButton= DriverUtil.getDriver().findElement(By.xpath("//span[.='right click me']"));
        // Right click to right button
        actions= new Actions(DriverUtil.getDriver());
        // Then click on edit button
        BrowserUtils.wait(2);
        DriverUtil.getDriver().findElement(By.xpath("//span[.='Edit']")).click();
        Alert alert= DriverUtil.getDriver().switchTo().alert();
        BrowserUtils.wait(3);
        alert.accept();
    }
    @Test
    public void TC3DragDrop() {
        // Go to http://demo.guru99.com/test/drag_drop.html
        DriverUtil.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
        WebElement dragFrom = DriverUtil.getDriver().findElement(By.id("credit2"));
        WebElement dropTo = DriverUtil.getDriver().findElement(By.xpath("//ol[@id='bank']/li"));

        actions = new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(dragFrom, dropTo).perform();

        //then drag 5000 to debit-amount section and drop it
        //2 things needs to be done here
        //first specify location of drag
        //second specify location of drop

        WebElement dragFrom2 = DriverUtil.getDriver().findElement(By.id("fourth"));
        WebElement dropTo2 = DriverUtil.getDriver().findElement(By.xpath("//ol[@id='amt7']/li"));

        actions = new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(dragFrom2, dropTo2).perform();

    }
}
