package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHomeSteps {

    @Given("I am on Ebay home page")
    public void i_am_on_ebay_home_page() {
        System.out.println("I am on Ebay home page");
    }

    @When("I click on the Advanced Search link")
    public void i_click_on_the_advanced_search_link() {
    System.out.println("I click on the Advanced Search link");
    }

    @Then("I should see the Advanced Search page")
    public void i_should_see_the_advanced_search_page() {
        System.out.println("I should see the Advanced Search page");
    }

}


