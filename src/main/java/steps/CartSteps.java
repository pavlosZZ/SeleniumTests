package steps;

import elements.CartPage;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartSteps {
    private CartPage myCart;


    public String getItemDescription(String itemName) {
        WebElementFacade itemElement = myCart.getEntireElementByName(itemName);
        return myCart.getDescriptionFor(itemElement).getText();
    }

    public String getItemTitle(String itemName) {
        WebElementFacade itemElement = myCart.getEntireElementByName(itemName);
        return myCart.getTitleFor(itemElement).getText();
    }
}
