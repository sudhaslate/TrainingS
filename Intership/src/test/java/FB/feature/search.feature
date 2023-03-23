
Feature: Validating the Facebook Login with valid credentials

  Scenario:
    Given User is on the Facebook Page
    When User enter<"email"> in the input box
    And User enters<"password"> in the password field
    And Click on the Login button
    Then User logon to the account page "Poorna Tummati"





