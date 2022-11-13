package elements;

import driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputField {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    private String label;
    private String id;
    private static final String INPUT_XPATH =
            "//span[contains(text(), '%s')]/ancestor::div[contains(@class, 'uiInput')]//input";

    private static final String INPUT_XPATH_BY_ID = "//input[@id='%s']";

    public InputField(String label) {
        this.label = label;
    }

    public InputField(String label, String id) {
        this.label = label;
        this.id = id;
    }

    public void writeText(String text) {
        writeTextMethod(text, INPUT_XPATH, this.label);
    }

    public void writeTextById(String text) {
        writeTextMethod(text, INPUT_XPATH_BY_ID, this.id);
    }

    private void writeTextMethod(String text, String format, String xPathSPart) {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(format, xPathSPart))))
                .sendKeys(text);
    }
}
