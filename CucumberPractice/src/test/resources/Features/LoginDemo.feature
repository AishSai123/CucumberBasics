Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to the homepage
    Then user will logout and return to login page

    Examples: 
      | username  | password |
      | Aishwarya |    12345 |
      | Raghav    |    12345 |
