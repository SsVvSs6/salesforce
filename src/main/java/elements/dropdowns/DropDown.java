package elements.dropdowns;

import driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class DropDown {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    protected void selectOption(String option, String dropDownFormat, String dropDownFormatSPart, String selectFormat) {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(dropDownFormat, dropDownFormatSPart))))
                .click();
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(selectFormat, option))))
                .click();
    }
}
