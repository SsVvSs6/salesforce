package services;

import pages.ContactsPage;

public class ContactsService {

    protected ContactsPage contactPage = new ContactsPage();

    public boolean isContactOnPage(String contactName) {
        contactPage.openContactPage();
        return null != contactPage.findContactName(contactName);
    }
}
