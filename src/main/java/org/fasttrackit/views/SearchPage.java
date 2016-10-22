package org.fasttrackit.views;

import com.thoughtworks.selenium.SeleneseTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SatsangTurya on 10/21/2016.
 */

public class SearchPage  {
    @FindBy(name = "q")
    private WebElement Field;
    public WebElement getField() {return Field;}

    @FindBy(name = "btnK")
    private WebElement Button;
    public WebElement getButton() {return Button;}

    @FindBy(xpath = "//div[@id='resultStats']")
    private WebElement Result;
    public WebElement getResult() {return Result;}
}
