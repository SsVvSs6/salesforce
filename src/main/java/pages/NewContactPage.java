package pages;

import elements.Button;
import elements.DropDown;
import elements.InputField;
import model.Contact;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewContactPage extends BasePage {

    private static final String NEW_CONTACT_URL = "https://tms8.lightning.force.com/lightning/o/Contact/new";
    private static final String SAVE_BUTTON_XPATH_S_PART = "SaveEdit";
    private static final String LAST_NANE_LABEL = "Last Name";
    private static final String ACCOUNT_NANE_LABEL = "Account Name";

    @FindBy (xpath = "//h1")
    private WebElement randomElement;

    public NewContactPage openNewAccountPage() {
        driver.get(NEW_CONTACT_URL);
        return this;
    }

    public NewContactPage fillInLastName(Contact contact) {
        new InputField(LAST_NANE_LABEL).writeTextByLightningInput(contact.getLastName());
        return this;
    }

    public NewContactPage fillInAccountName(Contact contact) {
        new DropDown(ACCOUNT_NANE_LABEL).selectAccountOption(contact.getAccountName());
        return this;
    }

    public void clickSave() {
        new Button(SAVE_BUTTON_XPATH_S_PART).clickInputButtonByName();
        waitVisibilityOf(randomElement);
    }
}
