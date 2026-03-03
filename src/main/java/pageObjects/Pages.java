package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.pages.FormPage;


public class Pages {
    public static FormPage formPage;

    public static void initialisePages(WebDriver driver) {
        System.out.println("Initializing Pages");
        formPage = PageFactory.initElements(driver, FormPage.class);
    }
}
