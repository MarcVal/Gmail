package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.fasttrackit.steps.genericSteps.TestBase;
import org.fasttrackit.views.DocsPage;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by SatsangTurya on 10/20/2016.
 */
public class GiveResults extends TestBase{
    private DocsPage documentsPage = PageFactory.initElements(driver,DocsPage.class);
    @Then("^One result is given$")
    public void oneResultIsGiven() {
        documentsPage.faQuestion.isDisplayed();
    }
}
