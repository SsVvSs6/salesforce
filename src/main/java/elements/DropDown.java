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

    public DropDown(String label) {
        this.label = label;
    }

    public void selectOption(String option) {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(DROP_DOWN_XPATH, this.label))))
                .click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH, option))).click();
    }
}
