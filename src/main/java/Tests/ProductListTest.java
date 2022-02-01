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
        BACKPACK("Sauce Labs Backpack");
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
    public void beforeTest() throws InterruptedException {
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        //Thread.sleep(5000);
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
    }

    @Test
    public void clickImage(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickImage(Items.BACKPACK.getText());
    }

    @Test
    public void clickAllLabels(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.clickBackPack();
        productListSteps.clickBack();
//        productListSteps.clickBoldTshirt();
//        productListSteps.clickBack();
//        productListSteps.clickBikeLight();
//        productListSteps.clickBack();
//        productListSteps.clickJacket();
//        productListSteps.clickBack();
        productListSteps.clickOnesie();
        productListSteps.clickBack();
        productListSteps.clickRedTshirt();
    }


    @After
    public void afterTest(){
        driver.close();
    }
}
