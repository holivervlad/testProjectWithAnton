package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class OpenPlayGround extends BasePage {


    @FindBy(xpath = "//input[@id='username']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='Login']")
    private WebElement logInButton;



    public HomePage logInPlayGround(String emailData, String passwordData) {
        WebDriver driver = null;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        OpenPlayGround openPlayGround = new OpenPlayGround();
        openPlayGround.emailField.sendKeys(emailData);
        openPlayGround.passwordField.sendKeys(passwordData);
        openPlayGround.logInButton.click();
        //driver.findElement((By) emailField).sendKeys();
        //driver.findElement(By.ByXPath(emailField));
        //driver.emailField.sendKeys(emailData);
        passwordField.sendKeys(passwordData);
        logInButton.click();
        return new HomePage();
    }
}
