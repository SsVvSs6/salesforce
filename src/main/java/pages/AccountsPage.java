package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage extends BasePage {

    private final static String ACCOUNT_NAME_XPATH = "//a[@title='%s']";
    private final static String ACCOUNT_PAGE_URL =
            "https://tms8.lightning.force.com/lightning/o/Account/list?filterName=Recent";

    @FindBy (xpath = "//span[@class='triggerLinkText selectedListView slds-page-header__title slds-truncate slds-p-right--xx-small uiOutputText']")
    private WebElement pageTitle;

    public AccountsPage openAccountPage() {
        driver.get(ACCOUNT_PAGE_URL);
        waitVisibilityOf(pageTitle);
        return this;
    }

    public WebElement findAccountName(String accountName) {
        return driver.findElement(By.xpath(String.format(ACCOUNT_NAME_XPATH, accountName)));
    }
}
