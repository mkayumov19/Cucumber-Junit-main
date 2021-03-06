
@regression @smoke @login

Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials
  to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

    #THIS IS HOW WE COMMENT IN FEATURE FILE

  Background: Assuming user is on the login page
    Given user is on the login page

  @loginLibrarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @loginStudent
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @loginAdmin
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard
