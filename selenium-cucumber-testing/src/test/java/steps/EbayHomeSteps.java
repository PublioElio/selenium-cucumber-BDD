package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EbayHomeSteps {
    WebDriver driver;

    public EbayHomeSteps() {
        driver = CommonSteps.getDriver();
    }

    @Given("I am on Ebay home page")
    public void i_am_on_ebay_home_page() {
        driver.get("https://www.ebay.com/");
    }

    @When("I click on the Advanced Search link")
    public void i_click_on_the_advanced_search_link() {
        driver.findElement(By.xpath("//*[@id='gh-as-a']")).click();
    }

    @Then("I should see the Advanced Search page")
    public void i_should_see_the_advanced_search_page() {
        String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
        String actUrl = driver.getCurrentUrl();
        Assert.assertEquals("Url does not match", expUrl, actUrl);
    }

    @When("I search for iphone")
    public void i_search_for_iphone() {
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("iphone");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
    }

    @Then("I should see at least 1000 items count")
    public void i_should_see_at_least_items_count() {
        String countText = driver.findElement(
                By.xpath("//h1[@class='srp-controls__count-heading']/span[@class='BOLD'][1]")).getText();
        Assert.assertTrue("Count is less than 1000",
                Integer.parseInt(countText.replaceAll(",", "")) >= 1000);
    }

}


