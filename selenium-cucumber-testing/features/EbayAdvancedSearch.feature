Feature: Ebay Advanced Search Page

  @AdvSearch00
  Scenario: Ebay Logo on Advanced Search Page
    Given I am on this page 'https://www.ebay.com/sch/ebayadvsearch'
    When I click on the Ebay Logo
    Then I should see this page 'https://www.ebay.com/'

  @AdvSearch01
  Scenario: Advanced Search an item
    Given I am on this page 'https://www.ebay.com/sch/ebayadvsearch'
    When I advanced search for an item
      | keyword | exclude     | min | max |
      | iphone  | refurbished | 100 | 900 |