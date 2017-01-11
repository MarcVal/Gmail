package com.Gmail.steps.genericSteps;

import com.Gmail.utils.TestUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GenericSteps extends TestBase {

    @Given("^I open \"([^\"]*)\"$")
    public void openUrl(String url) {
        driver.get(url);
    }

    @And("^I wait (\\d+) second(?:s*)$")
    public void waitSeconds(int seconds) {
        TestUtils.sleep(seconds * 1000);
    }

    @Then("^I am redirected to \"([^\"]*)\"$")
    public void I_am_redirected_to(String redirectionUrl) {
        String currentUrl = driver.getCurrentUrl();
        assertThat("Redirection failed.", currentUrl, is(redirectionUrl));
    }

    @Given("^Go to \"([^\"]*)\"$")
    public void goTo(String link) {
        driver.get(link);
    }



    @And("^I wait for display$")
    public void iWaitForDisplay() {
       waitSeconds(5);
    }

}