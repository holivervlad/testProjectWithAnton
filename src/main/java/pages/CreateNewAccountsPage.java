package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewAccountsPage {
    public WebDriver driver;

    @FindBy(xpath = "//input[@id='94:1424;a']")
    private WebElement accountNameField;

    @FindBy(xpath = "//button[@type = 'button'][@title = 'Save']/span")
    private WebElement saveNewCcountButton;

    public AccountsPage createNewAccount(String accountName) {

        driver.findElement((By) accountNameField).sendKeys(accountName);
        driver.findElement((By) saveNewCcountButton).click();
        return new AccountsPage();
    }
}
