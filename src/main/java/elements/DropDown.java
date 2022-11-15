package elements;

import driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDown {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    private String label;
    private static final String DROP_DOWN_XPATH =
            "//span[contains(text(), '%s')]/ancestor::div[contains(@class, 'uiInput')]//a";
    private static final String SELECT_OPTION_XPATH =
            "//*[contains(@class, 'select-option')]/descendant::a[contains(text(),'%s')]";
    private static final String DROP_DOWN_ACCOUNT_XPATH =
            "//label[contains(text(), '%s')]/ancestor::lightning-grouped-combobox//input";
    private static final String SELECT_ACCOUNT_OPTION_XPATH =
            "//*[text()='Recent Accounts']//ancestor::ul//span[@title='%s']";

    public DropDown(String label) {
        this.label = label;
    }

    public void selectIndustryOption(String option) {
        selectOption(option, DROP_DOWN_XPATH, SELECT_OPTION_XPATH);
    }

    public void selectAccountOption(String option) {
        selectOption(option, DROP_DOWN_ACCOUNT_XPATH, SELECT_ACCOUNT_OPTION_XPATH);
    }

    private void selectOption(String option, String dropDownFormat, String selectFormat) {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(dropDownFormat, this.label))))
                .click();
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(selectFormat, option))))
                .click();
    }
}
