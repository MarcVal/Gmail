package org.fasttrackit.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SatsangTurya on 10/19/2016.
 */
public class Header {
    @FindBy(xpath ="//div[not(contains(@class, 'header-navigation2'))]/ul/li/a[text() = 'Docs']")
    private WebElement docslink;

    public WebElement getDocslink() {
        return docslink;
    }
}