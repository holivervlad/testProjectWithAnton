package accounts;

import base.BaseTest;
import data.UserData;
import org.testng.annotations.Test;
import pages.accounts.AccountsPage;
import pages.accounts.CreateNewAccountsPage;
import pages.HomePage;
import pages.LogInPage;
import pages.accounts.EditAccountPage;

public class UpdateLastAndLastNameOfAccount extends BaseTest {
    public LogInPage logInPage;
    public HomePage homePage;
    public AccountsPage accountsPage;
    public CreateNewAccountsPage createNewAccountsPage;
    public UserData userData;
    public EditAccountPage editAccountPage;


    @Test
    public void updateAccountTest() throws InterruptedException {
        logInPage = base.openPlayGroundPage();
        accountsPage = logInPage.logInPlayGround(UserData.salesUserEmail, UserData.salesUserPassword)
                .openAccountsPage()
                .openTestAccount("test Account")
                .openEditPageOnTestAccount()
                .updateAccountNameInTestAccountTo("Hello World");
        //HomePage homePage = new HomePage();
        homePage.openAccountsPage()
                .openTestAccount("Hello World")
                .openEditPageOnTestAccount()
                .returnOriginalNameOfAccountTo("test Account");
    }
}
