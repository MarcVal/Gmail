package com.Gmail.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valeria Marc on 11/7/2016.
 */
public class SendingEmailPage {

    @FindBy(xpath = "//div[contains(@gh,'cm')]")
    private WebElement composeButton;

    public WebElement getComposeButton() {
        return composeButton;
    }

    @FindBy(xpath = "//td[contains(@class,'gU OoRYyc')]")
    private WebElement composeDialog;

    public WebElement getComposeDialog() {
        return composeDialog;
    }

    @FindBy(xpath = "//textarea[@role='combobox']")
    private WebElement toField;

    public WebElement getToField() {
        return toField;
    }

    @FindBy(xpath = "//input[@name='subjectbox']")
    private WebElement subjectField;

    public WebElement getSubjectField() {
        return subjectField;
    }

    @FindBy(xpath = "//div[@aria-label='Message Body']")
    private WebElement messageBox;

    public WebElement getMessageBox() {
        return messageBox;

    }

    @FindBy(id = ":qb")
    private WebElement attachIcon;

    public WebElement getAttachIcon() {
        return attachIcon;
    }

    @FindBy(xpath = "//div[@data-tooltip='Send \u202A(Ctrl-Enter)\u202C']")
    private WebElement sendButton;

    public WebElement getSendButton() {
        return sendButton;
    }

    @FindBy(xpath = "//div[contains(@class,'QT aaA aMZ')]")
    private WebElement emoticonIcon;

    public WebElement getEmoticonIcon() {
        return emoticonIcon;
    }

    @FindBy(xpath = "//button[@title='Show face emoticons']")
    private WebElement showFaces;

    public WebElement getShowFaces() {
        return showFaces;
    }

    @FindBy(xpath = "//button[@string='1f60e']")
    private WebElement smiley;

    public WebElement getSmiley() {
        return smiley;

    }

    @FindBy(xpath = "//a[@title='Sent Mail']")
    private WebElement sentEmail;

    public WebElement getSentEmail() {
        return sentEmail;
    }

    @FindBy(xpath = "//div[contains(.,'Your message has been sent. View message')]")
    private WebElement confirmationMessage;

    public WebElement getConfirmationMessage() {
        return confirmationMessage;
    }
}
