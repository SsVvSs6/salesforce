package pages;

import elements.Button;

public class NewAccountPage extends BasePage {

    private static final String NEW_ACCOUNT_URL = "https://tms8.lightning.force.com/lightning/o/Account/new";
    private static final String SAVE_BUTTON_XPATH_S_PART = "Save";

    public NewAccountPage openNewAccountPage() {
        driver.get(NEW_ACCOUNT_URL);
        return this;
    }

    public void clickSave() {
        new Button(SAVE_BUTTON_XPATH_S_PART).clickInputButtonByTitle();
    }
}
