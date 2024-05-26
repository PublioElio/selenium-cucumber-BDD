package elements.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.CommonSteps;

public class ElementsPageHome {
    public WebDriver driver;
    @FindBy(xpath = "//*[@id='gh-as-a']") public WebElement advancedSearchLink;
    @FindBy(xpath = "//input[@id='gh-ac']") public WebElement searchInput;
    @FindBy(xpath = "//select[@id='gh-cat']") public WebElement categoryDropdown;
    @FindBy(xpath = "//input[@id='gh-btn']") public WebElement searchButton;
    @FindBy(xpath = "//h1[@class='srp-controls__count-heading']/span[@class='BOLD'][1]") public WebElement itemsCount;

    public ElementsPageHome(CommonSteps commonSteps) {
        this.driver = CommonSteps.getDriver();
        PageFactory.initElements(driver, this);
    }
}
