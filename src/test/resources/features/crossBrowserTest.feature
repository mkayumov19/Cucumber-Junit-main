@crossBrowserTest
Feature: User should be able to see same information in different browsers

  Scenario: user opens google homepage and verifies title in chrome then firefox
    Given user is on google homepage withing chromeBrowser
    When user verifies current page title if its as expected
    And user is on google homepage within firefoxBrowser
    Then user verifies current page title and see same result