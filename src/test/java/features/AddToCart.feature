@SmokeTest

Feature: Verify whether the user is able to add the product “Sauce Labs Backpack” to the cart.
  As a user of the application i should be able to select the Product and add to the product cart.

  Background: Navigate
    Given the user navigate to Swag Labs page of the application
    When the user login with "standard_user" in username and "secret_sauce" in password
    And the user clicks on login button
    Then the user should see the home page of the application

  Scenario:1. Verify the product is selected and added to the product cart.

    When the user selects and clicks on the “Add to cart“ button
    And the user clicks on cart icon
    Then the user should see the product "Sauce Labs Backpack" item is added successfully to the Your Cart page


  Scenario:2. Verify that the added product can be removed from cart
    When the user selects and clicks on the “Add to cart“ button
    And the user clicks on the “Remove” button of selected item in Your Cart page
    And the user clicks on cart icon
    Then the user should see no items in the page