@SmokeTest

Feature: Verify for the Application
  As a user of the application
  I should be able to login with valid credentials
  So that I can login into my account

  Background: Navigate
    Given the user navigate to Swag Labs page of the application


  Scenario: 1. Verify the application with valid credentials
    When the user login with "standard_user" in username and "secret_sauce" in password
    And the user clicks on login button
    Then the user should see the home page of the application

  @SmokeTest
  Scenario Outline: 2. Verify Swag Page with invalid credentials using data driven
    When the user login with "<username>" in username and "<password>" in password
    Then the user should "<expectedText>"

    Examples:
      | username      | password     | expectedText              |
      | standarduser  | secret_sauce | Your username is invalid! |
      | standard_user | secretsauce  | Your password is invalid! |
      | standarduser  | secretsauce  | Epic sadface: username and password do not match any user in this service  |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out                       |




