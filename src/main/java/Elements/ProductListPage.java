package Elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;

import javax.swing.*;
import java.util.List;

public class ProductListPage extends PageObject {

    String PRODUCT_LIST = "inventory_item";
    String PRODUCT_DESCRIPTION = "[class='inventory_item_desc']";
    String PRODUCT_PRICE = "[class='inventory_item_price']";
    String ADD_PRODUCT = "[class='btn btn_primary btn_small btn_inventory']";
    String LABEL = "//div[@class='inventory_item_name'][text()='%s']";
    String BACKPACK_LABEL= "[id='item_4_title_link']";
    String BOLD_TSHIRT_LABEL = "[id='item_1_title_link']";
    String RED_TSHIRT_LABEL = "[id='item_3_title_link']";
    String ONESIE_LABEL = "[id='item_2_title_link']";
    String JACKET_LABEL = "[id='item_5_title_link']";
    String BIKE_LIGHT_LABEL = "[id='item_0_title_link']";
    String BACK_BUTTON = "[id='back-to-products']";
    String IMAGE = "[alt='%s']";
    String BACKPACK_IMG= "[alt='Sauce Labs Backpack']";
    String BOLD_TSHIRT_IMG = "[alt='Sauce Labs Bolt T-Shirt']";
    String RED_TSHIRT_IMG = "[id='item_3_title_link']";
    String ONESIE_IMG = "[alt='Test.allTheThings() T-Shirt (Red)']";
    String JACKET_IMG = "[alt='Sauce Labs Fleece Jacket']";
    String BIKE_LIGHT_IMG = "[alt='Sauce Labs Bike Light']";

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

    public WebElementFacade getLabel(WebElementFacade item){
        return item.findBy(By.cssSelector((LABEL)));
    }
    
    public WebElementFacade clickBackpackLabel(){
        return $(By.cssSelector(BACKPACK_LABEL));
    }


    public WebElementFacade clickBoldTshirtLabel() {
        return $(By.cssSelector(BOLD_TSHIRT_LABEL));
    }

    public WebElementFacade clickRedTshirtLabel() {
        return $(By.cssSelector(RED_TSHIRT_LABEL));
    }

    public WebElementFacade clickOnesieLabel() {
        return $(By.cssSelector(ONESIE_LABEL));
    }

    public WebElementFacade clickJacketLabel() {
        return $(By.cssSelector(JACKET_LABEL));
    }

    public WebElementFacade clickBikeLightLabel() {
        return $(By.cssSelector(BIKE_LIGHT_LABEL));
    }

    public WebElementFacade clickBackButton() {
        WebElementFacade item = $(By.cssSelector(BACK_BUTTON));
        System.out.println(item.isDisplayed());
        return $(By.cssSelector(BACK_BUTTON));
    }
    public WebElementFacade clickBackpackImg(){
        return $(By.cssSelector(BACKPACK_IMG));
    }


    public WebElementFacade clickBoldTshirtImg() {
        return $(By.cssSelector(BOLD_TSHIRT_IMG));
    }

    public WebElementFacade clickRedTshirtImg() {
        return $(By.cssSelector(RED_TSHIRT_IMG));
    }

    public WebElementFacade clickOnesieImg() {
        return $(By.cssSelector(ONESIE_IMG));
    }

    public WebElementFacade clickJacketImg() {
        return $(By.cssSelector(JACKET_IMG));
    }

    public WebElementFacade clickBikeLightImg() {
        return $(By.cssSelector(BIKE_LIGHT_IMG));
    }


    public WebElementFacade getLabel2(String label) {
        String selector = String.format(LABEL, label);
        return $(By.xpath(selector));
    }
}
