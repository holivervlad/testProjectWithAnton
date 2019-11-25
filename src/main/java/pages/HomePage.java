package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.accounts.AccountsPage;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@title = 'Show Navigation Menu']")
    private WebElement tabDropDown;

    @FindBy(xpath = "//span[@class='slds-media__body']//span[text() = 'Accounts']")
    private WebElement accountsTab;

    public AccountsPage openAccountsPage() throws InterruptedException {
        Thread.sleep(10000);
        tabDropDown.click();
        Thread.sleep(10000);
        accountsTab.click();
        Thread.sleep(10000);
        return new AccountsPage();
    }

}

