package actions.pages;

import elements.pages.ElementsPageHome;
import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

public class ActionsPageHome {

    private final WebDriver driver;
    private final ElementsPageHome elementsPageHome;

    public ActionsPageHome(CommonSteps commonSteps) {
        driver = CommonSteps.getDriver();
        elementsPageHome = new ElementsPageHome(commonSteps);
    }

    public void clickOnAdvancedLink() {
        elementsPageHome.advancedSearchLink.click();
    }

    public void searchForAnItem(String item) {
        elementsPageHome.searchInput.sendKeys(item);
    }

    public void selectSearchCategory(String category) {
        elementsPageHome.categoryDropdown.sendKeys(category);
    }

    public void clickOnSearchButton() {
        elementsPageHome.searchButton.click();
    }

    public int getSearchItemsCount() {
        String countText = elementsPageHome.itemsCount.getText();
        return Integer.parseInt(countText.replaceAll(",", ""));
    }
}
