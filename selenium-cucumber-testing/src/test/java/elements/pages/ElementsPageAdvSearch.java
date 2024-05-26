package elements.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.CommonSteps;

public class ElementsPageAdvSearch {
    public WebDriver driver;
    @FindBy(xpath = "//a[@id='gh-la']") public WebElement ebayLogo;
    @FindBy(xpath = "//input[@id='_nkw']") public WebElement searchInput;
    @FindBy(xpath = "//input[@id='_ex_kw']") public WebElement excludeWordsInput;
    @FindBy(xpath = "//input[@name='_udlo']") public WebElement minPriceInput;
    @FindBy(xpath = "//input[@name='_udhi']") public WebElement maxPriceInput;
    @FindBy(xpath = "//button[contains(@data-marko, 's0-1-17-11')]") public WebElement searchButton;

    public ElementsPageAdvSearch(CommonSteps commonSteps) {
        this.driver = CommonSteps.getDriver();
        PageFactory.initElements(driver, this);
    }

}
