package Steps;

import Elements.ProductListPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

import java.util.List;
import static org.junit.Assert.assertTrue;


public class ProductListSteps {

    public ProductListPage productListPage;


    @Step
    public void showAllProducts(){
        List<WebElementFacade> productList = getProductList();
        for(WebElementFacade item : productList){
            WebElementFacade description = productListPage.getDescription(item);
            WebElementFacade price = productListPage.getPrice(item);
            WebElementFacade add_product = productListPage.getAddProduct(item);
            System.out.println("For item :" + productListPage.getItem(item).getText() +
                    "\n Is description text displayed? " + description.isDisplayed() +
                    "\n Is price text displayed? :" + price.isDisplayed() +
                    "\n Is add to cart button displayed? :" +   add_product.isDisplayed());
        }
    }

    @Step
    public List<WebElementFacade> getProductList(){
        return productListPage.getProductList();
    }

    @Step
    public void checkProductPrice() {
        List<WebElementFacade> productList = getProductList();
        for (WebElementFacade item : productList) {
            String price = productListPage.getPrice(item).getText();
            String product_label = productListPage.getItem(item).getText();
            System.out.println(product_label);
            switch (product_label) {
                case "Sauce Labs Backpack":
                    assertTrue("$29.99".equalsIgnoreCase(price));
                    break;
                case "Sauce Labs Bike Light":
                    assertTrue("$9.99".equalsIgnoreCase(price));
                    break;
                case "Sauce Labs Bolt T-Shirt":
                case "Test.allTheThings() T-Shirt (Red)":
                    assertTrue("$15.99".equalsIgnoreCase(price));
                    break;
                case "Sauce Labs Fleece Jacket":
                    assertTrue("$49.99".equalsIgnoreCase(price));
                    break;
                case "Sauce Labs Onesie":
                    assertTrue("$7.99".equalsIgnoreCase(price));
                    break;
            }
        }
    }

    @Step
    public void clickLabel(String label){
        productListPage.getLabel(label).click();
    }

    @Step
    public void clickImage(String image){
        productListPage.getImage(image).click();
    }


    @Step
    public void clickBack() {
        productListPage.clickBackButton().click();
    }




}
