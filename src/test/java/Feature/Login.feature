Feature: Application Login


@MobileTest
Scenario: Home Page Default Login
Given User is on Netbanking Landing Page
When User login to application with "jin" and password "1234"
Then Home page is populated
And Cards are displayed are "true"

@MobileTest
Scenario: Home Page Default Login
Given User is on Netbanking Landing Page
When User login to application with "john" and password "4321"
Then Home page is populated
And Cards are  not displayed are "false"


@WebTest
Scenario: Home Page Default Login
Given User is on Netbanking Landing Page
When User login to application with following details
|jenny|abcd|john@abcd.com|Australia|32455|
Then Home page is populated
And Cards are  not displayed are "false"


@WebTest
Scenario Outline: Home Page Default Login
Given User is on Netbanking Landing Page
When User login in to application with <Username> and password <Password>
Then Home page is populated
And Cards are  not displayed are "false"


Examples:
|Username|Password|
|user1|pass1|
|user2|pass2|
|user3|pass3|
|user4|pass4|



