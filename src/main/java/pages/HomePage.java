package pages;

import base.BasePage;
import data.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@title = 'Show Navigation Menu']")
    private WebElement tabDropDown;

    @FindBy(xpath = "//div[@role = 'listbox']//span[text() = 'Accounts']")
    private WebElement accountsTab;

    public AccountsPage openAccountsPage() {
        waitUntilLoading(tabDropDown);
        tabDropDown.click();
        waitUntilLoading(accountsTab);
        accountsTab.click();
    return new AccountsPage();
    }

}

