Feature:Validating the Login features of Solar Company

  Scenario:Validating the login functionality using Valid username and password
    Given User is on the Home page of Solar Test Company
    When Enter the <"super_admin@gmail.com"> in the input box username
    And Enter the <"secret"> in the input box password
    And Click on the SignIn Button

    And Select the company SolarTestCompany from dropdown
    And Click on confirm button
    Then User should be able to launch on company page



  Scenario:Validating the login functionality using Valid username and password
    Given User is on the Home page of Solar Test Company
    When Enter the <"super_admin@gmail.com"> in the input box username
    And Enter the <"secret"> in the input box password
    And Click on Remember me option
    And Click on the SignIn Button

