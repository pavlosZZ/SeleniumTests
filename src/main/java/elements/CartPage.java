package elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    String ITEM_BY_NAME = "//div[@class='cart_item' and .//button[contains(@id,'%s')]]";
    String ITEM_DESCRIPTION = "[class='inventory_item_desc']";
    String ITEM_TITLE = "[class='inventory_item_name']";

    public WebElementFacade getEntireElementByName(String name) {
        String selector = String.format(ITEM_BY_NAME, name);
        return $(By.xpath(selector));
    }

    public WebElementFacade getDescriptionFor(WebElementFacade itemElement) {
        return itemElement.then(By.cssSelector(ITEM_DESCRIPTION));
    }


    public WebElementFacade getTitleFor(WebElementFacade itemElement) {
        return itemElement.then(By.cssSelector(ITEM_TITLE));
    }
}
