Feature: Ebay Home Page Scenarios
  Background:
    Given I am on this page 'https://www.ebay.com/'

  @Home00
  Scenario: Advanced Search Link
    When I click on the Advanced Search link
    Then I should see this page 'https://www.ebay.com/sch/ebayadvsearch'

  @Home01 @SetCookies @Test
  Scenario: Search items count
    When I search for 'iphone'
    Then I should see at least 1000 items count

  @Home02 @SetCookies
  Scenario: Search an item on a category
    When I search for 'toys' on the category 'Toys & Hobbies'
    Then I should see at least 1000 items count

    @Home03
    Scenario Outline: Home page links
      When I click on the '<link>'
      Then I validate the page is '<url>' and the title is '<title>'
      Examples:
        | link    | url                                                                | title                                          |
        | Motors  | https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334     | eBay Motors: Auto Parts and Vehicles \| eBay   |
        | Fashion | https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545 | Clothing, Shoes & Accessories for sale \| eBay |
        | Toys    | https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497                 | Toys & Hobbies products for sale \| eBay       |

