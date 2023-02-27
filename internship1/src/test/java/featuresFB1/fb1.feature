Feature: Validating the Forgot Password on FaceBook

  Scenario:
    Given User is on the Facebook Page
    When User enter<"chandra_sudu@yahoo.co.in"> in the input box
    And  User clicks on Forgotten Pasword option
    And  User enters<"chandra_sudu@yahoo.co.in"> in the input box
    And Click on the search button
    Then User should see Reset Your Password
