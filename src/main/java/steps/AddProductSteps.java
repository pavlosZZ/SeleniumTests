package steps;

import elements.AddProductPage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertTrue;

public class AddProductSteps {

    public AddProductPage addProductPage;

    @Step
    public void AddBackpackToCart() {
        addProductPage.clickAddToCartButton().click();
    }

    @Step
    public void clickCart() {
        addProductPage.clickCartButton().click();
    }

    @Step
    public void addItemToCart(String itemName) {
        addProductPage.addItemToCartItem(itemName).click();
    }

    @Step
    public String getItemDescription() {
        return addProductPage.getItemDescription().getText();
    }

    @Step
    public String getItemTitle() {
        return addProductPage.getItemTitle().getText();
    }


    @Step
    public void AddBoltTshirtToCart() {
        addProductPage.clickAddBoltTshirtButton().click();
    }

    @Step
    public void AddRedTshirtToCart() {
        addProductPage.clickAddRedTshirtButton().click();
    }

    @Step
    public void AddBikeLightToCart() {
        addProductPage.clickAddBikeLightButton().click();
    }

    @Step
    public void AddJacketToCart() {
        addProductPage.clickAddJacketButton().click();
    }

    @Step
    public void AddOnesieToCart() {
        addProductPage.clickAddOnesieButton().click();
    }

    @Step
    public void checkLabel(String text) {
        assertTrue(addProductPage.getProductsLabel(text).isDisplayed());
    }

    @Step
    public void checkDescription(String text) {
        assertTrue(addProductPage.getProductsDescription(text).isDisplayed());
    }
}
