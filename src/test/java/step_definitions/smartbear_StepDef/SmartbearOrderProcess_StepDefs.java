package step_definitions.smartbear_StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.smartbear_pages.SmartbearLandingPage;
import pages.smartbear_pages.SmartbearLoginPage;
import pages.smartbear_pages.SmartbearOrderPage;
import pages.smartbear_pages.SmartbearViewAllOrderPage;
import utilities.Config;
import utilities.Driver;

public class SmartbearOrderProcess_StepDefs {
    SmartbearLoginPage smartbearLoginPage = new SmartbearLoginPage();
    SmartbearLandingPage smartbearLandingPage = new SmartbearLandingPage();
    SmartbearOrderPage smartbearOrderPage = new SmartbearOrderPage();
    SmartbearViewAllOrderPage smartbearViewAllOrderPage = new SmartbearViewAllOrderPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_SmartBear_Tester_account_and_on_Order_page() {
        Driver.getDriver().get(Config.getProperty("smartbearLoginPageUrl"));
        smartbearLoginPage.smartbearUsername.sendKeys(Config.getProperty("smartbearUsername"));
        smartbearLoginPage.smartbearPassword.sendKeys(Config.getProperty("smartbearPassword"));
        smartbearLoginPage.smartbearLoginButton.click();
        smartbearLandingPage.orderPage.click();
    }

    @Given("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String productDropdownValue) {
        Select productDropdown = new Select(smartbearOrderPage.productDropdown);
        productDropdown.selectByVisibleText(productDropdownValue);
    }

    @Given("User enters {string} to quantity input box")
    public void user_enters_to_quantity_input_box(String quantityValue) {
        smartbearOrderPage.quantityValue.clear();
        smartbearOrderPage.quantityValue.sendKeys(quantityValue);
    }

    @Given("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String customerName) {
        smartbearOrderPage.customerName.sendKeys(customerName);
    }

    @Given("User enters {string} to street")
    public void user_enters_to_street(String streetValue) {
        smartbearOrderPage.streetValue.sendKeys(streetValue);
    }

    @Given("User enters {string} to city")
    public void user_enters_to_city(String cityValue) {
        smartbearOrderPage.cityValue.sendKeys(cityValue);
    }

    @Given("User enters {string} to state")
    public void user_enters_to_state(String stateValue) {
        smartbearOrderPage.stateValue.sendKeys(stateValue);
    }

    @Given("User enters {string} to zip")
    public void user_enters_to_zip(String zipValue) {
        smartbearOrderPage.zipValue.sendKeys(zipValue);
    }

    @Given("User selects {string} as card type")
    public void user_selects_as_card_type(String cardType) {
        if (cardType.equalsIgnoreCase("Visa")) {
            smartbearOrderPage.visaCardType.click();
        } else if (cardType.equalsIgnoreCase("MasterCard")) {
            smartbearOrderPage.masterCardType.click();
        } else if (cardType.equalsIgnoreCase("American Express")) {
            smartbearOrderPage.americanExpressCardType.click();
        } else {
            Assert.assertTrue("Invalid card type", false);
        }
    }

    @Given("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumberInput) {
        smartbearOrderPage.cardNumber.sendKeys(cardNumberInput);
    }

    @Given("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expirationDate) {
        smartbearOrderPage.expirationDate.sendKeys(expirationDate);
    }

    @Given("User clicks process button")
    public void user_clicks_process_button() {
        smartbearOrderPage.processButton.click();
    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expectedValue) {
        smartbearLandingPage.viewAllOrderPage.click();
        Assert.assertEquals(smartbearViewAllOrderPage.newOrderNameCell.getText(),expectedValue);
        }

}
