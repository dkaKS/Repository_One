package pageObjects;

import browserControl.WebConnector;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AddToCartPage extends WebConnector {

    /**Locators**/

    private String addToCartXpath = "//button[@id='add-to-cart-sauce-labs-backpack']";
    private String clickCartXpath = "//a[@class='shopping_cart_link']";
    private String removeCartItemXpath = "//button[@id='remove-sauce-labs-backpack']";

    private String emptyItemsXpath = "//div[@class ='removed_cart_item']";


    /**Getters and Setters**/

    public void addToCartButton(){
        BasePage.findElementByXpath(10, addToCartXpath).click();
    }

    public void addToCartIconLink(){
        BasePage.findElementByXpath(10, clickCartXpath).click();
    }

    public void removeCartItem(){
        BasePage.findElementByXpath(10, removeCartItemXpath).click();
    }

    public void emptyItems(){
        BasePage.findElementByXpath(10, emptyItemsXpath);
        //WebElement emptyListItems = BasePage.findElementByXpath(10, emptyItemsXpath);
    }


}
