package elements.dropdowns;

public class NewContactDropDown extends DropDown{

    private String label;
    private static final String DROP_DOWN_ACCOUNT_XPATH =
            "//label[contains(text(), '%s')]/ancestor::lightning-grouped-combobox//input";
    private static final String SELECT_ACCOUNT_OPTION_XPATH =
            "//*[text()='Recent Accounts']//ancestor::ul//span[@title='%s']";

    public NewContactDropDown(String label) {
        this.label = label;
    }

    public void selectNewContactOption(String option) {
        selectOption(option, DROP_DOWN_ACCOUNT_XPATH, this.label, SELECT_ACCOUNT_OPTION_XPATH);
    }
}
