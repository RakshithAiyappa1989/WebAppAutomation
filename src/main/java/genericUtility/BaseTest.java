package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageObjects.Pages;

public class BaseTest {
    public WebDriver driver;

    public FileUtility fileUtility = new FileUtility();

    public WebDriverUtility webDriverUtility = new WebDriverUtility();

    public String BROWSER;

    public String URL;

    @BeforeTest
    public void initialise() throws IOException {
        BROWSER = fileUtility.getPropertyKeyValue("browser");
        URL = fileUtility.getPropertyKeyValue("url");
    }

    @BeforeClass
    public void openBrowser() throws IOException {
        if (BROWSER.equals("chrome")) {
            System.setProperty(fileUtility.getPropertyKeyValue("chromedriver"), "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (BROWSER.equals("firefox")) {
            System.setProperty(fileUtility.getPropertyKeyValue("geckodriver"), "src/main/resources/geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            options.setAcceptInsecureCerts(true);
            driver = new FirefoxDriver();

        } else {
            System.setProperty(fileUtility.getPropertyKeyValue("chromedriver"), "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        System.out.println("The browser is: " + BROWSER);
        driver.manage().window().maximize();
        Pages.initialisePages(driver);
    }

    @BeforeMethod
    public void openUrl() {
        driver.get(URL);
        webDriverUtility.waitForPageToLoad(driver);
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
