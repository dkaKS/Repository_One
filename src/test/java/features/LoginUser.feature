#@SmokeTest

Feature: Verify for the Application
  As a user of the application
  I should be able to login with valid credentials
  So that I can login into my account

  Background: Navigate
    Given the user navigate to Swag Labs page of the application


  Scenario: 1. Verify the application with valid credentials
    When the user login with "locked_out_user" in username and "secret_sauce" in password
    And the user clicks on login button
    Then the user should see the message


  #@SmokeTest
  Scenario Outline: 2. Verify Swag Page with invalid credentials using data driven
    When the user login with "<username>" in username and "<password>" in password
    And the user clicks on login button
    Then the user should "<expectedText>"

    Examples:
      | username        | password     | expectedText                                                              |
      | lockedout_user  | secretsauce  | Epic sadface: Username and password do not match any user in this service |
      | locked_outuser  | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secretsauce  | Epic sadface: Username and password do not match any user in this service |
      |                 |              | Epic sadface: Username is required                       |
