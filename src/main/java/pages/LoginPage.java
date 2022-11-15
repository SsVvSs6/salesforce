package pages;

import elements.inputs.LoginInputField;
import model.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy (xpath = "//input[@id='Login']")
    private WebElement saveButton;

    private static final String LOGIN_ID = "username";
    private static final String PASSWORD_ID = "password";

    public LoginPage openPage(User user) {
        driver.get(user.getUrl());
        return this;
    }

    public LoginPage fillInLogin(String text) {
        new LoginInputField(LOGIN_ID).writeTextLogin(text);
        return this;
    }
    public LoginPage fillInPassword(String text) {
        new LoginInputField(PASSWORD_ID).writeTextLogin(text);
        return this;
    }

    public void clickLogin() {
        saveButton.click();
    }
}
