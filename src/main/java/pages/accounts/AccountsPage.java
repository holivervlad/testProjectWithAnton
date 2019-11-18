package pages.accounts;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(xpath = "//a[text() = 'test Account']")
    private WebElement testAccount;

    @FindBy(xpath = "//div[@title = 'Edit']")
    private WebElement editButtonOnTestAccount;

    @FindBy(xpath = "")
    private List<WebElement> accountNames;

    public CreateNewAccountsPage clickOnNewAccountButton () throws InterruptedException {
        Thread.sleep(5000);
        newAccountButton.click();
        return new CreateNewAccountsPage();
    }

    public AccountsPage openTestAccount() throws InterruptedException {
        Thread.sleep(5000);
        testAccount.click();
        return new AccountsPage();
    }

    public EditAccountPage openEditPageOnTestAccount() throws InterruptedException {
        Thread.sleep(5000);
        editButtonOnTestAccount.click();
        Thread.sleep(5000);
        return new EditAccountPage();



    }

//    public CreateNewAccountsPage clickOnNewAccountButton () {
//     //waitUntilLoading(newAccountButton);
//     newAccountButton.click();localSearch.findElement(By.xpath(""));
//     return new CreateNewAccountsPage();
//    }

    public Boolean isDisplayed(List<WebElement> elements, String accountName){
        for (WebElement element: elements) {
            if (element.findElement(By.xpath("//span[text()='"+accountName+"']"))
                    .isDisplayed())
                return true;
        }
        return false;
    }

}
