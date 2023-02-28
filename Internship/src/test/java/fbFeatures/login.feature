Feature: Validating the FaceBook Login details

 Scenario Outline: Validating the Login with Invalid credentials
    Given User is on the Facebook Page
    When User enter"<EmailId>" as EmailId
    And User enters"<Password>" as Password
    And Click on the Login button
    Then User should see The email address you entered isn't connected to an account
Examples:
         |   EmailId            |   Password |
         |super@gmail.com       |   secret   |



  Scenario Outline: Validating the Login with invalid password
    Given User is on the Facebook Page
    When User enter"<EmailId>" as EmailId
    And User enters"<Password>" as Password
    And Click on the Login button
    Then User should see The password that you've entered is incorrect. Forgotten password?
    Examples:
           |   EmailId              |  Password  |
           |chandra_sudu@yahoo.co.in| secret     |




  Scenario: Validating the Login without any information
    Given User is on the Facebook Page
    When User enter"<   >" as EmailId
    And Click on the Login button
    Then User should see Find your account and log in.



  Scenario Outline: Validating the Login with Valid credentials
    Given User is on the Facebook Page
    When User enter"<EmailId>" as EmailId
    And User enters"<Password>" as Password
    And Click on the Login button
    Then User logon to the account page Poorna Tummati
Examples:
          |   EmailId              |  Password  |
          |chandra_sudu@yahoo.co.in| 9password9 |



  Scenario Outline: Validating the Logout Functionality on fabcebook page
    Given User is on the Facebook Page
    When User enter"<EmailId>" as EmailId
    And User enters"<Password>" as Password
    And Click on the Login button
    And On account page click the Profile pic on top right hand corner
    Then User should click on the last option LogOut
Examples:
        |   EmailId              |  Password  |
        |chandra_sudu@yahoo.co.in| 9password9 |



  Scenario Outline:  Validating the Forgot Password Option
    Given User is on the Facebook Page
    When User enter"<EmailId>" as EmailId
    And  User clicks on Forgotten Pasword option
    And  User enters"<EmailId>" in the input box
    And Click on the search button
    Then User should see Reset Your Password
Examples:
         |   EmailId              |   EmailId             |
         |chandra_sudu@yahoo.co.in|chandra_sudu@yahoo.co.in|
