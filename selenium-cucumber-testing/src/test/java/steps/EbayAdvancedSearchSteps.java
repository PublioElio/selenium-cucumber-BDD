package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EbayAdvancedSearchSteps {

    WebDriver driver;

    public EbayAdvancedSearchSteps() {
        driver = CommonSteps.getDriver();
    }

    @Given("I am on the Advanced Search Page")
    public void i_am_on_the_advanced_search_page() {
        driver.get("https://www.ebay.com/sch/ebayadvsearch");
    }
    @When("I click on the Ebay Logo")
    public void i_click_on_the_ebay_logo() {
        driver.findElement(By.xpath("//a[@id='gh-la']")).click();
    }
    @Then("I am taken to the Ebay Home Page")
    public void i_am_taken_to_the_ebay_home_page() {
        String expUrl = "https://www.ebay.com/";
        String actUrl = driver.getCurrentUrl();
        Assert.assertEquals("Url does not match:", expUrl, actUrl);
    }
}
