package code.studyHall.Day05_June_02_2022;

import org.openqa.selenium.WebElement;

import java.util.List;

public class cheapFlightsUtil {

    public static WebElement chooseTripType(List<WebElement> chooseTrip, String keyword){
        WebElement returnElement = null;
        for (WebElement each : chooseTrip){
            if(each.getAttribute("aria-label").contains(keyword)){

                returnElement=each;
            }
        }
        return returnElement;
    }
}
