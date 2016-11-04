package org.fasttrackit.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valeria Marc on 10/21/2016.
 */
public class ResultsPage {
    @FindBy(className = "csb")
    private WebElement Result;
    public WebElement getResult() {return Result;}
}
