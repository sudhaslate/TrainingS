Feature: Validating LogOut Functionality

  Scenario: Validating the Logout Functionality on fabcebook page
    Given User is on the Facebook Page
    When User enter<"chandra_sudu@yahoo.co.in"> in the input box
    And User enters<"9password9"> in the password field
    And Click on the Login button
    And On account page click the Profile pic on top right hand corner
    Then User should click on the last option LogOut
