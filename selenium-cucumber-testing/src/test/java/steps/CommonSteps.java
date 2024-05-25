package steps;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class CommonSteps {
    private static WebDriver driver;

    @Before
    public void setUp() {
        ArrayList<String> optionList = new ArrayList<>();
        ChromeOptions options = new ChromeOptions();
        optionList.add("--start-maximized");
        optionList.add("--incognito");
        options.addArguments(optionList);
        driver = new ChromeDriver(options);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
