package ro.firstKid.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valeria Marc on 10/29/2016.
 */
public class RegistrationPage {

    @FindBy(className = "sumome-vex-close")
    private WebElement closeWindow;

    public WebElement getCloseWindow() {
        return closeWindow;
    }

    @FindBy(className = "my-account-link")
    private WebElement myAccountLink;

    public WebElement getMyAccountLink() {
        return myAccountLink;
    }

    @FindBy(xpath = "//a[contains(@class,'create-account-link')]")
    private WebElement createAccount;

    public WebElement getcreateAccount() {
        return createAccount;
    }

    @FindBy(id = "firstname")
    private WebElement firstNameField;

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    @FindBy(id = "lastname")
    private WebElement lastNameField;

    public WebElement getLastNameField() {
        return lastNameField;
    }

    @FindBy(id = "email_address")
    private WebElement emailField;

    public WebElement getEmailField() {
        return emailField;
    }

    @FindBy(id = "day")
    private WebElement dayField;

    public WebElement getDayField() {
        return dayField;
    }

    @FindBy(id = "month")
    private WebElement monthField;

    public WebElement getMonthField() {
        return monthField;
    }

    @FindBy(id = "year")
    private WebElement yearField;

    public WebElement getYearField() {
        return yearField;
    }

    @FindBy(id = "password")
    private WebElement passField;

    public WebElement getPassField() {
        return passField;
    }

    @FindBy(id = "confirmation")
    private WebElement passwordConfirmationField;

    public WebElement getPasswordConfirmationField() {
        return passwordConfirmationField;
    }

    @FindBy(id = "form-validate")
    private WebElement submitButton;

    public WebElement getSubmitButton() {
        return submitButton;
    }

    @FindBy(id = "after-loading-success-message")
    private WebElement successMessage;

    public WebElement getSuccessMessage() {
        return successMessage;
    }


}
