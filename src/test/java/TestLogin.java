import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.zip.Adler32;

import static java.lang.Thread.sleep;


public class TestLogin {
    WebDriver driver;
    LoginPage loginPage;
    MainPage mainPage;
    AdministrationPage administrationPage;

    private static String ADMIN_LOGIN = "administrator@testarena.pl";
    private static String ADMIN_PASSWORD = "sumXQQ72$L";
    private static String ADMIN_WRONG_PASSWORD = "summXQQ72$L";
    private static String baseURL = "http://demo.testarena.pl";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/negativeone/Desktop/vistula_seleinum/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");
        driver = new ChromeDriver(options);
        driver.get(baseURL);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        administrationPage = PageFactory.initElements(driver, AdministrationPage.class);
    }

    @Test
    public void loginToTestArena() {
        loginPage.loginAs(ADMIN_LOGIN, ADMIN_PASSWORD);
        assert mainPage.isAvatarIsDisplayed() : "Cannot login to TestArena";
    }

    @Test
    public void loginWithWrongPassword() {
        loginPage.loginAs(ADMIN_LOGIN, ADMIN_WRONG_PASSWORD);
        assert loginPage.IsErrorDisplayed() : "Login to TestArena is possible with wrong password";
    }

    @Test
    public void isHeaderDisplayedOnAdministrationPage() {
        loginPage.loginAs(ADMIN_LOGIN, ADMIN_PASSWORD);
        assert administrationPage.isProjectHeaderDisplayed() : "Header 'Projekty' is not displayed";
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
