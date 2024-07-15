package pageObjects;

import browserControl.WebConnector;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SortProductPage extends WebConnector {

    /****** Locators ******/

    private String productSortOptionXpath = "//select[@class='product_sort_container']";
    private String selectedOptionXpath = "//span[@class='active_option']";


    /****** Getters and Setters *******/


    public void checkAllOptions(int expectedCount){
        WebElement productSortOption = BasePage.findElementByXpath(10, productSortOptionXpath);
        List<WebElement> options = productSortOption.findElements(By.tagName("option"));
        Assert.assertEquals(expectedCount, options.size());
    }

    public void clickProductSortOption(){
        BasePage.findElementByXpath(10, productSortOptionXpath).click();

    }
    public void pickOptionFromSort(String option){
        WebElement pickproduct_sort_option = BasePage.findElementByXpath(10, productSortOptionXpath);
        Select select = new Select(pickproduct_sort_option);
        select.selectByVisibleText(option);
    }

    public void checkSelectedOption(String expectedOption){
        String actualOption = BasePage.findElementByXpath(10, selectedOptionXpath).getText();
        Assert.assertEquals(expectedOption, actualOption);
    }



}







