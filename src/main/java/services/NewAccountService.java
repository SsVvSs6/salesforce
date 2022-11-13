package services;

import elements.DropDown;
import elements.InputField;
import model.Account;
import org.openqa.selenium.WebDriver;
import pages.NewAccountPage;

public class NewAccountService {

    NewAccountPage newAccountPage = new NewAccountPage();

    public void createNewAccount(Account account, WebDriver driver) {
        newAccountPage.openNewAccountPage();
        new InputField("Account Name").writeText(account.getAccountName());
        new InputField("Website").writeText(account.getWebSite());
        new DropDown(driver, "Industry").selectOption(account.getIndustry());
        newAccountPage.clickSave();
    }
}
