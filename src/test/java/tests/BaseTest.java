package tests;

import driver.DriverSingleton;
import model.User;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import services.LoginService;

public abstract class BaseTest {

    protected WebDriver driver;
    protected LoginService loginService;
    protected User user;

    @BeforeClass
    public void startBrowser() {
        driver = DriverSingleton.getInstance().getDriver();
        user = new User();
        loginService = new LoginService();
        loginService.login(user);
    }

    @AfterClass(alwaysRun = true)
    public void stopBrowser() {
        DriverSingleton.getInstance().closeDriver();
    }
}
