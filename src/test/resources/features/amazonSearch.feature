
@regression

Feature: Amazon Search and Cart features

  @amazonSearch
  Scenario: Amazon search and Cart features work as expected
    When User is on the Amazon Home Page
    And User search for hats for men
    And User Add the first hat appearing to Cart with quantity 2
    Then the total price and quantity should be correct
    When User Reduce the quantity from 2 to 1 in Cart for the item selected
    Then total price and quantity has been correctly changed