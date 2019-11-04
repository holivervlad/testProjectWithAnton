package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class = 'slds-grid slds-has-flexi-truncate navUL']//a[@title = 'Accounts']/span")
    private WebElement accountTab;

    public HomePage() {
    }


    public AccountPage clickOnAccountTab() {
    accountTab.click();
    return new AccountPage();
        }
    }

