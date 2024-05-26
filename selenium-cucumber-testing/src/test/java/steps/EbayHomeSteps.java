package steps;

import actions.pages.ActionsCommon;
import actions.pages.ActionsPageHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class EbayHomeSteps {
    private final ActionsCommon actionsCommon;
    private final ActionsPageHome actionsPageHome;

    public EbayHomeSteps(ActionsCommon actionsCommon, ActionsPageHome actionsPageHome) {
        this.actionsCommon = actionsCommon;
        this.actionsPageHome = actionsPageHome;
    }

    @Given("I am on this page {string}")
    public void i_am_on_this_page(String url) {
        actionsCommon.navigateTo(url);
    }

    @When("I click on the Advanced Search link")
    public void i_click_on_the_advanced_search_link() {
        actionsPageHome.clickOnAdvancedLink();
    }

    @Then("I should see this page {string}")
    public void i_should_see_this_page(String expectedUrl) {
        String actualUrl = actionsCommon.getCurrentUrl();
        Assert.assertEquals("Urls do not match", expectedUrl, actualUrl);
    }

    @When("I search for {string}")
    public void i_search_for(String item) {
        actionsPageHome.searchForAnItem(item);
        actionsPageHome.clickOnSearchButton();
    }

    @Then("I should see at least {int} items count")
    public void i_should_see_at_least_items_count(int count) {
        String countText = String.valueOf(actionsPageHome.getSearchItemsCount());
        Assert.assertTrue("Count is less than " + count + " items count",
                Integer.parseInt(countText.replaceAll(",", "")) >= count);
    }

    @When("I search for {string} on the category {string}")
    public void i_search_for_on_the_category(String item, String category) {
        actionsPageHome.searchForAnItem(item);
        actionsPageHome.selectSearchCategory(category);
        actionsPageHome.clickOnSearchButton();
    }

    @When("I click on the {string}")
    public void i_click_on_the(String linkText) {
        actionsCommon.clickLinkByText(linkText);
    }

    @Then("I validate the page is {string} and the title is {string}")
    public void i_validate_the_page_is_and_the_title_is(String url, String pageTitle) {
        String actualUrl = actionsCommon.getCurrentUrl();
        String actualTitle = actionsCommon.getCurrentPageTitle();
        Assert.assertEquals("Urls do not match", url, actualUrl);
        Assert.assertEquals("Titles do not match", pageTitle, actualTitle);
    }

}


