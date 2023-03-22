Feature: Validating the login functionality of SOLAR TEST COMPANY


  Scenario Outline: Validating the login functionality with "Invalid Credentials"
    Given User is on the Home page of Solar Test Company
    When Enter the "<EmailId>" as EmailId
    And Enter "<Password>" as Password
    And Click on the SignIn Button
    Then User should see Login failed. Please try again
 Examples:
   | EmailId             |  Password |
   |super_admin@gmail.com|  srect    |
   |super_admin@gmail.com| 1234@£$   |

  @NegativeTest
  Scenario Outline: Validating the login functionality with "Invalid Credentials-Empty Username"
    Given User is on the Home page of Solar Test Company
    When Enter the "<EmailId>" as EmailId
    And Enter "<Password>" as Password
    And Click on the SignIn Button
    Then User should see The email field is required.
    Examples:
      | EmailId             |  Password |
      |                     |  secret   |

  @NegativeTest
  Scenario Outline: Validating the login functionality with "Invalid Credentials-Empty Password"
    Given User is on the Home page of Solar Test Company
    When Enter the "<EmailId>" as EmailId
    And Enter "<Password>" as Password
    And Click on the SignIn Button
    Then User should see The password field is required.
    Examples:
      | EmailId             |  Password |
      |super_admin@gmail.com|           |

  @PositiveTest
  Scenario Outline:Validating the login functionality with "Valid Credentials"
    Given User is on the Home page of Solar Test Company
    When Enter the "<EmailId>" as EmailId
    And Enter "<Password>" as Password
    And Click on the SignIn Button
    Then User should see be able to launch on company page
Examples:
  | EmailId                 |  Password |  RoleId      |
  |super_admin@gmail.com    |  secret   |  Super Admin |
  |admin23@gmail.com        |  secret   |  Administrator|
  |receptionist23@gmail.com |  secret   |  Receptionist |
  |sales_rep23@gmail.com    |  secret   |  Sales Rep    |
  |installer23@gmail.com    |  secret   |  Installer    |

  @PositiveTest
  Scenario Outline: Validating the login into the "Solar Test Company Page"
    Given User is on the Home page of Solar Test Company
    When Enter the "<EmailId>" as EmailId
    And Enter "<Password>" as Password
    And Click on the SignIn Button
    Then User should see be able to launch on company page
    And Select the company SolarTestCompany from dropdown
    And Click on confirm button
    Then User should be able to launch on main company page
    Examples:
      | EmailId                 |  Password |  RoleId      |
      |super_admin@gmail.com    |  secret   |  Super Admin |


  @SmokeTest
   Scenario Outline: Validating the "Forgot Password Option"
      Given User is on the Home page of Solar Test Company
      When Enter the "<EmailId>" as EmailId
      And  User clicks on I Forgot My Password
      Then User should see Give the email that is registered with us. We will send a password reset link.
Examples:
        | EmailId             |
        |super_admin@gmail.com|

  @SmokeTest
  Scenario Outline: Validating the "Send Password Reset Link Option"
    Given User is on the Home page of Solar Test Company
    When Enter the "<EmailId>" as EmailId
    And  User clicks on I Forgot My Password
    And  User enters the "<EmailId>" for reset link to be sent
    And User clicks on send password reset link
    Then User should see the email sent across page
    Examples:
              |  EmailId            |
              |super_admin@gmail.com|

@SanityTest
  Scenario Outline: Validating the "Sign In Option on Send Password Reset Link Page"
    Given User is on the Home page of Solar Test Company
    When Enter the "<EmailId>" as EmailId
    And  User clicks on I Forgot My Password
    And  User clicks on Sign In on send password reset link page
    Then User should see Sign in to start your session page
    Examples:
      |  EmailId            |
      |super_admin@gmail.com|


