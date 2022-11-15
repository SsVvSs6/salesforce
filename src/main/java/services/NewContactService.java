package services;

import elements.InputField;
import elements.InputFieldWithSearch;
import model.Contact;
import pages.NewContactPage;

public class NewContactService {

    NewContactPage newContactPage = new NewContactPage();

    public void createNewContact(Contact contact) {
        newContactPage.openNewAccountPage();
        new InputField("Last Name").writeTextByLightningInput(contact.getLastName());
        new InputFieldWithSearch("Account Name").selectAccount(contact.getAccountName());
        newContactPage.clickSave();
    }
}
