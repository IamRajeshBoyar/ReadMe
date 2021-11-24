Feature: Testing Adactin book hotel features

Scenario: Testing Login Page
Given user is on the adactin login page "https://adactinhotelapp.com/index.php"
When user enters username and password
And clicks on the login button
Then user should be navigated to book hotel page