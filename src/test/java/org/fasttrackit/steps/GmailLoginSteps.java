package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fasttrackit.steps.genericSteps.TestBase;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by SatsangTurya on 10/22/2016.
 */
public class GmailLoginSteps extends TestBase {
    private org.fasttrackit.views.GmailLoginPage Username = PageFactory.initElements(driver, org.fasttrackit.views.GmailLoginPage.class);
    private org.fasttrackit.views.GmailLoginPage NextButton = PageFactory.initElements(driver, org.fasttrackit.views.GmailLoginPage.class);
    private org.fasttrackit.views.GmailLoginPage Password = PageFactory.initElements(driver, org.fasttrackit.views.GmailLoginPage.class);
    private org.fasttrackit.views.GmailLoginPage SignInButton = PageFactory.initElements(driver, org.fasttrackit.views.GmailLoginPage.class);
    private org.fasttrackit.views.GmailLoginPage UserMenuButton = PageFactory.initElements(driver, org.fasttrackit.views.GmailLoginPage.class);
    private org.fasttrackit.views.GmailLoginPage LogoutButton = PageFactory.initElements(driver, org.fasttrackit.views.GmailLoginPage.class);
    private org.fasttrackit.views.GmailLoginPage ValidateLogout = PageFactory.initElements(driver, org.fasttrackit.views.GmailLoginPage.class);


    @And("^Click on EmailField$")
    public void clickOnEmailField() {
        Username.getUsername().click();
    }

    @When("^Type \"([^\"]*)\" in the email field$")
    public void typeInTheEmailField(String Email) {
        Username.getUsername().sendKeys(Email);
    }

    @When("^Click Next$")
    public void ClickNext() {
        NextButton.getNextButton().click();
    }

    @And("^Click on PasswordField$")
    public void PasswordField() {
        Password.getPassword().click();
    }

    @When("^Enter Password \"([^\"]*)\"$")
    public void enterPassword(String password) {
        Password.getPassword().sendKeys(password);
    }

    @And("^I Click Sign in$")
    public void ClickSignIn() {
        SignInButton.getSignInButton().click();
    }

    @And("^I Click on Usermenu$")
    public void ClickUserMenu() {
        UserMenuButton.getUserMenuButton().click();
    }

    @And("^I click on SignOut$")
    public void ClickLogOut() {
        LogoutButton.getLogoutButton().click();
    }

    @Then("^Validate Logout$")
    public void validateLogout()  {
      ValidateLogout.getValidateLogout().isDisplayed();
    }
}
