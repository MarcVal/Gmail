package ro.firstKid.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import ro.firstKid.steps.genericSteps.TestBase;
import ro.firstKid.views.BuyProductsPage;
import ro.firstKid.views.RegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Valeria Marc on 11/4/2016.
 */
public class BuyProductsSteps extends TestBase {
    private BuyProductsPage buyProductsPage = PageFactory.initElements(driver, BuyProductsPage.class);


    @Given("^I go to \"([^\"]*)\"$")
    public void iGoTo(String link) {
        driver.get(link);
    }


    @And("^I login as firstkid client;$")
    public void iLoginAsFirstkitClient() {
        mouseOver(buyProductsPage.getMyAccountLink());
        buyProductsPage.getMyAccountLink().click();
        // buyProductsPage.getMyAccountLogin().click();
        buyProductsPage.getEmailField().sendKeys("tesstarre@gmail.com");
        buyProductsPage.getPasswordField().sendKeys("KINDERESTI");
        buyProductsPage.getLoginButton().click();
    }

    @And("^I click on category menu$")
    public void iClickOnCategoryMenu() {
        buyProductsPage.getCategoryMenu().click();
    }

    @And("^I move mouse over the (\\d+)th category of products and I click on the (\\d+)th subcategory of products;$")
    public void iMoveMouseOverTheThCategoryOfProductsAndIClickOnTheThSubcategoryOfProducts(int eight, int seven) {
        mouseOver(buyProductsPage.getToysCategory());
        buyProductsPage.getSmartToysSubcategory().click();
    }

    @And("^I add to cart the first product on page$")
    public void iAddToCartTheFirstAndLastProductOnPage() {
        buyProductsPage.getAddToCartFirstProduct().click();
        driver.navigate().back();
        buyProductsPage.getAddToCartLastProduct().click();
    }

    @And("^I increase the quantity in my cart for the both purchased products$")
    public void iIncreaseTheQuantityInMyCartForTheBothPurchasedProducts() throws InterruptedException {
        buyProductsPage.getCookieWindowClose().click();
        driver.findElement(By.xpath("//a[contains(@class,'table_qty_inc')]")).click();
        Thread.sleep(2000);
        buyProductsPage.getIncreaseQuantity1().click();
        driver.findElement(By.xpath("//a[contains(@class,'table_qty_inc')]")).click();
        Thread.sleep(2000);
        // buyProductsPage.getIncreaseQuantity2().click();
    }

    @And("^I click on the Launch order button$")
    public void iClickOnTheLaunchOrderButton() {
        buyProductsPage.getPlaceOrderButton().click();
    }

    @And("^I select the pay on delivery option$")
    public void iSelectThePayOnDeliveryOption() {
        buyProductsPage.getDeliveryPayOption().click();
    }


    @And("^I check the agreement box of the store and I send the order$")
    public void iCheckTheAgreementBoxOfTheStoreAndISendTheOrder() {
        buyProductsPage.getAgreementBox().click();
        buyProductsPage.getSubmitOrder().click();

    }


    @Then("^I receive the order placement confirmation message$")
    public void iReceiveTheOrderPlacementConfirmationMessage() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        buyProductsPage.getOrderConfirmation().isDisplayed();
    }

    @And("^I complete the billing and delivery address$")
    public void iCompleteTheBillingAndDeliveryAddress() {
        buyProductsPage.getCityField().sendKeys("Cluj-Napoca");
        buyProductsPage.getBillingAddress().sendKeys("str. Florilor, nr.5");
        buyProductsPage.getPhoneBilling().sendKeys("0777 878575");
    }
}

