package Steps;

import Elements.AddProductPage;
import Elements.ProductListPage;
import Tests.ProductListTest;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class AddProductSteps {

    public AddProductPage addProductPage;
    public ProductListPage productListPage;

    @Step
    public void AddBackpackToCart() {
        addProductPage.clickAddToCartButton().click();
    }

    @Step
    public void clickCart() {
        addProductPage.clickCartButton().click();
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

    @Step
    public void checkCartProducts(String text) {
        List<WebElementFacade> cartList = addProductPage.getCartList();
        for (WebElementFacade item : cartList) {
            String product_label = productListPage.getItem(item).getText();
            String description = productListPage.getDescription(item).getText();
            System.out.println(description);
            switch (product_label) {
                case "Sauce Labs Backpack":
                case "Sauce Labs Bike Light":
                case "Sauce Labs Bolt T-Shirt":
                case "Test.allTheThings() T-Shirt (Red)":
                case "Sauce Labs Fleece Jacket":
                case "Sauce Labs Onesie":
                    assertTrue(text.equalsIgnoreCase(description));
                    break;
            }
        }
    }

//    public List<WebElementFacade> checkProductsIntoCart() {
//        return addProductPage.getCartList();
//    }

//    public void selectAllProduct() {
//        List <WebElementFacade> allButtons = addProductPage.clickAddButtonForAll();
//        for(WebElementFacade button : allButtons){
//            button.click();
//        }
//    }
//
//    public void checkLists(List<WebElementFacade> productList, List<WebElementFacade> cartList) {
//        int count = 0;
//        for(WebElementFacade product : productList){
//            String product_label = addProductPage.getLabel().getText();
//            System.out.println(product_label);
//            for(WebElementFacade item : cartList){
//
//                if(product == item)
//                    count++;
//            }
//        }
//        System.out.println(count);
//        System.out.println(cartList.size());
//        System.out.println(productList.size());
//        assertTrue((cartList.size()) == count);
//    }
}

