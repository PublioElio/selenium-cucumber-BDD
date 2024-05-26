package page_objects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAdvancedSearch {

    WebDriver driver;
    @FindBy(xpath = "//a[@id='gh-la']") public WebElement ebayLogo;
    @FindBy(xpath = "//input[@id='_nkw']") public WebElement searchInput;
    @FindBy(xpath = "//input[@id='_ex_kw']") public WebElement excludeWordsInput;
    @FindBy(xpath = "//input[@name='_udlo']") public WebElement minPriceInput;
    @FindBy(xpath = "//input[@name='_udhi']") public WebElement maxPriceInput;
    @FindBy(xpath = "//button[contains(@data-marko, 's0-1-17-11')]") public WebElement searchButton;

    public PageAdvancedSearch(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
