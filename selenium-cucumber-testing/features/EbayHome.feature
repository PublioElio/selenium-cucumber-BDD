Feature: Ebay Home Page Scenarios
  Background:
    Given I am on this page 'https://www.ebay.com/'

  @Home00
  Scenario: Advanced Search Link
    When I click on the Advanced Search link
    Then I should see this page 'https://www.ebay.com/sch/ebayadvsearch'

  @Home01
  Scenario: Search items count
    When I search for 'iphone'
    Then I should see at least 1000 items count

  @Home02
  Scenario: Search an item on a category
    When I search for 'toys' on the category 'Toys & Hobbies'
    Then I should see at least 1000 items count

    @Home03
    Scenario Outline: Home page links
      When I click on the '<link>'
      Then I validate the page is '<page>' and the title is '<title>'
      Examples:
        |  |