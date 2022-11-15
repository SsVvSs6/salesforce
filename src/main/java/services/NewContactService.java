package services;

import elements.DropDown;
import elements.InputField;
import model.Contact;
import pages.NewContactPage;

public class NewContactService {

    NewContactPage newContactPage = new NewContactPage();

    public void createNewContact(Contact contact) {
        newContactPage.openNewAccountPage();
        new InputField("Last Name").writeTextByLightningInput(contact.getLastName());
        new DropDown("Account Name").selectAccountOption(contact.getAccountName());
        newContactPage.clickSave();
    }
}
