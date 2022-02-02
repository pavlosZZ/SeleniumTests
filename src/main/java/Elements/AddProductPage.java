package Elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;


public class AddProductPage extends PageObject {

    String CART_BUTTON = "[class='shopping_cart_link']";
    String BACKPACK_TO_CART = "[name='add-to-cart-sauce-labs-backpack']";
    String BACKPACK_INTO_CART= "[id='item_4_title_link']";
    String BIKE_LIGHT_TO_CART  = "[name='add-to-cart-sauce-labs-bike-light']";
    String BIKE_LIGHT_INTO_CART ="[id='item_0_title_link']";
    String BOLT_TSHIRT_TO_CART = "[name='add-to-cart-sauce-labs-bolt-t-shirt']" ;
    String BOLT_TSHIRT_INTO_CART = "[id='item_1_title_link']";
    String RED_TSHIRT_TO_CART = "[name='add-to-cart-test.allthethings()-t-shirt-(red)']";
    String RED_TSHIRT_INTO_CART = "[id='item_3_title_link']";
    String JACKET_TO_CART = "[name='add-to-cart-sauce-labs-fleece-jacket']";
    String JACKET_INTO_CART= "[id='item_5_title_link']";
    String ONESIE_TO_CART = "[name='add-to-cart-sauce-labs-onesie']";
    String ONESIE_INTO_CART = "[id='item_2_title_link']";

    public WebElementFacade clickAddToCartButton() {
        return $(By.cssSelector(BACKPACK_TO_CART));
    }
    public WebElementFacade clickAddBikeLightButton() {
        return $(By.cssSelector(BIKE_LIGHT_TO_CART));
    }
    public WebElementFacade clickAddBoltTshirtButton() {
        return $(By.cssSelector(BOLT_TSHIRT_TO_CART));
    }
    public WebElementFacade clickAddRedTshirtButton() {
        return $(By.cssSelector(RED_TSHIRT_TO_CART));
    }
    public WebElementFacade clickAddOnesieButton() {
        return $(By.cssSelector(ONESIE_TO_CART));
    }
    public WebElementFacade clickAddJacketButton() {
        return $(By.cssSelector(JACKET_TO_CART));
    }

    public WebElementFacade clickCartButton() {
        return $(By.cssSelector(CART_BUTTON));
    }


    public WebElementFacade getBackPack() {
        return $(By.cssSelector(BACKPACK_INTO_CART));
    }

    public WebElementFacade getBoltTshirt() {
        return $(By.cssSelector(BOLT_TSHIRT_INTO_CART));
    }

    public WebElementFacade getRedTshirt() {
        return $(By.cssSelector(RED_TSHIRT_INTO_CART));
    }

    public WebElementFacade getBikeLight() {
        return $(By.cssSelector(BIKE_LIGHT_INTO_CART));
    }

    public WebElementFacade getJacket() {
        return $(By.cssSelector(JACKET_INTO_CART));
    }

    public WebElementFacade getOnesie() {
        return $(By.cssSelector(ONESIE_INTO_CART));
    }
}
