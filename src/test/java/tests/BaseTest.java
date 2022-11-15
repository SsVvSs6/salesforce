package tests;

import driver.DriverSingleton;
import model.User;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    protected WebDriver driver;
    User user;

    @BeforeClass
    public void startBrowser() {
        driver = DriverSingleton.getInstance().getDriver();
        user = new User();
    }

    @AfterClass(alwaysRun = true)
    public void stopBrowser() {
        DriverSingleton.getInstance().closeDriver();
    }
}
