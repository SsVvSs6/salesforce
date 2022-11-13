package tests;

import model.Account;
import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.AccountsService;
import services.LoginService;
import services.NewAccountService;

public class AccountTest extends BaseTest {

    protected LoginService loginService;
    protected NewAccountService newAccountService;
    protected AccountsService accountService;

    @Test
    public void createAccountTest() {
        User user = new User();
        Account account = new Account("Account1", "www.google.com", "Apparel");

        loginService = new LoginService();
        loginService.login(user);

        newAccountService = new NewAccountService();
        newAccountService.createNewAccount(account, driver);

        accountService = new AccountsService();
        Assert.assertTrue(accountService.isAccountOnPage(account.getAccountName()));
    }
}
