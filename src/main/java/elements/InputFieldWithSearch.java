package elements;

import driver.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputFieldWithSearch {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    private String label;

    public InputFieldWithSearch(String label) {
        this.label = label;
    }

    private static final String INPUT_XPATH_BY_LIGHTNING_GROUP =
            "//label[contains(text(), '%s')]/ancestor::lightning-grouped-combobox//input";
    private static final String SELECT_OPTION_XPATH = "//span[@title='%s']/ancestor::lightning-base-combobox-item";

    public void selectAccount(String text) {
        writeText(text, INPUT_XPATH_BY_LIGHTNING_GROUP, this.label);
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(SELECT_OPTION_XPATH, text))))
                .click();
    }

    private void writeText(String text, String format, String xPathSPart) {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(format, xPathSPart))))
                .sendKeys(text);
    }
}
