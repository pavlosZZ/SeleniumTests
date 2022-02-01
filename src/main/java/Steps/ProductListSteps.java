package Steps;

import Elements.ProductListPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

import java.util.List;


public class ProductListSteps {

    ProductListPage productListPage;


    @Step
    public void showAllProducts(){
        List<WebElementFacade> productList = getProductList();
        for(WebElementFacade item : productList){
            String description = productListPage.getDescription(item).getText();
            System.out.println(description);
        }

    }

    @Step
    public List<WebElementFacade> getProductList(){
        return productListPage.getProductList();
    }



}
