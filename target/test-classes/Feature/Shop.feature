Feature: Online Shopping

Background:
Given Validate the browser
When Browser is triggered
Then check if browser is started


Scenario: Home Page Default login
Given User is on home page
Then User clicks on Shop button
When User clicks on Home button
And Verify that home page is having 3 slides only
And Verify home page must contain 3 slides
And User clicks on image on the arrivals
And User navigated to add to basket page
And User clicks on add to basket
And User should see the description of the product
And User clicks on review button
And User should see the review regarding the book user clicked on








