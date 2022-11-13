package services;

import model.User;
import pages.LoginPage;

public class LoginService {

    LoginPage loginPage = new LoginPage();

    public void login(User user) {
        loginPage.openPage(user)
                .fillInLogin(user.getLogin())
                .fillInPassword(user.getPassword())
                .clickLogin();
    }
}
