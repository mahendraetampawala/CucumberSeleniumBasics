#Author Mahendra

Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given user us on login page
    When user enters username and password
    And clicks on login button
    Then user is nevigated to the home page

