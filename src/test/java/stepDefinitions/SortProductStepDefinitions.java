package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SortProductPage;

public class SortProductStepDefinitions extends WebConnector {

    SortProductPage sortProductPage = new SortProductPage();


    @Then("the user should see {int} options in product_sort_container")
    public void the_user_should_see_options_in_product_sort_container(int count) {
        sortProductPage.checkAllOptions(count);
    }

    @When("the user click on the product_sort_container")
    public void the_user_click_on_the_product_sort_container() {
        sortProductPage.clickProductSortOption();
    }

    @When("the user select {string} option from product_sort_container")
    public void the_user_select_option_from_product_sort_container(String option) {
        sortProductPage.pickOptionFromSort(option);
    }

    @Then("the user should see {string} option is selected")
    public void the_user_should_see_option_is_selected(String option) {
        sortProductPage.checkSelectedOption(option);
    }


}