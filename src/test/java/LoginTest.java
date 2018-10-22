import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.security.Key;

public class LoginTest {
    WebDriver driver;


    @Test
    public void shouldLoginToTestArena() {
        System.setProperty("webdriver.chrome.driver", "/Users/negativeone/Desktop/vistula_seleinum/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");
        driver = new ChromeDriver(options);
        driver.get("https://google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.click();
        searchInput.sendKeys("Cat");
        searchInput.sendKeys(Keys.RETURN);
        driver.findElement(By.linkText("Grafika")).click();
        driver.quit();
    }
}
