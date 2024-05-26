package actions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

public class ActionsCommon {

    private final WebDriver driver;
    private CommonSteps commonSteps;

    public ActionsCommon(CommonSteps commonSteps) {
        this.driver = CommonSteps.getDriver();
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getCurrentPageTitle() {
        return driver.getTitle();
    }

    public void clickLinkByText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public void quitWebDriver() {
        driver.quit();
    }
}
