package Elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;


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
    String CART_LIST = "cart_item";
//    String REMOVE_BUTTON = "[class='btn btn_secondary btn_small btn_inventory']";


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

    String ADD_TO_CART = "[class='btn btn_primary btn_small btn_inventory']";
    public List<WebElementFacade> clickAddButtonForAll(){
        return findAll(By.cssSelector(ADD_TO_CART));
    }

    public WebElementFacade getProductsDescription(String text) {
        String selector = String.format(PRODUCT_DESCRIPTION_INTO_CART, text);
        return $(By.xpath(selector));
    }

    public List<WebElementFacade> getCartList(){
        return findAll(By.className(CART_LIST));
    }

//    public List<WebElementFacade> clickedButton(){
//        return findAll(By.cssSelector(REMOVE_BUTTON));
//    }
//
//    String LABEL = "[class='inventory_item_name']";
//    public WebElementFacade getLabel(){
//        return $(By.cssSelector(LABEL));
//    }

}
