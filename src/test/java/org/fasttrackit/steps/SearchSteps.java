package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.deps.difflib.Delta;
import org.fasttrackit.steps.genericSteps.TestBase;
import org.fasttrackit.views.ContactUsPage;
import org.fasttrackit.views.DocsPage;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Field;

/**
 * Created by SatsangTurya on 10/20/2016.
 */
public class SearchSteps extends TestBase {
    private DocsPage documentsPage = PageFactory.initElements(driver, DocsPage.class);
    @When("^Type \"([^\"]*)\" in the search field$")
    public void typeInTheSearchField(String searchKeyWord) {
        documentsPage.docsQuery.sendKeys(searchKeyWord);
    }}