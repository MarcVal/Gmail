package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fasttrackit.steps.genericSteps.TestBase;
import org.fasttrackit.views.ContactUsPage;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by SatsangTurya on 10/20/2016.
 */
public class ContactStep extends TestBase{
private ContactUsPage Contact = PageFactory.initElements(driver, ContactUsPage.class);
    @When("^Click on Contact Us$")
    public void clickOnContactUs() {
            Contact.getContact().click();
    }

    @Then("^Contact page is loaded$")
    public void contactPageIsLoaded(){
       Contact.Harta.isDisplayed();
    }
}
