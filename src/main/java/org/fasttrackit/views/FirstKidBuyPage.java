package org.fasttrackit.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valeria Marc on 11/4/2016.
 */
public class FirstKidBuyPage {

    @FindBy (className = "my-account-link")
    private WebElement myAccountLink;
    public WebElement getMyAccountLink() {
        return myAccountLink;}


    @FindBy (className = "top-mini-my-account-login")
    private WebElement myAccountLogin;

    public WebElement getMyAccountLogin() {
        return myAccountLogin;
    }

    @FindBy (css = "input#email.input-text.required-entry.validate-email")
    private WebElement emailField;

    public WebElement getEmailField() {
        return emailField;
    }

    @FindBy (css = "input#pass.input-text.required-entry.validate-password")
    private WebElement passwordField;

    public WebElement getPasswordField() {
        return passwordField;
    }

    @FindBy (xpath = "//*[@id=\"send2\"]")
    private WebElement loginButton;

    public WebElement getLoginButton() {
        return loginButton;
    }

    @FindBy (className = "menu-container")
    private WebElement categoryMenu;

    public WebElement getCategoryMenu() {
        return categoryMenu;
    }

    @FindBy (css = "i.category-icon.main-menu-jucarii-si-jocuri")
    private WebElement toysCategory;

    public WebElement getToysCategory() {
        return toysCategory;
    }

    @FindBy (css = "li.col-sw-3:nth-child(19) > a:nth-child(1) > span:nth-child(1)")
    private WebElement smartToysSubcategory;

    public WebElement getSmartToysSubcategory() {
        return smartToysSubcategory;
    }
}
