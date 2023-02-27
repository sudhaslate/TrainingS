Feature: Validating the Facebook Login with invalid password

  Scenario:
    Given User is on the Facebook Page
    When User enter<"chandra_sudu@yahoo.co.in"> in the input box
    And User enters<"secret"> in the password field
    And Click on the Login button
    Then User should see The password that you've entered is incorrect. Forgotten password?

