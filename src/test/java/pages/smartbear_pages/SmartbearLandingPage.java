package pages.smartbear_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartbearLandingPage {
   public SmartbearLandingPage(){
       PageFactory.initElements(Driver.getDriver(), this);
    }
   @FindBy (linkText = "Order")
    public WebElement orderPage;
   @FindBy(linkText = "View all orders")
    public WebElement viewAllOrderPage;
}
