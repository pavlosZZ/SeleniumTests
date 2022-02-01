package Steps;

import Elements.ProductListPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ProductListSteps {

    public ProductListPage productListPage;


    @Step
    public void showAllProducts(){
        List<WebElementFacade> productList = getProductList();
        for(WebElementFacade item : productList){
            String description = productListPage.getDescription(item).getText();
            String price = productListPage.getPrice(item).getText();
            String add_product = productListPage.getAddProduct(item).getText();
            System.out.println(description + "\n" + price + "\n" +   add_product);
        }
    }

    @Step
    public List<WebElementFacade> getProductList(){
        return productListPage.getProductList();
    }

    @Step
    public void checkProductPrice() {
        List<WebElementFacade> productList = getProductList();
        int count = 0;
        for(WebElementFacade item : productList){
            String price = productListPage.getPrice(item).getText();
            String product_label = productListPage.getLabel(item).getText();
            System.out.println(product_label);
//            int checked_price = Integer.parseInt(price);
            if(product_label.equalsIgnoreCase("Sauce Labs Backpack"))
                assertTrue("$29.99".equalsIgnoreCase(price));
            else if(product_label.equalsIgnoreCase("Sauce Labs Bike Light"))
                assertTrue("$9.99".equalsIgnoreCase(price));
            else if(product_label.equalsIgnoreCase("Sauce Labs Bolt T-Shirt"))
                assertTrue("$15.99".equalsIgnoreCase(price));
            else if(product_label.equalsIgnoreCase("Sauce Labs Fleece Jacket"))
                assertTrue("$49.99".equalsIgnoreCase(price));
            else if(product_label.equalsIgnoreCase("Sauce Labs Onesie"))
                assertTrue("$7.99".equalsIgnoreCase(price));
            else if(product_label.equalsIgnoreCase("Test.allTheThings() T-Shirt (Red)"))
                assertTrue("$15.99".equalsIgnoreCase(price));
            count++;

        }
        System.out.println(count);
    }
}
