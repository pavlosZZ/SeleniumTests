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



@RunWith(SerenityRunner.class)
public class ProductListTest {



    public enum Items{
        BACKPACK("Sauce Labs Backpack"),
        BACKPACK_DESCRIPTION("carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection."),
        RED_TSHIRT("Test.allTheThings() T-Shirt (Red)"),
        RED_TSHIRT_DESCRIPTION("This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton."),
        BOLD_TSHIRT("Sauce Labs Bolt T-Shirt"),
        BOLD_TSHIRT_DESCRIPTION("Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt."),
        JACKET("Sauce Labs Fleece Jacket"),
        JACKET_DESCRIPTION("It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office."),
        ONESIE("Sauce Labs Onesie"),
        ONESIE_DESCRIPTION("Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel."),
        BIKE_LIGHT("Sauce Labs Bike Light"),
        BIKE_LIGHT_DESCRIPTION("A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");
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
