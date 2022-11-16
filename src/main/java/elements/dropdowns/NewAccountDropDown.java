package elements.dropdowns;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public class NewAccountDropDown extends DropDown {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    private String label;
    private static final String DROP_DOWN_XPATH =
            "//span[contains(text(), '%s')]/ancestor::div[contains(@class, 'uiInput')]//a";
    private static final String SELECT_OPTION_XPATH =
            "//*[contains(@class, 'select-option')]/descendant::a[contains(text(),'%s')]";

    public NewAccountDropDown(String label) {
        this.label = label;
    }

    public void selectNewAccountOption(String option) {
        selectOption(String.format(DROP_DOWN_XPATH, this.label), String.format(SELECT_OPTION_XPATH, option));
    }
}
