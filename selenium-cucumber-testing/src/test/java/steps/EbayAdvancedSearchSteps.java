package steps;

import actions.pages.ActionsCommon;
import actions.pages.ActionsPageAdvSearch;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class EbayAdvancedSearchSteps {
    private final ActionsCommon actionsCommon;
    private final ActionsPageAdvSearch actionsPageAdvSearch;

    public EbayAdvancedSearchSteps(ActionsCommon actionsCommon,
                                   ActionsPageAdvSearch actionsPageAdvSearch) {
        this.actionsCommon = actionsCommon;
        this.actionsPageAdvSearch = actionsPageAdvSearch;
    }

    @When("I click on the Ebay Logo")
    public void i_click_on_the_ebay_logo() {
        actionsPageAdvSearch.clickOnEbayLogo();
    }

    @When("I advanced search for an item")
    public void i_advanced_search_for_an_item(DataTable dataTable) {
        actionsPageAdvSearch.enterSearchText(dataTable.cell(1, 0));
        actionsPageAdvSearch.enterExcludeWords(dataTable.cell(1, 1));
        actionsPageAdvSearch.enterMinPrice(dataTable.cell(1, 2));
        actionsPageAdvSearch.enterMaxPrice(dataTable.cell(1, 3));
        actionsPageAdvSearch.clickOnSearchButton();
    }

}
