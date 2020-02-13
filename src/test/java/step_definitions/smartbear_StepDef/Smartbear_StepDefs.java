package step_definitions.smartbear_StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.smartbear_pages.SmartbearLoginPage;
import utilities.Config;
import utilities.Driver;

public class Smartbear_StepDefs {
    SmartbearLoginPage smartbearLoginPage = new SmartbearLoginPage();
    @Given("user is on the SmartBear login page")
    public void user_is_on_the_SmartBear_login_page() {
        Driver.getDriver().get(Config.getProperty("smartbearLoginPageUrl"));

    }
    @When("user gives the correct username credential")
    public void user_gives_the_correct_username_credential() {
        smartbearLoginPage.smartbearUsername.sendKeys(Config.getProperty("smartbearUsername"));
    }

    @When("user gives the correct password credential")
    public void user_gives_the_correct_password_credential() {
        smartbearLoginPage.smartbearPassword.sendKeys(Config.getProperty("smartbearPassword"));
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        smartbearLoginPage.smartbearLoginButton.click();

    }

    @Then("user should see the welcome text")
    public void user_should_see_the_welcome_text() {
        String expectedWelcomeText = "Welcome, tester!";
        String actualWelcomeText = smartbearLoginPage.smartbearWelcomeText.getText();
        Assert.assertTrue("The actual message does not contain expected message", actualWelcomeText.contains(expectedWelcomeText));
    }

    @When("user gives the wrong password credential")
    public void user_gives_the_wrong_password_credential() {
        smartbearLoginPage.smartbearPassword.sendKeys(Config.getProperty("smartbearWrongPassword"));
    }

    @Then("user should see the appropriate text")
    public void user_should_see_the_appropriate_text() {
        Assert.assertTrue("The wrong credential text is Not displayed!",smartbearLoginPage.wrongCredentialMessage.isDisplayed());

    }



}


