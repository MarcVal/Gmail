package com.Gmail.steps;

import com.Gmail.steps.genericSteps.TestBase;
import com.Gmail.views.GmailLoginPage;
import com.Gmail.views.SendingEmailPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Valeria Marc on 11/7/2016.
 */
public class SendingEmailSteps extends TestBase {
    private SendingEmailPage sendingEmailPage = PageFactory.initElements(driver, SendingEmailPage.class);
    private GmailLoginPage gmailLoginPage = PageFactory.initElements(driver, GmailLoginPage.class);


    @And("^I login with existing email address$")
    public void iLoginWithExistingEmailAddress() {
        gmailLoginPage.getUsername().sendKeys("tesstarre2017@gmail.com");
        gmailLoginPage.getNextButton().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        gmailLoginPage.getPassword().sendKeys("istqb2017");
        gmailLoginPage.getSignInButton().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @And("^I compose new message$")
    public void iComposeNewMessage() {
        sendingEmailPage.getComposeButton().click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        sendingEmailPage.getToField().sendKeys("tesstarre@gmail.com");
        sendingEmailPage.getSubjectField().sendKeys("Testare n+1");
        sendingEmailPage.getMessageBox().sendKeys("This is a test");
        sendingEmailPage.getEmoticonIcon().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        sendingEmailPage.getShowFaces().click();
        sendingEmailPage.getSmiley().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }


    @And("^I send new composed message$")
    public void iSendNewComposedMessage() {
        sendingEmailPage.getSendButton().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @And("^I check if the message was sent$")
    public void iCheckIfTheMessageWasSent() {
        sendingEmailPage.getConfirmationMessage().isDisplayed();
    }


    @Then("^I log out from the email account$")
    public void iLogOutFromTheEmailAccount() {
        gmailLoginPage.getUserMenuButton().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        gmailLoginPage.getLogoutButton().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Given("^I go to \"([^\"]*)\"$")
    public void iGoTo(String link)  {
       driver.get(link);
    }
}
