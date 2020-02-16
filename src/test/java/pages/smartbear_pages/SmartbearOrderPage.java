package pages.smartbear_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartbearOrderPage {
    public SmartbearOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productDropdown;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityValue;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetValue;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityValue;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateValue;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipValue;
    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaCardType;
    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_1")
    public WebElement masterCardType;
    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_2")
    public WebElement americanExpressCardType;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expirationDate;
    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;
}
