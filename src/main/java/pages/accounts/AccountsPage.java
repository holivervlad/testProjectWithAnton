package pages.accounts;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;


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
    private WebElement editButtonOnTestAccount;

    @FindBy(xpath = "//tbody//tr//th")
    private List<WebElement> accountNames;

    public CreateNewAccountsPage clickOnNewAccountButton () throws InterruptedException {
        Thread.sleep(5000);
        newAccountButton.click();
        return new CreateNewAccountsPage();
    }

    public AccountsPage openTestAccount(String accountName) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='"+accountName+"']")).click();
        return new AccountsPage();
    }

    public EditAccountPage openEditPageOnTestAccount() throws InterruptedException {
        Thread.sleep(5000);
        editButtonOnTestAccount.click();
        Thread.sleep(5000);
        return new EditAccountPage();
    }

    public Boolean isDisplayed(List<WebElement> elements, String accountName){
        for (WebElement element: elements) {
            if (element.findElement(By.xpath("//span[text()='"+accountName+"']"))
                    .isDisplayed())
                return true;
        }
        return false;
    }

    public void checkAccountName(String accountName) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(isDisplayed(accountNames, accountName));

    }


}
