#@SmokeTest
Feature: Verify for the Application
  As a user of the application
  I should be able to login with valid credentials
  So that I can login into my account
  And purchase a product

  Background: Navigate
    Given the user navigate to Swag Labs page of the application
    When the user login with "standard_user" in username and "secret_sauce" in password
    And the user clicks on login button
    Then the user should see the home page of the application
    And the user selects and clicks on the “Add to cart“ button
    And the user clicks on cart icon
    And the user should see the product "Sauce Labs Backpack" item is added successfully to the Your Cart page


  Scenario: 1. Verify the application user can purchase the product


    When clicks on “Checkout” button in Your cart page
    And the user add the details "standardUser" in firstname, "AppUser" in lastname and "TN45WE" in postal code.
    And click on “Continue” button.
    And click “Finish” button in checkout overview page.
    Then the user should see the message “Thank you for your order” in Checkout complete page.