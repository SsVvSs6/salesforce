package tests;

import model.Account;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.AccountsService;
import services.NewAccountService;

public class AccountTest extends BaseTest {

    protected NewAccountService newAccountService;
    protected AccountsService accountService;
    protected Account account;

    @Test
    public void verifyCreateAccountTest() {
        account = new Account("Account1", "www.google.com", "Apparel");

        newAccountService = new NewAccountService();
        newAccountService.createNewAccount(account);

        accountService = new AccountsService();
        Assert.assertTrue(accountService.isAccountOnPage(account.getAccountName()));
    }
}
