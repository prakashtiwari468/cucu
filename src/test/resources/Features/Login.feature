Feature: login functionality

Scenario: valid login
Given user should be on login page
When user enters valid credentails
Then user should be navigate to home page
And user can see logout link


Scenario: Invalid login
Given user should be on login page
When user enters invalid credentails
Then user should be navigate to login page
And user can see error message