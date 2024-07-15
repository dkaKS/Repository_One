package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.AddToCartPage;

public class AddToCartStepDefinitions extends WebConnector {

    AddToCartPage addToCartPage = new AddToCartPage();


    @When("the user selects and clicks on the “Add to cart“ button")
    public void the_user_selects_and_clicks_on_the_add_to_cart_button() {
        addToCartPage.addToCartButton();
    }

    @Then("the user clicks on cart icon")
    public void the_user_clicks_on_cart_icon() {
        addToCartPage.addToCartIconLink();

    }
    @Then("the user should see the product {string} item is added successfully to the Your Cart page")
    public void the_user_should_see_the_product_item_is_added_successfully_to_the_your_cart_page(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }

    @When("the user clicks on the “Remove” button of selected item in Your Cart page")
    public void the_user_clicks_on_the_remove_button_of_selected_item_in_your_cart_page() {
        addToCartPage.removeCartItem();
    }

    @Then("the user should see no items in the page")
    public void the_user_should_see_no_items_in_the_page() {

        addToCartPage.emptyItems();
    }

}
