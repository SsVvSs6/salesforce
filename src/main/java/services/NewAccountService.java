package services;

import elements.DropDown;
import elements.InputField;
import model.Account;
import pages.NewAccountPage;

public class NewAccountService {

    NewAccountPage newAccountPage = new NewAccountPage();

    public void createNewAccount(Account account) {
        newAccountPage.openNewAccountPage();
        new InputField("Account Name").writeTextByDiv(account.getAccountName());
        new InputField("Website").writeTextByDiv(account.getWebSite());
        new DropDown("Industry").selectOption(account.getIndustry());
        newAccountPage.clickSave();
    }
}
