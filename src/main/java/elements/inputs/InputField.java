package elements.inputs;

import driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class InputField {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    protected void writeText(String text, String xPath) {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(xPath)))
                .sendKeys(text);
    }
}
