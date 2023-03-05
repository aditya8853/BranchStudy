Feature: Login Feature
  			As a user, I have to enter correct credentials for a successful login.


@SmokeTest
  Scenario: Login to xyz website
    Given User navigates to the given site
    When User enter "Aditya" and "Password1"
    And Clicks Login button
    Then Login is Successful
    
 @RegressionTest 
  	Scenario: Login to xyz website
    Given User navigates to the given site
    When User signs in using following details
    | John | abcd | john@abcd.com | Australia | 1234567890 |
    And Clicks Login button
    Then Login is Successful
    
    
    

    
