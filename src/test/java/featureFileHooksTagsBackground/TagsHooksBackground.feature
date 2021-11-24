@main
Feature: testing hooks backgroud and tags

Background: this will be included before first scenario
When user should launch browser
When user enter the url link

@first
Scenario: this first scenario
Given user is on the home page
When user enters the username and password
And clicks on the login
Then user should be navigated to home page
 
 @second
Scenario: this first scenario
Given user is on the home page
When user enters the username and password
And clicks on the login
Then user should be navigated to home page

@third
Scenario: this first scenario
Given user is on the home page
When user enters the username and password
And clicks on the login
Then user should be navigated to home page
