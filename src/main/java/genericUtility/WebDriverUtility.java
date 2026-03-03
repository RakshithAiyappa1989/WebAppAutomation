package genericUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverUtility {
    public void waitForPageToLoad(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void typeText(WebElement element, String keysToSend) {
        element.sendKeys(keysToSend);
    }

    public void select(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void select(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectCheckbox(WebDriver driver, String text) {
        WebElement checkbox = driver.findElement(By.xpath("//*[text()='" + text + "']"));
        checkbox.click();
    }

    public void mouseOverOnElement(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void rightClickOnElement(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.contextClick(element).perform();
    }
}
