package actions.pages;

import elements.pages.ElementsPageAdvSearch;
import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

public class ActionsPageAdvSearch {

    private final WebDriver driver;
    private final ElementsPageAdvSearch elementsPageAdvSearch;
    public ActionsPageAdvSearch(CommonSteps commonSteps) {
        this.driver = CommonSteps.getDriver();
        elementsPageAdvSearch = new ElementsPageAdvSearch(commonSteps);
    }

    public void clickOnEbayLogo() {
        elementsPageAdvSearch.ebayLogo.click();
    }

    public void enterSearchText(String text){
        elementsPageAdvSearch.searchInput.sendKeys(text);
    }

    public void enterExcludeWords(String text){
        elementsPageAdvSearch.excludeWordsInput.sendKeys(text);
    }

    public void enterMinPrice(String text){
        elementsPageAdvSearch.minPriceInput.sendKeys(text);
    }

    public void enterMaxPrice(String text){
        elementsPageAdvSearch.maxPriceInput.sendKeys(text);
    }

    public void clickOnSearchButton(){
        elementsPageAdvSearch.searchButton.click();
    }
}
