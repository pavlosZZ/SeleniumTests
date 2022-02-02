package Tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Steps.*;

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
        addProductSteps.checkBackpack();
    }

    @Test
    public void addBoltTshirtToCartFromMainPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        addProductSteps.AddBoltTshirtToCart();
        addProductSteps.clickCart();
        addProductSteps.checkBoltTshirt();
    }

    @Test
    public void addRedTshirtToCartFromMainPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        addProductSteps.AddRedTshirtToCart();
        addProductSteps.clickCart();
        addProductSteps.checkRedTshirt();
    }

    @Test
    public void addBikeLightToCartFromMainPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        addProductSteps.AddBikeLightToCart();
        addProductSteps.clickCart();
        addProductSteps.checkBikeLight();
    }

    @Test
    public void addJacketToCartFromMainPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        addProductSteps.AddJacketToCart();
        addProductSteps.clickCart();
        addProductSteps.checkJacket();
    }

    @Test
    public void addOnesieToCartFromMainPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        addProductSteps.AddOnesieToCart();
        addProductSteps.clickCart();
        addProductSteps.checkOnesie();
    }

    @Test
    public void addBackpackToCartFromInfoPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickLabel(ProductListTest.Items.BACKPACK.getText());
        addProductSteps.AddBackpackToCart();
        addProductSteps.clickCart();
        addProductSteps.checkBackpack();
    }

    @Test
    public void addBoltTshirtToCartFromInfoPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickLabel(ProductListTest.Items.BOLD_TSHIRT.getText());
        addProductSteps.AddBoltTshirtToCart();
        addProductSteps.clickCart();
        addProductSteps.checkBoltTshirt();
    }

    @Test
    public void addRedTshirtToCartFromInfoPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickLabel(ProductListTest.Items.RED_TSHIRT.getText());
        addProductSteps.AddRedTshirtToCart();
        addProductSteps.clickCart();
        addProductSteps.checkRedTshirt();
    }

    @Test
    public void addBikeLightToCartFromInfoPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickLabel(ProductListTest.Items.BIKE_LIGHT.getText());
        addProductSteps.AddBikeLightToCart();
        addProductSteps.clickCart();
        addProductSteps.checkBikeLight();
    }

    @Test
    public void addJacketToCartFromInfoPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickLabel(ProductListTest.Items.JACKET.getText());
        addProductSteps.AddJacketToCart();
        addProductSteps.clickCart();
        addProductSteps.checkJacket();
    }

    @Test
    public void addOnesieToCartFromInfoPage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickLabel(ProductListTest.Items.ONESIE.getText());
        addProductSteps.AddOnesieToCart();
        addProductSteps.clickCart();
        addProductSteps.checkOnesie();
    }

    @After
    public  void afterTest(){
        driver.close();
    }

}
