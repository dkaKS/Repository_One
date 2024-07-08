package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPage;
import utilities.ConstantUtils;


public class LoginStepDefinitions extends WebConnector {

    LoginPage loginPage =new LoginPage();

    @Given("the user navigate to Swag Labs page of the application")
    public void the_user_navigate_to_swag_labs_page_of_the_application() {
        driver.get(ConstantUtils.BASE_URL);


    }

    @When("the user login with {string} in username and {string} in password")
    public void the_user_login_with_in_username_and_in_password(String username, String password) {
        loginPage.setSwagUsername(username);
        loginPage.setSwagPassword(password);


    }

    @When("the user clicks on login button")
    public void the_user_clicks_on_login_button() {
        loginPage.clickSwagLoginButton();
    }

    @Then("the user should see the home page of the application")
    public void the_user_should_see_the_home_page_of_the_application() throws InterruptedException {
        Assert.assertTrue(driver.getPageSource().contains("Swag Labs") );
        Thread.sleep(3000);

    }

    @Then("the user should see the message")
    public void the_user_should_see_the_message() {
        Assert.assertTrue(driver.getPageSource().contains("Epic sadface: Sorry, this user has been locked out."));
    }

    @Then("the user should {string}")
    public void the_user_should(String expectedText) {
      Assert.assertTrue(driver.getPageSource().contains(expectedText));


      //loginPage.clickSwagLogout();
    }



}
