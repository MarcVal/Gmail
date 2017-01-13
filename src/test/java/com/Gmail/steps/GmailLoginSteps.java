package com.Gmail.steps;

import com.Gmail.steps.genericSteps.TestBase;
import com.Gmail.views.GmailLoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Valeria Marc on 10/22/2016.
 */
public class GmailLoginSteps extends TestBase {
    private GmailLoginPage gmailLoginPage = PageFactory.initElements(driver, GmailLoginPage.class);


    @And("^Click on EmailField$")
    public void clickOnEmailField() {
        gmailLoginPage.getUsername().click();
    }

    @And("^Type address in the email field$")
    public void typeAddress() {
        gmailLoginPage.getUsername().sendKeys("tesstarre2017@gmail.com");
    }

    @And("^Click Next$")
    public void ClickNext() {
        gmailLoginPage.getNextButton().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


    @And("^Enter Password$")
    public void enterPassword() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        gmailLoginPage.getPassword().sendKeys("istqb2017");
    }

    @And("^I Click Sign in$")
    public void ClickSignIn() {
        gmailLoginPage.getSignInButton().click();
    }

    @And("^I Click on Usermenu$")
    public void ClickUserMenu() {
        gmailLoginPage.getUserMenuButton().click();
    }

    @And("^I click on SignOut$")
    public void ClickLogOut() {
        gmailLoginPage.getLogoutButton().click();
    }

    @Then("^Validate Logout$")
    public void validateLogout() {
        gmailLoginPage.getValidateLogout().isDisplayed();
    }


}
