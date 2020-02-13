Feature: Smartbear login feature verifications
  Agile Story: When user is on the login page of SmartBear app user should
  be able to login using correct test data
  A/C:
  1- Only authenticated user should be able to login
  Link: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
  Authenticated test data:
  Username: Test
  Password: tester
  2- User should see "Welcome, Tester!" displayed when logged in.
  Scenario:as a user I should be able to login as an authenticated user
    Given user is on the SmartBear login page
    When user gives the correct username credential
    And user gives the correct password credential
    And user clicks on login button
    Then user should see the welcome text

    Scenario: as a user I should not be able to login when I enter not authenticated test data
      Given user is on the SmartBear login page
      When user gives the correct username credential
      And user gives the wrong password credential
      And user clicks on login button
      Then user should see the appropriate text

