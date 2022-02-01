package Tests;


import Elements.ProductListPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Steps.LoginSteps;
import Steps.ProductListSteps;

import java.util.List;


@RunWith(SerenityRunner.class)
public class ProductListTest {



    public enum Items{
        BACKPACK("Sauce Labs Backpack"),
        RED_TSHIRT("Test.allTheThings() T-Shirt (Red)"),
        BOLD_TSHIRT("Sauce Labs Bolt T-Shirt"),
        JACKET("Sauce Labs Fleece Jacket"),
        ONESIE("Sauce Labs Onesie"),
        BIKE_LIGHT("Sauce Labs Bike Light");
        String text;

        Items(String s) {
            this.text = s;
        }

        public String getText() {
            return text;
        }
    }
    @Managed
    WebDriver driver;
    String URL = "https://www.saucedemo.com/";

    @Steps
    LoginSteps loginSteps;
    @Steps
    ProductListSteps productListSteps;

    @Before
    public void beforeTest() {
        driver.navigate().to(URL);
        driver.manage().window().maximize();
    }


    @Test
    public void seeAllProducts() {
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.showAllProducts();
    }
    @Test
    public void checkPrice(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.checkProductPrice();
    }

    @Test
    public void clickLabel(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickLabel(Items.BACKPACK.getText());
        productListSteps.clickBack();
        productListSteps.clickLabel(Items.BIKE_LIGHT.getText());
        productListSteps.clickBack();
        productListSteps.clickLabel(Items.BOLD_TSHIRT.getText());
        productListSteps.clickBack();
        productListSteps.clickLabel(Items.JACKET.getText());
        productListSteps.clickBack();
        productListSteps.clickLabel(Items.ONESIE.getText());
        productListSteps.clickBack();
        productListSteps.clickLabel(Items.RED_TSHIRT.getText());
    }

    @Test
    public void clickImage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickImage(Items.BACKPACK.getText());
        productListSteps.clickBack();
        productListSteps.clickImage(Items.RED_TSHIRT.getText());
        productListSteps.clickBack();
        productListSteps.clickImage(Items.ONESIE.getText());
        productListSteps.clickBack();
        productListSteps.clickImage(Items.JACKET.getText());
        productListSteps.clickBack();
        productListSteps.clickImage(Items.BOLD_TSHIRT.getText());
        productListSteps.clickBack();
        productListSteps.clickImage(Items.BIKE_LIGHT.getText());
    }



    @After
    public void afterTest(){
        driver.close();
    }
}
