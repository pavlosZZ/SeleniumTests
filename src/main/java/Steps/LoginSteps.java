package Steps;

import Elements.LoginPage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertTrue;


public class LoginSteps {

    public LoginPage loginPage;

    @Step
    public void enterUsername(String username){
        loginPage.getUserName().sendKeys(username);
    }

    @Step
    public void enterPassword(String password) {
        loginPage.getPassword().sendKeys(password);
    }

    @Step
    public void clickLoginButton(){
        loginPage.getLoginButton().click();
    }

    @Step
    public void shouldBeLoggedIn(){
        String EXPECTED_URL = "https://www.saucedemo.com/inventory.html";
        String CURRENT_URL = loginPage.getDriver().getCurrentUrl();
        assertTrue("Wrong login page url.", EXPECTED_URL.equals(CURRENT_URL));
    }


    public void shouldNotBeLoggedIn(String user) {
        if(user.equalsIgnoreCase("standaasdard_user")) {
            String EXPECTED_MESSAGE = "Epic sadface: Username and password do not match any user in this service";
            String CURRENT_MESSAGE = loginPage.getErrorMessage();
            assertTrue("Wrong login page url.", EXPECTED_MESSAGE.equals(CURRENT_MESSAGE));
        }else if(user.equalsIgnoreCase("locked_out_user")){
            String EXPECTED_MESSAGE = "Epic sadface: Sorry, this user has been locked out.";
            String CURRENT_MESSAGE = loginPage.getErrorMessage();
            assertTrue("Wrong login page url.", EXPECTED_MESSAGE.equals(CURRENT_MESSAGE));
        }


    }
}
