Feature: Validating the DashBoard Functionality

  @SanityTest
   Scenario Outline: Validating the Companies Card on DashBoard
     Given User is on the Home page of Solar Test Company
    When Enter the "<EmailId>" as EmailId
    And Enter "<Password>" as Password
    And Click on the SignIn Button
    And User should see be able to launch on company page
    And Select the company SolarTestCompany from dropdown
    And Click on confirm button
    And User should be able to launch on main company page
    And  User clicks on the MoreInfo Link in Companies Card
    Then User should see the Companies page
    Examples:
      | EmailId                 |  Password |
      |super_admin@gmail.com    |  secret   |

  Scenario Outline:Validating the SalesRate Card on DashBoard
    Given User is on the Home page of Solar Test Company
    When Enter the "<EmailId>" as EmailId
    And Enter "<Password>" as Password
    And Click on the SignIn Button
    And User should see be able to launch on company page
    And Select the company SolarTestCompany from dropdown
    And Click on confirm button
    And User should be able to launch on main company page
      And  User clicks on the MoreInfo Link on Sales rate
      Then User should see the SalesRate page
    Examples:
      | EmailId                 |  Password |
      |super_admin@gmail.com    |  secret   |

  Scenario Outline:Validating the Users Card on DashBoard
    Given User is on the Home page of Solar Test Company
    When Enter the "<EmailId>" as EmailId
    And Enter "<Password>" as Password
    And Click on the SignIn Button
    And User should see be able to launch on company page
    And Select the company SolarTestCompany from dropdown
    And Click on confirm button
    And User should be able to launch on main company page
    And  User clicks on the MoreInfo Link on Users
    Then User should see the Users page
    Examples:
      | EmailId                 |  Password |
      |super_admin@gmail.com    |  secret   |

  Scenario Outline:Validating the Products Card on DashBoard
    Given User is on the Home page of Solar Test Company
    When Enter the "<EmailId>" as EmailId
    And Enter "<Password>" as Password
    And Click on the SignIn Button
    And User should see be able to launch on company page
    And Select the company SolarTestCompany from dropdown
    And Click on confirm button
    And User should be able to launch on main company page
    And  User clicks on the MoreInfo Link on Products
    Then User should see the Products page
    Examples:
      | EmailId                 |  Password |
      |super_admin@gmail.com    |  secret   |

    Scenario Outline: Validating the Sales "Donut button"
      Given User is on the Home page of Solar Test Company
      When Enter the "<EmailId>" as EmailId
      And Enter "<Password>" as Password
      And Click on the SignIn Button
      And User should see be able to launch on company page
      And Select the company SolarTestCompany from dropdown
      And Click on confirm button
      And User should be able to launch on main company page
      And User clicks on the Donut button
      Then User should be able see the pie chart
      Examples:
            | EmailId                 |  Password |
            |super_admin@gmail.com    |  secret   |

@RegressionTest
  Scenario Outline: Validating the Sales "Pie Chart Sector"
    Given User is on the Home page of Solar Test Company
    When Enter the "<EmailId>" as EmailId
    And Enter "<Password>" as Password
    And Click on the SignIn Button
    And User should see be able to launch on company page
    And Select the company SolarTestCompany from dropdown
    And Click on confirm button
    And User should be able to launch on main company page
    And User clicks on the Donut button
    And User should be able see the pie chart
    And User hoovers on to the orange area of the pie chart
    Then User should see the InStore Sale
    Examples:
      | EmailId                 |  Password |
      |super_admin@gmail.com    |  secret   |

  @RegressionTest
  Scenario Outline: Validating the Visitors "Map"
    Given User is on the Home page of Solar Test Company
    When Enter the "<EmailId>" as EmailId
    And Enter "<Password>" as Password
    And Click on the SignIn Button
    And User should see be able to launch on company page
    And Select the company SolarTestCompany from dropdown
    And Click on confirm button
    And User should be able to launch on main company page
    And User scrolls down to Visitors Map
    And User hoovers the mouse over the map onto the country at the bottom
    Then User should be able to see country name
    Examples:
      | EmailId                 |  Password |
      |super_admin@gmail.com    |  secret   |




