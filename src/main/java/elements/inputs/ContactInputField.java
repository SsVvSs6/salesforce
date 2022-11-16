package elements.inputs;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public class ContactInputField extends InputField {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    private String label;

    private static final String INPUT_XPATH_BY_LIGHTNING_INPUT =
            "//label[contains(text(), '%s')]/ancestor::lightning-input//input";

    public ContactInputField(String label) {
        this.label = label;
    }

    public void writeTextNewContact(String text) {
        writeText(text, String.format(INPUT_XPATH_BY_LIGHTNING_INPUT, this.label));
    }
}
