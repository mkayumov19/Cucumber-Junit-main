
@regression @wikiSearch

Feature: Wikipedia Search Functionality
  As a user, I should be able to search terms and see relevant information
  Case: Search for "Steve Jobs", the title, the header and the image header
  should be displayed as "Steve Jobs"

  @wikiTitle
  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When  User types "Elon Musk" in the wiki search box
    And   User clicks wiki search button
    Then  User sees "Elon Musk" is in the wiki title

  @wikiHeader
  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When  User types "Elon Musk" in the wiki search box
    And   User clicks wiki search button
    Then  User sees "Elon Musk" is in the main header

  @wikiScenarioOutline
  Scenario Outline: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When  User types "<searchValue>" in the wiki search box
    And   User clicks wiki search button
    Then  User sees "<expectedMainHeader>" is in the main header
    Then  User sees "<expectedTitle>" is in the wiki title

    Examples: Search terms are going to use in this template is as below
      | searchValue     | expectedMainHeader | expectedTitle   |
      | Steve Jobs      | Steve Jobs         | Steve Jobs      |
      | Albert Einstein | Albert Einstein    | Albert Einstein |
      | Nikola Tesla    | Nikola Tesla       | Nikola Tesla    |
      | Conor McGregor  | Conor McGregor     | Conor McGregor  |
      | Chuck Norris    | Chuck Norris       | Chuck Norris    |
      | Islam Karimov   | Islam Karimov      | Islam Karimov   |
      | Donald Trump    | Donald Trump       | Donald Trump    |