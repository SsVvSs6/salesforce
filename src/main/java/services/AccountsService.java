package services;

import pages.AccountsPage;

public class AccountsService {

    protected AccountsPage accountPage = new AccountsPage();

    public boolean isAccountOnPage(String accountName) {
        accountPage.openAccountPage();
        return null != accountPage.findAccountName(accountName);
    }
}
