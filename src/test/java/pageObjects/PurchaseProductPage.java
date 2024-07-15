package pageObjects;

import browserControl.WebConnector;

public class PurchaseProductPage extends WebConnector {

    /**Locators**/

    private String checkoutXpath = "//button[@id='checkout']";
    private String checkoutFirstNameXpath ="//input[@id='first-name']";
    private String checkoutLastNameXpath = "//input[@id='last-name']";
    private String checkoutZipCodeXpath = "//input[@id='postal-code']";
    private String continueXpath ="//input[@id='continue']";
    private String finishXpath = "//button[@id='finish']";


    /***Getters and setters**/

    public void checkoutButton(){
        BasePage.findElementByXpath(10, checkoutXpath).click();

    }


    public void setCheckoutFirstName(String firstname) {

        BasePage.findElementByXpath(10, checkoutFirstNameXpath).clear();
        BasePage.findElementByXpath(10, checkoutFirstNameXpath).sendKeys(firstname);

    }

    public void setCheckoutLastName(String lastname) {

        BasePage.findElementByXpath(10, checkoutLastNameXpath).clear();
        BasePage.findElementByXpath(10, checkoutLastNameXpath).sendKeys(lastname);

    }

    public void setCheckoutPostalCode(String postalcode) {

        BasePage.findElementByXpath(10, checkoutZipCodeXpath).clear();
        BasePage.findElementByXpath(10, checkoutZipCodeXpath).sendKeys(postalcode);

    }

    public void clickContinue(){
        BasePage.findElementByXpath(10, continueXpath).click();

    }

    public void clickFinish(){
        BasePage.findElementByXpath(10, finishXpath).click();

    }


}
