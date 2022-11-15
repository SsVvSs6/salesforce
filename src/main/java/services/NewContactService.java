package services;

import model.Contact;
import pages.NewContactPage;

public class NewContactService {

    NewContactPage newContactPage = new NewContactPage();

    public void createNewContact(Contact contact) {
        newContactPage.openNewAccountPage()
                .fillInLastName(contact)
                .fillInAccountName(contact);
        newContactPage.clickSave();
    }
}
