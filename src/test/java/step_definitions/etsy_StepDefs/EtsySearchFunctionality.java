package step_definitions.etsy_StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.etsy_pages.Etsy_HomePage;
import utilities.Config;
import utilities.Driver;

public class EtsySearchFunctionality {
    Etsy_HomePage etsy_homePage = new Etsy_HomePage();
    @Given("User is on Etsy home page")
    public void user_is_on_Etsy_home_page() {
        Driver.getDriver().get(Config.getProperty("etsyHomePage"));
    }

    @When("User searches for chair")
    public void user_searches_for_chair() {
      etsy_homePage.searchBox.sendKeys("chair" + Keys.ENTER);
    }

    @Then("User should see chair in the title")
    public void user_should_see_chair_in_the_title() {
         String actualTitle = Driver.getDriver().getTitle();
         String expectedTitle = "Chair";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @When("User searches for {string}")
    public void user_searches_for(String searchValue) {
        etsy_homePage.searchBox.sendKeys(searchValue + Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String searchValue){
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = searchValue;
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

}
