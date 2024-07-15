
#@SmokeTest
Feature: Verify for the Application
  As a user of the application
  I should be able to login with valid credentials
  So that I can login into my account

  Background: Navigate
    Given the user navigate to Swag Labs page of the application


  Scenario: 1. Verify the application with valid credentials
    When the user login with "problem_user" in username and "secret_sauce" in password
    And the user clicks on login button
    Then the user should see the home page of the application
    And the user should see all the product images are displayed accordingly.


