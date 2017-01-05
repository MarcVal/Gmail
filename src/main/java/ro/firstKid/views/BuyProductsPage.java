package ro.firstKid.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valeria Marc on 11/4/2016.
 */
public class BuyProductsPage {

    @FindBy(className = "my-account-link")
    private WebElement myAccountLink;

    public WebElement getMyAccountLink() {
        return myAccountLink;
    }


    @FindBy(className = "top-mini-my-account-login")
    private WebElement myAccountLogin;

    public WebElement getMyAccountLogin() {
        return myAccountLogin;
    }

    @FindBy(xpath = "id('mini-login')")
    private WebElement emailField;

    public WebElement getEmailField() {
        return emailField;
    }

    @FindBy(xpath = "id('mini-password')")
    private WebElement passwordField;

    public WebElement getPasswordField() {
        return passwordField;
    }

    @FindBy(className = "button")
    private WebElement loginButton;

    public WebElement getLoginButton() {
        return loginButton;
    }

    @FindBy(className = "menu-container")
    private WebElement categoryMenu;

    public WebElement getCategoryMenu() {
        return categoryMenu;
    }

    @FindBy(css = "i.category-icon.main-menu-jucarii-si-jocuri")
    private WebElement toysCategory;

    public WebElement getToysCategory() {
        return toysCategory;
    }

    @FindBy(css = "li.col-sw-3:nth-child(19) > a:nth-child(1) > span:nth-child(1)")
    private WebElement smartToysSubcategory;

    public WebElement getSmartToysSubcategory() {
        return smartToysSubcategory;
    }

    @FindBy(xpath = "//a[contains(@title,'Adaugă în coş')]")
    private WebElement addToCartFirstProduct;

    public WebElement getAddToCartFirstProduct() {
        return addToCartFirstProduct;
    }

    @FindBy(xpath = "//span[contains(.,' Adaugă în coş')]")
    private WebElement addToCartLastProduct;

    public WebElement getAddToCartLastProduct() {
        return addToCartLastProduct;
    }

    @FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[6]/div")
    private WebElement quantityTable;

    public WebElement getQuantityTable() {
        return quantityTable;
    }

    @FindBy(id = "shopping-cart-table")
    private WebElement cartTable;

    public WebElement getCartTable() {
        return cartTable;
    }

    @FindBy(xpath = "//a[contains(@class,'table_qty_inc')]")
    private WebElement increaseQuantity1;

    public WebElement getIncreaseQuantity1() {
        return increaseQuantity1;
    }


    @FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td[6]/div/a[2]")
    private WebElement increaseQuantity2;

    public WebElement getIncreaseQuantity2() {
        return increaseQuantity2;
    }

    @FindBy(id = "giant-cookielaw-close-button")
    private WebElement cookieWindowClose;

    public WebElement getCookieWindowClose() {
        return cookieWindowClose;
    }

    @FindBy(xpath = "//button[contains(@title,'Plasează comanda')]")
    private WebElement placeOrderButton;

    public WebElement getPlaceOrderButton() {
        return placeOrderButton;
    }

    @FindBy(xpath = "//input[@value='cashondelivery']")
    private WebElement deliveryPayOption;

    @FindBy(xpath = "//input[@name='billing[city]']")
    private WebElement cityField;

    public WebElement getCityField() {
        return cityField;
    }

    public WebElement getDeliveryPayOption() {
        return deliveryPayOption;
    }

    @FindBy (xpath = "//input[contains(@id,'billing_street1')]")
    private WebElement billingAddress;

    @FindBy (xpath = "//input[contains(@id,'billing_telephone')]")
    private WebElement phoneBilling;

    public WebElement getBillingAddress() {
        return billingAddress;
    }

    public WebElement getPhoneBilling() {
        return phoneBilling;
    }

    @FindBy(xpath = "//input[contains(@name,'agreement[1]')]")
    private WebElement agreementBox;

    public WebElement getAgreementBox() {
        return agreementBox;
    }

    @FindBy(xpath = "//button[@id='submit-btn']")
    private WebElement submitOrder;

    public WebElement getSubmitOrder() {
        return submitOrder;
    }

    @FindBy(xpath = "//h1[contains(.,'Your order has been received.')]")
    private WebElement orderConfirmation;

    public WebElement getOrderConfirmation() {
        return orderConfirmation;
    }
}
