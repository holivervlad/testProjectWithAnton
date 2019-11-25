package pages.accounts;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.HomePage;

import java.util.List;

public class EditAccountPage extends BasePage {

    AccountsPage accountsPage;
    HomePage homePage;

    @FindBy(xpath = "//div[starts-with(@class,'modal-container')]//span[text() = 'Account Name']/../..//input")
    private WebElement accountNameFieldOnTestAccount;

    @FindBy(xpath = "//button[@title = 'Save']")
    private WebElement saveButtonOnEditPageOfTestAccount;



    public AccountsPage updateAccountNameInTestAccountTo(String newAccountName) throws InterruptedException {
        Thread.sleep(10000);
        accountNameFieldOnTestAccount.clear();
        Thread.sleep(5000);
        accountNameFieldOnTestAccount.sendKeys(newAccountName);
        Thread.sleep(5000);
        saveButtonOnEditPageOfTestAccount.click();
        Thread.sleep(5000);
        return new AccountsPage();
    }

    public AccountsPage returnOriginalNameOfAccountTo(String oldAccountName) throws InterruptedException {
        Thread.sleep(5000);
        accountNameFieldOnTestAccount.clear();
        Thread.sleep(5000);
        accountNameFieldOnTestAccount.sendKeys(oldAccountName);
        Thread.sleep(5000);
        saveButtonOnEditPageOfTestAccount.click();
        return new AccountsPage();
    }
}
