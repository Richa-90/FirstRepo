Feature: Online Shopping
Scenario: Home Page by default login.
Given User navigated to home page
When User clicked on Shop button
Then User clicked on Home button
And User clicks arrival image
And User is on add to basket page
And User enter the <Amount>
And User clicks on Add to basket
And User should get value must be less than or equal to 973

|Amount|
|974|