package elements.inputs;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public class NewAccountInputField extends InputField {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    private String label;
    private static final String INPUT_XPATH_BY_DIV =
            "//span[contains(text(), '%s')]/ancestor::div[contains(@class, 'uiInput')]//input";

    public NewAccountInputField(String label) {
        this.label = label;
    }

    public void writeTextNewAccount(String text) {
        writeText(text, INPUT_XPATH_BY_DIV, this.label);
    }
}
