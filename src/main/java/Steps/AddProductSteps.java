package Steps;

import Elements.AddProductPage;
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
    public void checkBackpack() {
        assertTrue(addProductPage.getBackPack().isDisplayed());
    }

    @Step
    public void AddBoltTshirtToCart() {
        addProductPage.clickAddBoltTshirtButton().click();
    }


    @Step
    public void checkBoltTshirt() {
        assertTrue(addProductPage.getBoltTshirt().isDisplayed());
    }

    @Step
    public void AddRedTshirtToCart() {
        addProductPage.clickAddRedTshirtButton().click();
    }

    @Step
    public void checkRedTshirt() {
        assertTrue(addProductPage.getRedTshirt().isDisplayed());
    }

    @Step
    public void AddBikeLightToCart() {
        addProductPage.clickAddBikeLightButton().click();
    }

    @Step
    public void checkBikeLight() {
        assertTrue(addProductPage.getBikeLight().isDisplayed());
    }

    @Step
    public void AddJacketToCart() {
        addProductPage.clickAddJacketButton().click();
    }

    @Step
    public void checkJacket() {
        assertTrue(addProductPage.getJacket().isDisplayed());
    }

    @Step
    public void AddOnesieToCart() {
        addProductPage.clickAddOnesieButton().click();
    }

    @Step
    public void checkOnesie() {
        assertTrue(addProductPage.getOnesie().isDisplayed());
    }
}
