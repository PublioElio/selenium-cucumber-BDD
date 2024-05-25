package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue = "steps",
        //dryRun = true,
        //monochrome = true,
        tags = "@Home02",
        //name = "Ebay",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
}
