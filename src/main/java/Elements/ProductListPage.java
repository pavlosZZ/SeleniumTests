package Elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;

import java.util.List;

public class ProductListPage extends PageObject {

    String PRODUCT_LIST = "[class='inventory_list']";
    String PRODUCT_DESCRIPTION = "[class='inventory_item_desc']";

    public List<WebElementFacade> getProductList(){
        return findAll(PRODUCT_LIST);
    }

    public WebElementFacade getDescription(@NotNull WebElementFacade item){
        return item.findBy(By.cssSelector(PRODUCT_DESCRIPTION));
    }



}
