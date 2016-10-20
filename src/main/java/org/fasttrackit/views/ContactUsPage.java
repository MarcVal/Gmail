package org.fasttrackit.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage {
    @FindBy(css ="li a[href*='/contact-us/']")
    private WebElement Contact;

    public WebElement getContact() {return Contact;}

@FindBy (id = "google-maps-canvas")
    public WebElement Harta;


}
