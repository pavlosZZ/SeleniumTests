package Elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;


public class AddProductPage extends PageObject {

    String CART_BUTTON = "[class='shopping_cart_link']";
    String PRODUCT_LABEL_INTO_CART = "//div[@class='inventory_item_name'][text()='%s']";
    String PRODUCT_DESCRIPTION_INTO_CART = "//div[@class='inventory_item_desc'][text()='%s']";
    String BACKPACK_TO_CART = "[name='add-to-cart-sauce-labs-backpack']";
    String BIKE_LIGHT_TO_CART  = "[name='add-to-cart-sauce-labs-bike-light']";
    String BOLT_TSHIRT_TO_CART = "[name='add-to-cart-sauce-labs-bolt-t-shirt']" ;
    String RED_TSHIRT_TO_CART = "[name='add-to-cart-test.allthethings()-t-shirt-(red)']";
    String JACKET_TO_CART = "[name='add-to-cart-sauce-labs-fleece-jacket']";
    String ONESIE_TO_CART = "[name='add-to-cart-sauce-labs-onesie']";

    public  WebElementFacade getProductsLabel(String text){
        String selector = String.format(PRODUCT_LABEL_INTO_CART, text);
        return $(By.xpath(selector));
    }
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


    public WebElementFacade getProductsDescription(String text) {
        String selector = String.format(PRODUCT_DESCRIPTION_INTO_CART, text);
        return $(By.xpath(selector));
    }
}
