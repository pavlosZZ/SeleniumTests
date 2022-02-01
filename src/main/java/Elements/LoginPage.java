package Elements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {


    String USER_NAME = "[id='user-name']";
    String PASSWORD = "[id='password']";
    String LOGIN_BUTTON = "[type='submit']";
    String LOGIN_FAILED_MESSAGE = "[data-test='error']";

    public WebElementFacade getUserName(){
        return $(By.cssSelector(USER_NAME));
    }

    public WebElementFacade getPassword() {
        return $(By.cssSelector(PASSWORD));
    }

    public WebElementFacade getLoginButton() {
        return $(By.cssSelector(LOGIN_BUTTON));
    }

    public String getErrorMessage() {
        WebElementFacade elementFacade = $(By.cssSelector(LOGIN_FAILED_MESSAGE));
        return elementFacade.getText();
    }
}
