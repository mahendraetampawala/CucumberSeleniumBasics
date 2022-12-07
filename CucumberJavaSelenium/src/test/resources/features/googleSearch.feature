Feature: feature to test google test fucntionality

Scenario: Validate Google search is working

Given browser is open
And user is on google search
When user enters  text in search box
And hist enter
Then user is navigated to results