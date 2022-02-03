package elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class ProductListPage extends PageObject {

    String PRODUCT_LIST = "inventory_item";
    String PRODUCT_DESCRIPTION = "[class='inventory_item_desc']";
    String PRODUCT_PRICE = "[class='inventory_item_price']";
    String ADD_PRODUCT = "[class='btn btn_primary btn_small btn_inventory']";
    String ITEM = "[class='inventory_item_name']";
    String LABEL = "//div[@class='inventory_item_name'][text()='%s']";
    String BACK_BUTTON = "[id='back-to-products']";
    String IMAGE = "[alt='%s']";

    public List<WebElementFacade> getProductList(){
        return findAll(By.className(PRODUCT_LIST));
    }

    public WebElementFacade getDescription(WebElementFacade item){
        return item.findBy(By.cssSelector(PRODUCT_DESCRIPTION));
    }

    public WebElementFacade getPrice(WebElementFacade item){
        return item.findBy(By.cssSelector(PRODUCT_PRICE));
    }


    public WebElementFacade getImage(String image){
        String selector = String.format(IMAGE, image);
        return $(By.cssSelector(selector));
    }
    public WebElementFacade getAddProduct(WebElementFacade item) {
        return item.findBy(By.cssSelector(ADD_PRODUCT));
    }

    public WebElementFacade getItem(WebElementFacade item){
        return item.findBy(By.cssSelector((ITEM)));
    }

    public WebElementFacade clickBackButton() {
        WebElementFacade item = $(By.cssSelector(BACK_BUTTON));
        System.out.println(item.isDisplayed());
        return $(By.cssSelector(BACK_BUTTON));
    }

    public WebElementFacade getLabel(String label) {
        String selector = String.format(LABEL, label);
        return $(By.xpath(selector));
    }



}
