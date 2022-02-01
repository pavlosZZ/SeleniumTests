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

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed
    WebDriver driver ;
    String URL = "https://www.saucedemo.com/";

    @Steps
    LoginSteps loginSteps;

    @Before
    public void beforeTest()  {
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        //Thread.sleep(5000);
    }

    @Test
    public void userLogin(){
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        loginSteps.shouldBeLoggedIn();
    }

    @Test
    public void userFailΤοLogin(){
        loginSteps.enterUsername("standaasdard_user");
        loginSteps.enterPassword("secret_sauce123");
        loginSteps.clickLoginButton();
        loginSteps.shouldNotBeLoggedIn("standaasdard_user");
    }

    @Test
    public void lockedUserLogin(){
        loginSteps.enterUsername("locked_out_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        loginSteps.shouldNotBeLoggedIn("locked_out_user");
    }

    @After
    public void afterTest(){
       //Thread.sleep(5000);
        driver.close();
    }
}
