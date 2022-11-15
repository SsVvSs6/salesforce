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
    private static final String INPUT_XPATH_BY_DIV =
            "//span[contains(text(), '%s')]/ancestor::div[contains(@class, 'uiInput')]//input";

    private static final String INPUT_XPATH_BY_ID = "//input[@id='%s']";

    private static final String INPUT_XPATH_BY_LIGHTNING_INPUT =
            "//label[contains(text(), '%s')]/ancestor::lightning-input//input";

    public InputField(String label) {
        this.label = label;
    }

    public InputField(String label, String id) {
        this.label = label;
        this.id = id;
    }

    public void writeTextByDiv(String text) {
        writeText(text, INPUT_XPATH_BY_DIV, this.label);
    }

    public void writeTextById(String text) {
        writeText(text, INPUT_XPATH_BY_ID, this.id);
    }

    public void writeTextByLightningInput(String text) {
        writeText(text, INPUT_XPATH_BY_LIGHTNING_INPUT, this.label);
    }

    private void writeText(String text, String format, String xPathSPart) {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(format, xPathSPart))))
                .sendKeys(text);
    }
}
