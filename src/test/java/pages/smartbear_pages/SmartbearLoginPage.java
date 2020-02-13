package pages.smartbear_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartbearLoginPage {
    public SmartbearLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy (id = "ctl00_MainContent_username")
        public WebElement smartbearUsername;

        @FindBy (id = "ctl00_MainContent_password")
        public WebElement smartbearPassword;

        @FindBy (id = "ctl00_MainContent_login_button")
        public WebElement smartbearLoginButton;

        @FindBy (xpath = "//div[@class = 'login_info']")
        public WebElement smartbearWelcomeText;

        @FindBy (id = "ctl00_MainContent_status")
        public WebElement wrongCredentialMessage;
}
