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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gh-as-a']")));
        driver.findElement(By.xpath("//*[@id='gh-as-a']")).click();
    }

    @Then("I should see the Advanced Search page")
    public void i_should_see_the_advanced_search_page() {
        String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
        String actUrl = driver.getCurrentUrl();
        Assert.assertEquals("Url does not match", expUrl, actUrl);
    }

}


