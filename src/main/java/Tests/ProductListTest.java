package Tests;


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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SerenityRunner.class)
public class ProductListTest {



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
    public void seeAllProducts(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        productListSteps.getProductList();
    }

    @After
    public void afterTest(){
        driver.close();
    }
}
