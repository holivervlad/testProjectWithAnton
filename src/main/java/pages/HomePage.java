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
        waitUntilLoading(tabDropDown);
        tabDropDown.click();
        waitUntilLoading(accountsTab);
        Thread.sleep(5000);
        accountsTab.click();
        return new AccountsPage();
    }

}

