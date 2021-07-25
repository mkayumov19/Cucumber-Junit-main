@regression
Feature: Try if download with selenium works

    @downloadPractice
    Scenario: get into page find download link and try to click on that link
      Given user opens bringYourOwnLaptop application
      When user finds Download link under "BYOL Show EP3 - Color" text
      Then user should not be able to proceed to next step for downloading in selenium