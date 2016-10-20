package org.fasttrackit.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DocsPage {
        @FindBy(id = "docsQuery")
        public WebElement docsQuery;

        @FindBy(xpath = "//div[contains(@class, 'home-button')]/i[contains(@class, 'fa-question')]")
        public WebElement faQuestion;

}

