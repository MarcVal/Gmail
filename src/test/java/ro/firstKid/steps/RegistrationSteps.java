package ro.firstKid.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ro.firstKid.steps.genericSteps.TestBase;
import ro.firstKid.views.RegistrationPage;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ro.firstKid.utils.TestUtils;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


/**
 * Created by SatsangTurya on 10/29/2016.
 */
public class RegistrationSteps extends TestBase {

    private RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);

    @Given("^Go to \"([^\"]*)\"$")
    public void goTo(String link) {
        driver.get(link);
    }

    @And("^I close the subscribe invitation window$")
    public void iCloseTheWindow() {
     registrationPage.getCloseWindow().click();

    }

    @Then("^I move mouse over the My account menu$")
    public void iHoverTheMousePointerOverMyAccount() {
        mouseOver(registrationPage.getMyAccountLink());
    }

    @And("^I wait for display$")
    public void waitSeconds(int seconds) {
        TestUtils.sleep(seconds);

        }

    @And("^I click on registering text link$")
    public void iClickOnRegisteringTextLink() {
        registrationPage.getcreateAccount().click();
    }

    @Then("^I type in first name field \"([^\"]*)\"$")
    public void iTypeInFirstNameField(String FirstName) {
        registrationPage.getFirstNameField().sendKeys(FirstName);
    }

    @And("^I type in last name field \"([^\"]*)\"$")
    public void iTypeInLastNameField(String LastName) {
        registrationPage.getLastNameField().sendKeys(LastName);
    }


    @Then("^I type \"([^\"]*)\" in the email field$")
    public void iTypeInTheEmailField(String Email) {
        registrationPage.getEmailField().sendKeys(Email);
    }

    @And("^I type \"([^\"]*)\" in the day`s field$")
    public void iTypeInTheDaySField(String Day) {
        registrationPage.getDayField().sendKeys(Day);
    }

    @And("^I type \"([^\"]*)\" in the month`s fiels$")
    public void iTypeInTheMonthSFiels(String Month) {
        registrationPage.getMonthField().sendKeys(Month);
    }

    @And("^I type \"([^\"]*)\" in the year`s field$")
    public void iTypeInTheYearSField(String Year) {
        registrationPage.getYearField().sendKeys(Year);
    }

    @Then("^I type \"([^\"]*)\" in password`s field$")
    public void iTypeInPasswordSField(String Pass) {
        registrationPage.getPassField().sendKeys(Pass);
    }

    @And("^I type \"([^\"]*)\" in password confirmation`s field$")
    public void iTypeInPasswordConfirmationSField(String PasswordConfirmation) {
        registrationPage.getPasswordConfirmationField().sendKeys(PasswordConfirmation);
    }

    @Then("^I click on submision button$")
    public void iClickOnSubmisionButton() {
        registrationPage.getSubmitButton().click();
    }


    @And("^I validate Registration.$")
    public void iValidateRegistration() {
        registrationPage.getSuccessMessage().isDisplayed();
    }
}


