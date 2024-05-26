Feature: Ebay Advanced Search Page
  Background:
    Given I am on this page 'https://www.ebay.com/sch/ebayadvsearch'

  @AdvSearch00
  Scenario: Ebay Logo on Advanced Search Page
    When I click on the Ebay Logo
    Then I should see this page 'https://www.ebay.com/'

  @AdvSearch01 @SetCookies
  Scenario: Advanced Search an item
    When I advanced search for an item
      | keyword | exclude     | min | max |
      | iphone  | refurbished | 100 | 900 |
