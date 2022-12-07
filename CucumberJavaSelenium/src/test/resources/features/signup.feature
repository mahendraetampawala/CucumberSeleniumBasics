#Author Mahendra

Feature: feature to test facebook signup

  Scenario: Check browser is open
    Given user is on signup page
    When user enters valid details
    And clicks on signup button
    Then user is nevigated to the home page

