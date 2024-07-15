package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.PurchaseProductPage;

public class PurchaseProductStepDefinitions extends WebConnector {

    PurchaseProductPage purchaseProductPage = new PurchaseProductPage();

    @When("clicks on “Checkout” button in Your cart page")
    public void clicks_on_checkout_button_in_your_cart_page() {
        purchaseProductPage.checkoutButton();

    }

    @When("the user add the details {string} in firstname, {string} in lastname and {string} in postal code.")
    public void the_user_add_the_details_in_firstname_in_lastname_and_in_postal_code(String firstname, String lastname, String postalcode) {
       purchaseProductPage.setCheckoutFirstName(firstname);
       purchaseProductPage.setCheckoutLastName(lastname);
       purchaseProductPage.setCheckoutPostalCode(postalcode);
    }

    @When("click on “Continue” button.")
    public void click_on_continue_button() {
        purchaseProductPage.clickContinue();
        Assert.assertTrue(driver.getPageSource().contains("Swag Labs"));
    }

    @When("click “Finish” button in checkout overview page.")
    public void click_finish_button_in_checkout_overview_page() {
        purchaseProductPage.clickFinish();
        Assert.assertTrue(driver.getPageSource().contains("Swag Labs"));

    }

    @Then("the user should see the message “Thank you for your order” in Checkout complete page.")
    public void the_user_should_see_the_message_thank_you_for_your_order_in_checkout_complete_page() {
        Assert.assertTrue(driver.getPageSource().contains("Thank you for your order"));
    }

}
