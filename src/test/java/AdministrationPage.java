import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

public class AdministrationPage {
    String PROJECT_HEADER = "Projekty";

    @FindBy(className = "header_admin")
    WebElement adminButton;
    @FindBy(className = "content_title")
    WebElement projectsHeader;

    private String getProjectsHeader() {
        return projectsHeader.getText();
    }

    public boolean isProjectHeaderDisplayed(){
        adminButton.click();
        return getProjectsHeader().equals(PROJECT_HEADER);
    }
}
