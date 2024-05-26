package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EbayAdvancedSearchSteps {

    WebDriver driver;

    public EbayAdvancedSearchSteps() {
        driver = CommonSteps.getDriver();
    }
    @When("I click on the Ebay Logo")
    public void i_click_on_the_ebay_logo() {
        driver.findElement(By.xpath("//a[@id='gh-la']")).click();
    }

    @When("I advanced search for an item")
    public void i_advanced_search_for_an_item(DataTable dataTable) {
        driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1, 0));
        driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(dataTable.cell(1, 1));
        driver.findElement(By.xpath("//input[@name='_udlo']")).sendKeys(dataTable.cell(1, 2));
        driver.findElement(By.xpath("//input[@name='_udhi']")).sendKeys(dataTable.cell(1, 3));
        driver.findElement(By.xpath("//button[contains(@data-marko, 's0-1-17-11')]")).click();
    }

}
