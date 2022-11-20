package Selenium_Java_Practice;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class S23_JavaFaker {

    @Test
    public void TC1_javaFaker(){
        //to be able to use the library of javafaker, you need to create instance object from the class

        Faker faker=new Faker();
        System.out.println("name: "+ faker.name().fullName());
        System.out.println("first name: "+faker.name().firstName());
        System.out.println(faker.address().cityName());
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.lordOfTheRings().location());
        System.out.println(faker.artist().name());
        System.out.println(faker.avatar().image());
    }
}
