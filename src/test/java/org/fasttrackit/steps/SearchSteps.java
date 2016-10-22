package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import org.fasttrackit.steps.genericSteps.TestBase;
import org.fasttrackit.views.GmailLoginPage;
import org.fasttrackit.views.SearchPage;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fasttrackit.steps.genericSteps.TestBase;
import org.fasttrackit.views.ContactUsPage;
import org.fasttrackit.views.SearchPage;
import org.openqa.selenium.support.PageFactory;
import java.lang.reflect.Field;


/**
 * Created by SatsangTurya on 10/21/2016.
 */
public class SearchSteps extends TestBase {

    private SearchPage Field = PageFactory.initElements(driver,SearchPage.class);
    private SearchPage Button = PageFactory.initElements(driver,SearchPage.class);
    //private GmailLoginPage Username = PageFactory.initElements(driver,GmailLoginPage.class);

    @When("^Type \"([^\"]*)\" in the search field$")
    public void typeInTheSearchField(String ITCluj) {
        Field.getField().sendKeys(ITCluj);
        ;
    }
    @When("^I press the Search button$")
    public void iPressTheSearchButton() {
        Button.getButton().click();

    }
    }

