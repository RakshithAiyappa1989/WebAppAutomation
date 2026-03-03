package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage {
    @FindBy(id = "inp-name")
    public WebElement inputName;

    @FindBy(id = "inp-email")
    public WebElement inputEmail;

    @FindBy(id = "inp-password")
    public WebElement inputPassword;

    @FindBy(id = "inp-number")
    public WebElement inputPhoneNumber;

    @FindBy(id = "inp-date")
    public WebElement inputDateOfBirth;

    @FindBy(id = "inp-textarea")
    public WebElement inputMessage;

    @FindBy(id = "sel-country")
    public WebElement selectCountry;

    @FindBy(id = "sel-language")
    public WebElement selectLanguage;

    @FindBy(id = "sel-multi")
    public WebElement selectMulti;

}
