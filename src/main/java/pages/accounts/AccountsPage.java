package pages.accounts;

import base.BasePage;
import configurationManager.BaseConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.NoSuchElementException;


public class AccountsPage extends BasePage {

    @FindBy(xpath = "//div[@title = 'New']")
    private WebElement newAccountButton;

    @FindBy(xpath = "//div//a/div[@title = 'Import']")
    private WebElement importButton;

    @FindBy(xpath = "//h1[@class = 'slds-truncate slds-page-header__title slds-text-color--default']")
    private WebElement listViewDropDown;

    @FindBy(xpath = "//ul[@id='virtualAutocompleteListbox_e4947a128442e']/li[2]")
    private WebElement allAccountsListView;

    @FindBy (xpath = "//input[@id = 'input-101']")
    private WebElement localSearch;

    @FindBy(xpath = "//span[@title = 'atest']")
    private WebElement testAccount;

    @FindBy(xpath = "//div[@title = 'Edit']")
    private WebElement editButton;

    @FindBy(xpath = "//tbody//tr//th")
    private List<WebElement> accountNames;

    @FindBy(xpath = "//button[@title = 'Show Navigation Menu']")
    private WebElement tabDropDown;

    @FindBy(xpath = "//span[@class='slds-media__body']//span[text() = 'Accounts']")
    private WebElement accountsTab;

    public CreateNewAccountsPage clickOnNewAccountButton () {
        newAccountButton.click();
        return new CreateNewAccountsPage();
    }

    public AccountsPage openAccount(String accountName) {
        driver.findElement(By.xpath("//a[text()='"+accountName+"']")).click();
        return new AccountsPage();
    }

    public EditAccountPage OpenEditAccountPage() {
        editButton.click();
        return new EditAccountPage();
    }

    public Boolean isAccountPresentOnTheList(List<WebElement> elements, String accountName){
        for (WebElement element: elements) {
            if (element.findElement(By.xpath("//span[text()='"+accountName+"']"))
                    .isDisplayed())
                return true;
        }
        return false;
    }

    public Boolean isAccountAvailable(String accountName) {
        try {
            return BaseConfiguration.getDriver().findElement(By.xpath("//span[text()='" + accountName + "']"))
                    .isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public AccountsPage returnToAccountsPage() {
        tabDropDown.click();
        accountsTab.click();
        return this;
    }
}
