Feature: Validating the Login of Facebook with Invalid credentials

  Scenario:
    Given User is on the Facebook Page
    When User enter<"super_admin@gmail.com"> in the input box
    And User enters<"secret"> in the password field
    And Click on the Login button
    Then User should see "The email address you entered isn't connected to an account"