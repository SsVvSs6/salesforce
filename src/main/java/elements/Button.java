package elements;

import driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Button {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    private String xPathSPart;

    public Button(String xPathSPart) {
        this.xPathSPart = xPathSPart;
    }

    private static final String INPUT_BUTTON_XPATH_BY_ID = "//input[@id='%s']";
    private static final String BUTTON_XPATH_BY_TITLE = "//button[@title='Save']";

    public void clickInputButtonById() {
        clickButton(INPUT_BUTTON_XPATH_BY_ID, this.xPathSPart);
    }

    public void clickInputButtonByTitle() {
        clickButton(BUTTON_XPATH_BY_TITLE, this.xPathSPart);
    }

    private void clickButton(String format, String xPathSPart) {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(format, xPathSPart))))
                .click();
    }
}
