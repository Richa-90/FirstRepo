Feature: Online Shopping Applications
Background:
Given Browser path is configured
When Browser is triggering

@RegressionTest
Scenario: Home page is displayed after login
Given User is on home pages
When User clicked on shop button
Then User clicked on home button
And User added item to basket
And User clicked on view basket
And User clicked on proceed to checkout page
And User clicked on enter coupon code
And User enters coupon code
And User clicked on apply coupon code
And User checks the rupees reduced to 50 ruppess
