package step_definitions.wiki_StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.wiki_pages.WikiSearchPage;
import utilities.Config;
import utilities.Driver;

public class WikiSearchFunctionality {
    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_Wikipedia_home_page() {
        Driver.getDriver().get(Config.getProperty("wikiURL"));
    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchValue) {
        wikiSearchPage.searchBox.sendKeys(searchValue);
    }

    @When("User clicks on wiki search button")
    public void user_clicks_on_wiki_search_button() {
        wikiSearchPage.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String searchValue) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = searchValue + " - Wikipedia";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String searchValue) {
        Assert.assertEquals(searchValue, wikiSearchPage.firstHeading.getText());
    }

    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String searchValue) {
        Assert.assertEquals(searchValue, wikiSearchPage.pictureHeading.getText());
    }
}
