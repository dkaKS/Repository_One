#@SmokeTest
Feature: Verify the Sorting Products

  As a user of application
  I should able to use product sort dropdown
  So that i can sort the products

  Background: Navigate
    Given the user navigate to Swag Labs page of the application
    When the user login with "standard_user" in username and "secret_sauce" in password
    And the user clicks on login button
    Then the user should see the home page of the application

  Scenario: 1.Verify the number of options available in product sort container
    Then the user should see 4 options in product_sort_container

  Scenario: 2.Verify that the user can select an option from product sort container
    When the user click on the product_sort_container
    And the user select "Price (low to high)" option from product_sort_container
    Then the user should see "Price (low to high)" option is selected

  Scenario Outline: 3.Verify that the user can select an option from product sort container
    When the user click on the product_sort_container
    And the user select "<option>" option from product_sort_container
    Then the user should see "<option>" option is selected

    Examples:
      | option              |
      | Name (A to Z)       |
      | Name (Z to A)       |
      | Price (low to high) |
      | Price (high to low) |