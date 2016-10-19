package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.fasttrackit.steps.genericSteps.TestBase;
import org.fasttrackit.views.ExamplePage;
import org.fasttrackit.views.Header;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by SatsangTurya on 10/19/2016.
 */
public class HeaderSteps extends TestBase {
    private Header header = PageFactory.initElements(driver, Header.class);
    @And("^Click on DOCS$")
    public void clickOnDOCS() {
       header.getDocslink().click();
    }
}
