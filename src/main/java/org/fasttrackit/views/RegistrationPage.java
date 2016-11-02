package org.fasttrackit.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SatsangTurya on 10/29/2016.
 */
public class RegistrationPage {

    @FindBy (id = "firstname")
    private WebElement firstNameField;
    public WebElement getFirstNameField() {
        return firstNameField;
    }

    @FindBy (id = "lastname")
    private WebElement lastNameField;
    public WebElement getLastNameField() {
        return lastNameField;
    }

    @FindBy (id = "email_address")
    private WebElement emailField;
    public WebElement getEmailField(){
        return emailField;
    }

    @FindBy (id = "day")
    private WebElement dayField;
    public WebElement getDayField() {
        return dayField;
    }

    @FindBy (id = "month")
    private WebElement monthField;
    public WebElement getMonthField() {
        return monthField;
    }

    @FindBy (id = "year")
    private WebElement yearField;
    public WebElement getYearField() {
        return yearField;
    }

    @FindBy (id = "password")
    private WebElement passField;
    public WebElement getPassField() {
        return passField;
    }

    @FindBy (id = "confirmation")
    private WebElement passwordConfirmationField;
    public WebElement getPasswordConfirmationField() {
        return passwordConfirmationField;
    }

    @FindBy (id ="form-validate")
    private WebElement submitButton;
    public WebElement getSubmitButton() {
        return submitButton;
    }

    @FindBy (id = "after-loading-success-message")
    private WebElement successMessage;
    public WebElement getSuccessMessage() {
        return successMessage;
    }

}
