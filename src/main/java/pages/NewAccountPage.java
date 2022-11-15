package pages;

import elements.Button;
import elements.DropDown;
import elements.InputField;
import model.Account;

public class NewAccountPage extends BasePage {

    private static final String NEW_ACCOUNT_URL = "https://tms8.lightning.force.com/lightning/o/Account/new";
    private static final String ACCOUNT_NAME_LABEL = "Account Name";
    private static final String WEBSITE_LABEL = "Website";
    private static final String INDUSTRY_LABEL = "Industry";
    private static final String SAVE_BUTTON_XPATH_S_PART = "Save";

    public NewAccountPage openNewAccountPage() {
        driver.get(NEW_ACCOUNT_URL);
        return this;
    }

    public NewAccountPage fillInAccountName(Account account) {
        new InputField(ACCOUNT_NAME_LABEL).writeTextByDiv(account.getAccountName());
        return this;
    }
    public NewAccountPage fillInWebSite(Account account) {
        new InputField(WEBSITE_LABEL).writeTextByDiv(account.getWebSite());
        return this;
    }

    public NewAccountPage fillInIndustry(Account account) {
        new DropDown(INDUSTRY_LABEL).selectIndustryOption(account.getIndustry());
        return this;
    }

    public void clickSave() {
        new Button(SAVE_BUTTON_XPATH_S_PART).clickInputButtonByTitle();
    }
}
