package Elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;

import javax.swing.*;
import java.util.List;

public class ProductListPage extends PageObject {

    String PRODUCT_LIST = "inventory_list";
    String PRODUCT_DESCRIPTION = "[class='inventory_item_desc']";
    String PRODUCT_PRICE = "[class='inventory_item_price']";
    String ADD_PRODUCT = "[class='btn btn_primary btn_small btn_inventory']";
    String LABEL = "[class='inventory_item_name']";

    public List<WebElementFacade> getProductList(){
        return findAll(By.className(PRODUCT_LIST));
    }

    public WebElementFacade getDescription(WebElementFacade item){
        return item.findBy(By.cssSelector(PRODUCT_DESCRIPTION));
    }

    public WebElementFacade getPrice(WebElementFacade item){
        return item.findBy(By.cssSelector(PRODUCT_PRICE));
    }


    public WebElementFacade getAddProduct(WebElementFacade item) {
        return item.findBy(By.cssSelector(ADD_PRODUCT));
    }

    public WebElementFacade getLabel(WebElementFacade item){
        return item.findBy(By.cssSelector((LABEL)));
    }
}
