Feature: Validating the features of Facebook Account


  Scenario Outline: Validating the path to account page
    Given User is on the Facebook Page
    When User enter"<EmailId>" as EmailId
    And User enters"<Password>" as Password
    And Click on the Login button
    Then User clicks on "Poorna Tummati" in the account page and should see the "profileCoverPhoto"

    Examples:
      |   EmailId              |  Password  |
      |chandra_sudu@yahoo.co.in| password9C |


