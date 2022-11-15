package tests;

import model.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.ContactsService;
import services.NewContactService;

public class ContactTest extends BaseTest {

    protected NewContactService newContactService;
    protected ContactsService contactsService;
    protected Contact contact;

    @Test
    public void verifyCreateContactTest() {
        contact = new Contact("Last Name 1", "Account1");

        newContactService = new NewContactService();
        newContactService.createNewContact(contact);

        contactsService = new ContactsService();
        Assert.assertTrue(contactsService.isContactOnPage(contact.getLastName()));
    }
}
