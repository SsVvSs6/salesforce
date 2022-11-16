package elements.inputs;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public class LoginInputField extends InputField {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    private String id;

    private static final String INPUT_XPATH_BY_ID = "//input[@id='%s']";


    public LoginInputField(String id) {
        this.id = id;
    }

    public void writeTextLogin(String text) {
        writeText(text, String.format(INPUT_XPATH_BY_ID, this.id));
    }
}
