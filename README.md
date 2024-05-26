# Selenium & Cucumber automation

This is a **Selenium WebDriver** project that uses **Cucumber** for behavior-driven development (BDD). The project is written in **Java** and built with **Maven**.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 18
- Maven
- IntelliJ IDEA 2023.3 or any other IDE that supports Java and Maven
- Chrome browser version 125.0.6422.77

### Installing

1. Clone the repository to your local machine.
2. Open the project in your IDE.
3. Run `mvn clean install` to download the necessary dependencies.

## Running the tests

The tests can be run by executing the `TestRunner` class located in `src/test/java/org/example/TestRunner.java`. The `@CucumberOptions` annotation in this class can be modified to control which tests are run.

## Features

The project includes tests for the following features:

- Navigating to different pages on eBay.
- Performing an advanced search for an item.
- Validating the page URL and title.
- Clicking on various links on the home page.

## Built With

- [Java](https://www.java.com/) - The programming language used
- [Maven](https://maven.apache.org/) - Dependency Management
- [Selenium WebDriver](https://www.selenium.dev/) - Used to automate browser actions
- [Cucumber](https://cucumber.io/) - Used for behavior-driven development

## Authors

- [PublioElio](https://github.com/PublioElio) - Initial work
