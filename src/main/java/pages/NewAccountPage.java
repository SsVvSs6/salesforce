package pages;

import elements.dropdowns.NewAccountDropDown;
import elements.inputs.NewAccountInputField;
import model.Account;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountPage extends BasePage {

    @FindBy (xpath = "//button[@title='Save']")
    private WebElement saveButton;

    private static final String NEW_ACCOUNT_URL = "https://tms8.lightning.force.com/lightning/o/Account/new";
    private static final String ACCOUNT_NAME_LABEL = "Account Name";
    private static final String WEBSITE_LABEL = "Website";
    private static final String INDUSTRY_LABEL = "Industry";

    public NewAccountPage openNewAccountPage() {
        driver.get(NEW_ACCOUNT_URL);
        return this;
    }

    public NewAccountPage fillInAccountName(Account account) {
        new NewAccountInputField(ACCOUNT_NAME_LABEL).writeTextNewAccount(account.getAccountName());
        return this;
    }
    public NewAccountPage fillInWebSite(Account account) {
        new NewAccountInputField(WEBSITE_LABEL).writeTextNewAccount(account.getWebSite());
        return this;
    }

    public NewAccountPage fillInIndustry(Account account) {
        new NewAccountDropDown(INDUSTRY_LABEL).selectNewAccountOption(account.getIndustry());
        return this;
    }

    public void clickSave() {
        saveButton.click();
    }
}
