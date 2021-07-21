Feature: Etsy search feature

#@wip
  Scenario: Etsy default title verification
    Given user is on the Etsy landing page
    Then user should see Etsy title as expected

    #expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

#  @wip
  Scenario: Etsy Search Functionality Verification
    Given user is on the Etsy landing page
    When User types Wooden Spoon in the search bar
    And User clicks search button
    Then User sees Wooden Spoon is in the title
