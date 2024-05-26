Feature: Ebay Home Page Scenarios

  @Home00
  Scenario: Advanced Search Link
    Given I am on this page 'https://www.ebay.com/'
    When I click on the Advanced Search link
    Then I should see this page 'https://www.ebay.com/sch/ebayadvsearch'

  @Home01
  Scenario: Search items count
    Given I am on this page 'https://www.ebay.com/'
    When I search for 'iphone'
    Then I should see at least 1000 items count

  @Home02
  Scenario: Search an item on a category
    Given I am on this page 'https://www.ebay.com/'
    When I search for 'toys' on the category 'Toys & Hobbies'
    Then I should see at least 1000 items count