#  @wip
  Feature: Examples of Cucumber data table implementations

    Scenario: Something happens
    #Given user does something
      Then user should see below words displayed
        | Apple      |
        | Kiwi       |
        | Orange     |
        | Strawberry |
        | Mango      |
        | Tomato     |
        | Cucumber   |

    # To fix pipes' order
      #MAC: command + option + L
      #Windows : control + alt + L
    @wip
    Scenario: Library login example using data table
      Given User is on the login page of library app
      When User enters username and password as below
      |username|student11@library|
      |password|tScBPCUr         |
      Then User should see title is Library