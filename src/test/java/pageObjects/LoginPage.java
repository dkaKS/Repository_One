package pageObjects;


import browserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends WebConnector {


    /***Locators**/
    private String usernameFieldXpath = "//input[@id='user-name']";
    private String passwordFieldXpath="//input[@id='password']";
    private String loginButtonXpath="//input[@id='login-button']";
    private String menuSwag="//button[@id='react-burger-menu-btn']";
    private String logoutSwag= "";




    /*** Getters and setters*****/
    /***Set usernamefield****/

    public void setSwagUsername(String username) {

        BasePage.findElementByXpath(10, usernameFieldXpath).clear();
        BasePage.findElementByXpath(10, usernameFieldXpath).sendKeys(username);

    }

    /***set swag password***/
    public void setSwagPassword(String password){

        BasePage.findElementByXpath(10, passwordFieldXpath).clear();
        BasePage.findElementByXpath(10, passwordFieldXpath).sendKeys(password);

    }
/** click login **/

    public void clickSwagLoginButton(){

        BasePage.findElementByXpath(10, loginButtonXpath).click();

    }

    public void clickSwagLogout(){
        BasePage.findElementByXpath(10, menuSwag).click();
        WebElement logOutlk = driver.findElement(By.linkText("Logout"));
        logOutlk.click();


    }


}
