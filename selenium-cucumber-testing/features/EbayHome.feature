Feature: Ebay Home Page Scenarios

  @P00
  Scenario: Advanced Search Link
    Given I am on Ebay home page
    When I click on the Advanced Search link
    Then I should see the Advanced Search page

  Scenario: Search items count
    Given I am on Ebay home page
    When I search for iphone
    Then I should see at least 1000 items count