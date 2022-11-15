package pages;

import elements.Button;

public class NewContactPage extends BasePage {

    private static final String NEW_CONTACT_URL = "https://tms8.lightning.force.com/lightning/o/Contact/new";
    private static final String SAVE_BUTTON_XPATH_S_PART = "SaveEdit";

    public NewContactPage openNewAccountPage() {
        driver.get(NEW_CONTACT_URL);
        return this;
    }

    public void clickSave() {
        new Button(SAVE_BUTTON_XPATH_S_PART).clickInputButtonByName();
    }
}
