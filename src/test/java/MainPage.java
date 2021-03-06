import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    @FindBy(className = "avatar_header")
    WebElement avatarHeader;
    @FindBy(className = "header_admin")
    WebElement adminButton;


    public Boolean isAvatarIsDisplayed() {
        return avatarHeader.isDisplayed();
    }

    public void enterAdminPage(){
        adminButton.click();
    }
}

