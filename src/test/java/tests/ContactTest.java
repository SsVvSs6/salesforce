package tests;

import model.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.ContactsService;
import services.LoginService;
import services.NewContactService;

public class ContactTest extends BaseTest {

    protected NewContactService newContactService;
    protected LoginService loginService;
    protected ContactsService contactsService;
    protected Contact contact;

    @Test
    public void verifyCreateContactTest() {
        contact = new Contact("Last Name 1", "Account1");

        loginService = new LoginService();
        loginService.login(user);

        newContactService = new NewContactService();
        newContactService.createNewContact(contact);

        contactsService = new ContactsService();
        Assert.assertTrue(contactsService.isContactOnPage(contact.getLastName()));
    }
}
