package services;

import model.Account;
import pages.NewAccountPage;

public class NewAccountService {

    NewAccountPage newAccountPage = new NewAccountPage();

    public void createNewAccount(Account account) {
        newAccountPage.openNewAccountPage()
                .fillInAccountName(account)
                .fillInWebSite(account)
                .fillInIndustry(account);
        newAccountPage.clickSave();
    }
}
