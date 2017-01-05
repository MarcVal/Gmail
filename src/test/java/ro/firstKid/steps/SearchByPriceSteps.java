package ro.firstKid.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ro.firstKid.steps.genericSteps.TestBase;
import ro.firstKid.views.SearchByPricePage;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

/**
 * Created by Valeria Marc on 11/26/2016.
 */
public class SearchByPriceSteps extends TestBase {
    private SearchByPricePage searchByPricePage = PageFactory.initElements(driver, SearchByPricePage.class);

    @And("^I search for the products with price lower than (\\d+) Ron and I add to cart the 2nd product cheaper than 60 Ron$")
    public void iSearchForTheProductsWithPriceLowerThanRon(int price) {
        List<WebElement> productPrice = driver.findElements(By.className("regular-price"));
        int matchProducts = 0;

        for (int i = 0; i < productPrice.size(); i++) {
            String priceText = productPrice.get(i).getText();
            double currentPrice = Double.parseDouble(priceText.split("")[0].replace(",", "."));
            // protected void setElementConverter(org.openqa.selenium.remote.internal.JsonToWebElementConverter final)
            matchProducts++;
            if (currentPrice < price) {
                System.out.println("Product price is smaller than 60 Ron");
                if (matchProducts == 2) {
                    searchByPricePage.getAddToCart().click();
                }
            } else {
                System.out.println("Price is bigger than 60 Ron");
            }
        }
    }

    @And("^I select price range between (\\d+) and (\\d+) Ron;$")
    public void iSelectPriceRangeBetweenAndRon(int minPrice, int maxPrice) {
        searchByPricePage.getCookieClose().click();
        searchByPricePage.getMinPrice().clear();
        searchByPricePage.getMinPrice().sendKeys("150");
        searchByPricePage.getMaxPrice().clear();
        searchByPricePage.getMaxPrice().sendKeys("170");
        searchByPricePage.getFilterButton().click();
    }

    @Then("^I check if all products have the price in range;$")
    public void iCheckIfAllProductsHaveThePriceInRange() {
        List<WebElement> productPrice = driver.findElements(By.className("regular-price"));
        int i = 0;
        for (i = 0; i < productPrice.size(); i++) {
            String priceText = productPrice.get(i).getText();
            double currentPrice = Double.parseDouble(priceText.split(" ")[0].replace(",", "."));
            boolean priceInRange = currentPrice > 150 && currentPrice < 170;
            {
                System.out.println("Price is in searched range. Filter functions correctly.");
            }
            assertThat("Price is not in range: " + currentPrice, priceInRange);

        }
    }


}


