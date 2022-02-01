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

    @Step
    public void clickLabel(String label){
        productListPage.getLabel2(label).click();
    }

    @Step
    public void clickImage(String image){
        productListPage.getImage(image).click();
    }

    @Step
    public void clickBackPack(){
        productListPage.clickBackpackLabel().click();
        String EXPECTED_URL = "https://www.saucedemo.com/inventory-item.html?id=4";
        String CURRENT_URL = productListPage.getDriver().getCurrentUrl();
        assertTrue("Wrong login page url.", EXPECTED_URL.equals(CURRENT_URL));
        productListPage.clickBackButton();
        productListPage.clickBackpackImg().click();
        assertTrue("Wrong login page url.", EXPECTED_URL.equals(CURRENT_URL));
    }
    @Step
    public void clickBoldTshirt() {
        productListPage.clickBoldTshirtLabel().click();
        String EXPECTED_URL = "https://www.saucedemo.com/inventory-item.html?id=1";
        String CURRENT_URL = productListPage.getDriver().getCurrentUrl();
        assertTrue("Wrong login page url.", EXPECTED_URL.equals(CURRENT_URL));
        productListPage.clickBackButton();
        productListPage.clickBoldTshirtImg().click();
        assertTrue("Wrong login page url.", EXPECTED_URL.equals(CURRENT_URL));
    }
    @Step
    public void clickRedTshirt() {
        productListPage.clickRedTshirtLabel().click();
        String EXPECTED_URL = "https://www.saucedemo.com/inventory-item.html?id=3";
        String CURRENT_URL = productListPage.getDriver().getCurrentUrl();
        assertTrue("Wrong login page url.", EXPECTED_URL.equals(CURRENT_URL));
        clickBack();
        productListPage.clickRedTshirtImg().click();
        assertTrue("Wrong login page url.", EXPECTED_URL.equals(CURRENT_URL));
    }
    @Step
    public void clickOnesie() {
        productListPage.clickOnesieLabel().click();
        String EXPECTED_URL = "https://www.saucedemo.com/inventory-item.html?id=2";
        String CURRENT_URL = productListPage.getDriver().getCurrentUrl();
        assertTrue("Wrong login page url.", EXPECTED_URL.equals(CURRENT_URL));
        clickBack();
        productListPage.clickOnesieImg().click();
        assertTrue("Wrong login page url.", EXPECTED_URL.equals(CURRENT_URL));
    }
    @Step
    public void clickJacket() {
        productListPage.clickJacketLabel().click();
        String EXPECTED_URL = "https://www.saucedemo.com/inventory-item.html?id=5";
        String CURRENT_URL = productListPage.getDriver().getCurrentUrl();
        assertTrue("Wrong login page url.", EXPECTED_URL.equals(CURRENT_URL));
        productListPage.clickBackButton();
        productListPage.clickJacketImg().click();
        assertTrue("Wrong login page url.", EXPECTED_URL.equals(CURRENT_URL));
    }
    @Step
    public void clickBikeLight() {
        productListPage.clickBikeLightLabel().click();
        String EXPECTED_URL = "https://www.saucedemo.com/inventory-item.html?id=0";
        String CURRENT_URL = productListPage.getDriver().getCurrentUrl();
        assertTrue("Wrong login page url.", EXPECTED_URL.equals(CURRENT_URL));
        productListPage.clickBackButton();
        productListPage.clickBikeLightImg().click();
        assertTrue("Wrong login page url.", EXPECTED_URL.equals(CURRENT_URL));
    }
    @Step
    public void clickBack() {
        productListPage.clickBackButton().click();
    }
}
