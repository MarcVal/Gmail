package ro.firstKid.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valeria Marc on 11/26/2016.
 */
public class SearchByPricePage {

    public WebElement getProductPrice() {
        return productPrice;
    }

    public WebElement getAddToCart() {
        return addToCart;
    }

    @FindBy (className = "regular-price")
   private WebElement productPrice;

    @FindBy (xpath = "//a[contains(@title,'Adaugă în coş')]")
    private WebElement addToCart;

    @FindBy (xpath = "//input[@class='priceTextBox minPrice']")
    private WebElement minPrice;
    public WebElement getMinPrice() {
        return minPrice;
    }

    @FindBy (xpath = "//input[@class='priceTextBox maxPrice']")
    private  WebElement maxPrice;
    public WebElement getMaxPrice() {
        return maxPrice;
    }

    @FindBy (xpath = "//input[@value='FILTER']")
    private WebElement filterButton;
    public WebElement getFilterButton() {
        return filterButton;
    }

    @FindBy (xpath = "//strong[contains(.,'x')]")
    private WebElement cookieClose;
    public WebElement getCookieClose() {
        return cookieClose;
    }
}



