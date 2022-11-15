package tests;

import model.Account;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.AccountsService;
import services.LoginService;
import services.NewAccountService;

public class AccountTest extends BaseTest {

    protected LoginService loginService;
    protected NewAccountService newAccountService;
    protected AccountsService accountService;
    protected Account account;

    @Test
    public void verifyCreateAccountTest() {
        account = new Account("Account1", "www.google.com", "Apparel");

        loginService = new LoginService();
        loginService.login(user);

        newAccountService = new NewAccountService();
        newAccountService.createNewAccount(account);

        accountService = new AccountsService();
        Assert.assertTrue(accountService.isAccountOnPage(account.getAccountName()));
    }
}
