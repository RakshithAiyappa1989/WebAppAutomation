import genericUtility.BaseTest;
import genericUtility.FileUtility;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.Pages;

import java.io.IOException;

public class formPage extends BaseTest {

    @Test
    public void verifyTextInputs() throws InterruptedException, IOException {
        // Step - 1 -> Text Inputs
        webDriverUtility.typeText(Pages.formPage.inputName, fileUtility.getPropertyKeyValue("fullname"));
        webDriverUtility.typeText(Pages.formPage.inputEmail, fileUtility.getPropertyKeyValue("emailaddress"));
        webDriverUtility.typeText(Pages.formPage.inputPassword, fileUtility.getPropertyKeyValue("password"));
        webDriverUtility.typeText(Pages.formPage.inputPhoneNumber, fileUtility.getPropertyKeyValue("phonenumber"));
        webDriverUtility.typeText(Pages.formPage.inputDateOfBirth, fileUtility.getPropertyKeyValue("dateofbirth"));
        webDriverUtility.typeText(Pages.formPage.inputMessage, fileUtility.getPropertyKeyValue("message"));

        // Step - 2 -> Dropdowns and Select
        webDriverUtility.select(Pages.formPage.selectCountry, fileUtility.getPropertyKeyValue("country"));
        webDriverUtility.select(Pages.formPage.selectLanguage, fileUtility.getPropertyKeyValue("programminglanguage"));
        webDriverUtility.select(Pages.formPage.selectMulti, fileUtility.getPropertyKeyValue("seleniumframework"));
        webDriverUtility.select(Pages.formPage.selectMulti, fileUtility.getPropertyKeyValue("cypressframework"));

        // Step - 3 -> Checkboxes and Radio buttons
        webDriverUtility.selectCheckbox(driver,"Java");
        Thread.sleep(5000);
        System.out.println("First test case completed");
    }
}
