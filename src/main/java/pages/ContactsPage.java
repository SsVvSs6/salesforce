package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {

    private final static String CONTACT_NAME_XPATH = "//th[@scope='row']//a[@title='%s']";
    private final static String CONTACT_PAGE_URL =
            "https://tms8.lightning.force.com/lightning/o/Contact/list?filterName=Recent";

    @FindBy(xpath = "//span[@class='triggerLinkText selectedListView slds-page-header__title slds-truncate slds-p-right--xx-small uiOutputText']")
    private WebElement pageTitle;

    public ContactsPage openContactPage() {
        driver.get(CONTACT_PAGE_URL);
        waitVisibilityOf(pageTitle);
        return this;
    }

    public WebElement findContactName(String contactName) {
        return driver.findElement(By.xpath(String.format(CONTACT_NAME_XPATH, contactName)));
    }
}
