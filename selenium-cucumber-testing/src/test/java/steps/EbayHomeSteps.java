package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EbayHomeSteps {
    WebDriver driver;

    public EbayHomeSteps() {
        driver = CommonSteps.getDriver();
    }

    @Given("I am on this page {string}")
    public void i_am_on_this_page(String url) {
        driver.get(url);
    }

    @When("I click on the Advanced Search link")
    public void i_click_on_the_advanced_search_link() {
        driver.findElement(By.xpath("//*[@id='gh-as-a']")).click();
    }

    @Then("I should see this page {string}")
    public void i_should_see_this_page(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("Urls do not match", expectedUrl, actualUrl);
    }

    @When("I search for {string}")
    public void i_search_for(String item) {
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(item);
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
    }

    @Then("I should see at least {int} items count")
    public void i_should_see_at_least_items_count(int count) {
        String countText = driver.findElement(
                By.xpath("//h1[@class='srp-controls__count-heading']/span[@class='BOLD'][1]")).getText();
        Assert.assertTrue("Count is less than " + count + " items count",
                Integer.parseInt(countText.replaceAll(",", "")) >= count);
    }

    @When("I search for {string} on the category {string}")
    public void i_search_for_on_the_category(String item, String category) {
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(item);
        driver.findElement(By.xpath("//select[@id='gh-cat']")).sendKeys(category);
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
    }

    @When("I click on the {string}")
    public void i_click_on_the(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
    @Then("I validate the page is {string} and the title is {string}")
    public void i_validate_the_page_is_and_the_title_is(String url, String pageTitle) {
        String actualUrl = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Urls do not match", url, actualUrl);
        Assert.assertEquals("Titles do not match", pageTitle, actualTitle);
    }

}


