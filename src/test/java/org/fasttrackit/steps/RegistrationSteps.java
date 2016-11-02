package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.fasttrackit.steps.genericSteps.TestBase;
import org.fasttrackit.views.GmailLoginPage;
import org.fasttrackit.views.HomePage;
import org.fasttrackit.views.RegistrationPage;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by SatsangTurya on 10/29/2016.
 */
public class RegistrationSteps extends TestBase {
    private HomePage createAccount = PageFactory.initElements(driver, HomePage.class);
    private RegistrationPage firstNameField = PageFactory.initElements(driver, RegistrationPage.class);
    private RegistrationPage lastNameField = PageFactory.initElements(driver, RegistrationPage.class);
    private RegistrationPage emailField = PageFactory.initElements(driver, RegistrationPage.class);
    private RegistrationPage dayField = PageFactory.initElements(driver, RegistrationPage.class);
    private RegistrationPage monthField = PageFactory.initElements(driver, RegistrationPage.class);
    private RegistrationPage yearField = PageFactory.initElements(driver, RegistrationPage.class);
    private RegistrationPage passField = PageFactory.initElements(driver, RegistrationPage.class);
    private RegistrationPage passwordConfirmationField = PageFactory.initElements(driver, RegistrationPage.class);
    private RegistrationPage submitButton = PageFactory.initElements(driver, RegistrationPage.class);
    private RegistrationPage successMessage = PageFactory.initElements(driver, RegistrationPage.class);

    @And("^I click on registering text link$")
    public void iClickOnRegisteringTextLink() {
       createAccount.getcreateAccount().click();
    }

    @Then("^I type in first name field \"([^\"]*)\"$")
    public void iTypeInFirstNameField(String FirstName) {
        firstNameField.getFirstNameField().sendKeys(FirstName);
    }

    @And("^I type in last name field \"([^\"]*)\"$")
    public void iTypeInLastNameField(String LastName) {
        lastNameField.getLastNameField().sendKeys(LastName);
    }


    @Then("^I type \"([^\"]*)\" in the email field$")
    public void iTypeInTheEmailField(String Email) {
       emailField.getEmailField().sendKeys(Email);
    }

    @And("^I type \"([^\"]*)\" in the day`s field$")
    public void iTypeInTheDaySField(String Day) {
        dayField.getDayField().sendKeys(Day);
    }

    @And("^I type \"([^\"]*)\" in the month`s fiels$")
    public void iTypeInTheMonthSFiels(String Month)  {
        monthField.getMonthField().sendKeys(Month);
    }

    @And("^I type \"([^\"]*)\" in the year`s field$")
    public void iTypeInTheYearSField(String Year)  {
       yearField.getYearField().sendKeys(Year);
    }

    @Then("^I type \"([^\"]*)\" in password`s field$")
    public void iTypeInPasswordSField(String Pass)  {
       passField.getPassField().sendKeys(Pass);
    }

    @And("^I type \"([^\"]*)\" in password confirmation`s field$")
    public void iTypeInPasswordConfirmationSField(String PasswordConfirmation) {
        passwordConfirmationField.getPasswordConfirmationField().sendKeys(PasswordConfirmation);
    }

    @Then("^I click on submision button$")
    public void iClickOnSubmisionButton()  {
        submitButton.getSubmitButton().click();
    }


    @And("^I validate Registration.$")
    public void iValidateRegistration() {
        successMessage.getSuccessMessage().isDisplayed();
    }
}


