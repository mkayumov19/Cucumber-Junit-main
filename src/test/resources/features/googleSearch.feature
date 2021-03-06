
@regression @googleSearch

Feature: Google search functionality
  Agile Story: As a user, when I am on the google search page,
  I should be able to search whatever I want, and see relevant information

  @googleTitle
  Scenario: Search page title verification
    When User is on Google home page
    Then  User should see title is Google

  @googleSearchTitle
  Scenario: User search title verification
    Given User is on Google home page
    When User searches for apple
    Then User should see apple in the title

  @googleSearchVerify
  Scenario: User search title verification
    Given User is on Google home page
    When User searches for "wooden spoon"
    Then User should see "wooden spoon" in the title

