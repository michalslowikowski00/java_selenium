import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicTest {
    WebDriver driver;

    @Test
    public void shouldLoginToTestArena() {
        System.setProperty("webdriver.chrome.driver", "/Users/negativeone/Desktop/vistula_seleinum/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");
        driver = new ChromeDriver(options);
        driver.get("https://google.com");
        driver.quit();
    }
}
