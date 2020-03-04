package pages.smartbear_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartbearViewAllOrderPage {
    public SmartbearViewAllOrderPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//table[@id = 'ctl00_MainContent_orderGrid']/tbody/tr[2]/td[2]")
    public WebElement newOrderNameCell;
}