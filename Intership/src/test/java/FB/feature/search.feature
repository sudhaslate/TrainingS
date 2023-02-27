
Feature: Validating the Facebook Login with various credentials

  Scenario:
    Given User is on the Facebook Page
    When User enter<"chandra_sudu@yahoo.co.in"> in the input box
    And User enters<"9password9"> in the password field
    And Click on the Login button
    Then User logon to the account page "Poorna Tummati"





