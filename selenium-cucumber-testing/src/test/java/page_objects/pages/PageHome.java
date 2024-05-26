package page_objects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHome {

    @FindBy(xpath = "//*[@id='gh-as-a']") public WebElement advancedSearchLink;
    @FindBy(xpath = "//input[@id='gh-ac']") public WebElement searchInput;
    @FindBy(xpath = "//select[@id='gh-cat']") public WebElement categoryDropdown;
    @FindBy(xpath = "//input[@id='gh-btn']") public WebElement searchButton;
    @FindBy(xpath = "//h1[@class='srp-controls__count-heading']/span[@class='BOLD'][1]") public WebElement itemsCount;

}
