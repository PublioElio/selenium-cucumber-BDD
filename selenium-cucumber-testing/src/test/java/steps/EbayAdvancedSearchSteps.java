package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.pages.PageAdvancedSearch;

public class EbayAdvancedSearchSteps {
    private final WebDriver driver;
    private final PageAdvancedSearch pageAdvancedSearch;

    public EbayAdvancedSearchSteps() {
        driver = CommonSteps.getDriver();
        pageAdvancedSearch = new PageAdvancedSearch(driver);
    }
    @When("I click on the Ebay Logo")
    public void i_click_on_the_ebay_logo() {
        pageAdvancedSearch.ebayLogo.click();
    }

    @When("I advanced search for an item")
    public void i_advanced_search_for_an_item(DataTable dataTable) {
        pageAdvancedSearch.searchInput.sendKeys(dataTable.cell(1, 0));
        pageAdvancedSearch.excludeWordsInput.sendKeys(dataTable.cell(1, 1));
        pageAdvancedSearch.minPriceInput.sendKeys(dataTable.cell(1, 2));
        pageAdvancedSearch.maxPriceInput.sendKeys(dataTable.cell(1, 3));
        pageAdvancedSearch.searchButton.click();
    }

}
