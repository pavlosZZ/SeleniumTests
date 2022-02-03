package Tests;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Steps.*;

import java.util.List;

@RunWith(SerenityRunner.class)
public class AddProductTests {

    @Managed
    WebDriver driver ;
    String URL = "https://www.saucedemo.com/";


    @Steps
    LoginSteps loginSteps;
    @Steps
    AddProductSteps addProductSteps;
    @Steps
    ProductListSteps productListSteps;

    @Before
    public void beforeTest()  {
        driver.navigate().to(URL);
        driver.manage().window().maximize();
    }

    @Test
    public void addBackpackToCartFromMainPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        addProductSteps.AddBackpackToCart();
        addProductSteps.clickCart();
        addProductSteps.checkLabel(ProductListTest.Items.BACKPACK.getText());
        addProductSteps.checkDescription(ProductListTest.Items.BACKPACK_DESCRIPTION.getText());

    }

    @Test
    public void addBoltTshirtToCartFromMainPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        addProductSteps.AddBoltTshirtToCart();
        addProductSteps.clickCart();
        addProductSteps.checkLabel(ProductListTest.Items.BOLD_TSHIRT.getText());
        addProductSteps.checkDescription(ProductListTest.Items.BOLD_TSHIRT_DESCRIPTION.getText());
    }

    @Test
    public void addRedTshirtToCartFromMainPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        addProductSteps.AddRedTshirtToCart();
        addProductSteps.clickCart();
        addProductSteps.checkLabel(ProductListTest.Items.RED_TSHIRT.getText());
        addProductSteps.checkDescription(ProductListTest.Items.RED_TSHIRT_DESCRIPTION.getText());
    }

    @Test
    public void addBikeLightToCartFromMainPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        addProductSteps.AddBikeLightToCart();
        addProductSteps.clickCart();
        addProductSteps.checkCartProducts(ProductListTest.Items.BIKE_LIGHT_DESCRIPTION.getText());
//        addProductSteps.checkLabel(ProductListTest.Items.BIKE_LIGHT.getText());
//        addProductSteps.checkDescription(ProductListTest.Items.BIKE_LIGHT_DESCRIPTION.getText());
    }

    @Test
    public void addJacketToCartFromMainPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        addProductSteps.AddJacketToCart();
        addProductSteps.clickCart();
        addProductSteps.checkCartProducts(ProductListTest.Items.JACKET_DESCRIPTION.getText());
//        addProductSteps.checkLabel(ProductListTest.Items.JACKET.getText());
//        addProductSteps.checkDescription(ProductListTest.Items.JACKET_DESCRIPTION.getText());
    }

    @Test
    public void addOnesieToCartFromMainPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        addProductSteps.AddOnesieToCart();
        addProductSteps.clickCart();
        addProductSteps.checkCartProducts(ProductListTest.Items.ONESIE_DESCRIPTION.getText());
//        addProductSteps.checkLabel(ProductListTest.Items.ONESIE.getText());
//        addProductSteps.checkDescription(ProductListTest.Items.ONESIE_DESCRIPTION.getText());
    }

    @Test
    public void addBackpackToCartFromInfoPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickLabel(ProductListTest.Items.BACKPACK.getText());
        addProductSteps.AddBackpackToCart();
        addProductSteps.clickCart();
        addProductSteps.checkLabel(ProductListTest.Items.BACKPACK.getText());
        addProductSteps.checkDescription(ProductListTest.Items.BACKPACK_DESCRIPTION.getText());
    }

    @Test
    public void addBoltTshirtToCartFromInfoPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickLabel(ProductListTest.Items.BOLD_TSHIRT.getText());
        addProductSteps.AddBoltTshirtToCart();
        addProductSteps.clickCart();
        addProductSteps.checkLabel(ProductListTest.Items.BOLD_TSHIRT.getText());
        addProductSteps.checkDescription(ProductListTest.Items.BOLD_TSHIRT_DESCRIPTION.getText());

    }

    @Test
    public void addRedTshirtToCartFromInfoPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickLabel(ProductListTest.Items.RED_TSHIRT.getText());
        addProductSteps.AddRedTshirtToCart();
        addProductSteps.clickCart();
        addProductSteps.checkLabel(ProductListTest.Items.RED_TSHIRT.getText());
        addProductSteps.checkDescription(ProductListTest.Items.RED_TSHIRT_DESCRIPTION.getText());
    }

    @Test
    public void addBikeLightToCartFromInfoPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickLabel(ProductListTest.Items.BIKE_LIGHT.getText());
        addProductSteps.AddBikeLightToCart();
        addProductSteps.clickCart();
        addProductSteps.checkCartProducts(ProductListTest.Items.BIKE_LIGHT_DESCRIPTION.getText());
//        addProductSteps.checkLabel(ProductListTest.Items.BIKE_LIGHT.getText());
//        addProductSteps.checkDescription(ProductListTest.Items.BIKE_LIGHT_DESCRIPTION.getText());
    }

    @Test
    public void addJacketToCartFromInfoPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickLabel(ProductListTest.Items.JACKET.getText());
        addProductSteps.AddJacketToCart();
        addProductSteps.clickCart();
        addProductSteps.checkCartProducts(ProductListTest.Items.JACKET_DESCRIPTION.getText());
//        addProductSteps.checkLabel(ProductListTest.Items.JACKET.getText());
//        addProductSteps.checkDescription(ProductListTest.Items.JACKET_DESCRIPTION.getText());
    }

    @Test
    public void addOnesieToCartFromInfoPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickLabel(ProductListTest.Items.ONESIE.getText());
        addProductSteps.AddOnesieToCart();
        addProductSteps.clickCart();
        addProductSteps.checkCartProducts(ProductListTest.Items.ONESIE_DESCRIPTION.getText());
//        addProductSteps.checkLabel(ProductListTest.Items.ONESIE.getText());
//        addProductSteps.checkDescription(ProductListTest.Items.ONESIE_DESCRIPTION.getText());
    }

//    @Test
//    public void checkAllItemsInCart(){
//        loginSteps.enterUsername("standard_user");
//        loginSteps.enterPassword("secret_sauce");
//        loginSteps.clickLoginButton();
//        addProductSteps.selectAllProduct();
//        List<WebElementFacade> productList = productListSteps.productListPage.getProductList();
//        addProductSteps.clickCart();
//        List<WebElementFacade> cartList = addProductSteps.addProductPage.getCartList();
//        addProductSteps.checkLists(productList, cartList);
//
//    }


    @After
    public  void afterTest(){
        driver.close();
    }

}
