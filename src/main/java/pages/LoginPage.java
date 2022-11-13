package pages;

import elements.Button;
import elements.InputField;
import model.User;

public class LoginPage extends BasePage {

    private static final String LOGIN_ID = "username";
    private static final String PASSWORD_ID = "password";
    private static final String LOGIN_BUTTON_ID = "Login";

    public LoginPage openPage(User user) {
        driver.get(user.getUrl());
        return this;
    }

    public LoginPage fillInLogin(String text) {
        new InputField(null, LOGIN_ID).writeTextById(text);
        return this;
    }
    public LoginPage fillInPassword(String text) {
        new InputField(null, PASSWORD_ID).writeTextById(text);
        return this;
    }

    public void clickLogin() {
        new Button(LOGIN_BUTTON_ID).clickInputButtonById();
    }
}
