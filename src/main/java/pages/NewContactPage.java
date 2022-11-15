package pages;

import elements.dropdowns.NewContactDropDown;
import elements.inputs.ContactInputField;
import model.Contact;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewContactPage extends BasePage {

    @FindBy (xpath = "//button[@name='SaveEdit']")
    private WebElement saveButton;

    private static final String NEW_CONTACT_URL = "https://tms8.lightning.force.com/lightning/o/Contact/new";
    private static final String LAST_NANE_LABEL = "Last Name";
    private static final String ACCOUNT_NANE_LABEL = "Account Name";

    @FindBy (xpath = "//h1")
    private WebElement randomElement;

    public NewContactPage openNewAccountPage() {
        driver.get(NEW_CONTACT_URL);
        return this;
    }

    public NewContactPage fillInLastName(Contact contact) {
        new ContactInputField(LAST_NANE_LABEL).writeTextNewContact(contact.getLastName());
        return this;
    }

    public NewContactPage fillInAccountName(Contact contact) {
        new NewContactDropDown(ACCOUNT_NANE_LABEL).selectNewContactOption(contact.getAccountName());
        return this;
    }

    public void clickSave() {
        saveButton.click();
        waitVisibilityOf(randomElement);
    }
}
