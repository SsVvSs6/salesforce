package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import model.Account;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pages.NewAccountPage;

public class AccountTest {

    @Test
    public void createAccountTest() {
        User user = new User();
        Account account = new Account("Account1", "www.google.com", "Apparel");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver();

        driver.get(user.getUrl());
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user.getLogin());
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(user.getPassword());
        driver.findElement(By.xpath("//input[@id='login']")).click();

        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.createNewAccount(account);
    }
}
