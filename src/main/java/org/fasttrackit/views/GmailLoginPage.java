package org.fasttrackit.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage {
    @FindBy(css = "input#Email")
    private WebElement username;
    public WebElement getUsername() {
        return username;
    }

    @FindBy(css = "input#next.rc-button.rc-button-submit")
    private WebElement NextButton;
    public WebElement getNextButton() {
        return NextButton;
    }

    @FindBy(css = "input#Passwd")
    private WebElement Password;
    public WebElement getPassword() {
        return Password;
    }

    @FindBy(css = "input#signIn")
    private WebElement SignInButton;
    public WebElement getSignInButton() {
        return SignInButton;
    }

    @FindBy(css = "span.gb_8a.gbii")
    private WebElement UserMenuButton;
    public WebElement getUserMenuButton() {
        return UserMenuButton;
    }

    @FindBy(css = "a#gb_71.gb_Fa.gb_Fe.gb_Ne.gb_wb")
        private WebElement LogoutButton;
    public WebElement getLogoutButton() {
        return LogoutButton;
    }

    @FindBy(css = "h2.hidden-small")
    private WebElement ValidateLogout;
    public WebElement getValidateLogout() {
        return ValidateLogout;
    }
}

