package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.fasttrackit.steps.genericSteps.TestBase;
import org.fasttrackit.views.FirstKidBuyPage;
import org.fasttrackit.views.RegistrationPage;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Valeria Marc on 11/4/2016.
 */
public class FirstKidBuySteps extends TestBase {
    private FirstKidBuyPage firstKidBuyPage = PageFactory.initElements(driver, FirstKidBuyPage.class);
    private RegistrationPage myAccountLink = PageFactory.initElements(driver, RegistrationPage.class);


    @Given("^I go to \"([^\"]*)\"$")
    public void iGoTo(String link) {
        driver.get(link);
    }


    @And("^I login as firstkit client;$")
    public void iLoginAsFirstkitClient() {
        mouseOver(firstKidBuyPage.getMyAccountLink());
        firstKidBuyPage.getMyAccountLogin().click();
        firstKidBuyPage.getEmailField().sendKeys("tesstarre@gmail.com");
        firstKidBuyPage.getPasswordField().sendKeys("kinderesti");
        firstKidBuyPage.getLoginButton().click();
    }

    @And("^I click on category menu$")
    public void iClickOnCategoryMenu()  {
    firstKidBuyPage.getCategoryMenu().click();    }

    @And("^I move mouse over the (\\d+)th category of products and I click on the (\\d+)th subcategory of products;$")
    public void iMoveMouseOverTheThCategoryOfProductsAndIClickOnTheThSubcategoryOfProducts(int eight, int seven)  {
      mouseOver(firstKidBuyPage.getToysCategory());
        firstKidBuyPage.getSmartToysSubcategory().click();
    }
}

