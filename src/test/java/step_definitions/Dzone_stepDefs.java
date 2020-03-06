package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.Driver;
import utilities.Log;
import utilities.TempStorage;

public class Dzone_stepDefs {
    @Given("user is on {string}")
    public void user_is_on(String url) {
        Driver.getDriver().get(url);
        Log.info("user is on: " + url);
    }

    @Then("user gets the header of the page")
    public void user_gets_the_header_of_the_page() {
        TempStorage.addData("test1", Driver.getDriver().findElement(By.xpath("//h1")).getText());
        Log.info("Header 1 is taken");
    }

    @Then("user gets the header of this page")
    public void user_gets_the_header_of_this_page() {
        TempStorage.addData("test2", Driver.getDriver().findElement(By.xpath("//h1")).getText());
        Log.info("Header 2 is taken");
    }

    @Then("user should be able to compare the headers")
    public void user_should_be_able_to_compare_the_headers() {
        Assert.assertEquals(TempStorage.getData("test1"), TempStorage.getData("test2"));
        Log.warn("Comparison");
    }
}
