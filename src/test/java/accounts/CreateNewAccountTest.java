package accounts;

import base.BaseTest;
import data.UserData;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.CreateNewAccountsPage;
import pages.HomePage;
import pages.LogInPage;

public class CreateNewAccountTest extends BaseTest {
    public LogInPage logInPage;
    public HomePage homePage;
    public AccountsPage accountsPage;
    public CreateNewAccountsPage createNewAccountsPage;
    public UserData userData;

    @Test
    public void openAccountPageTest() throws InterruptedException {
        logInPage = base.openPlayGroundPage();
        accountsPage = logInPage.logInPlayGround("vladyslav.holiver@curious-moose-50xavl.com",
                "Test_123")
                .openAccountsPage()
                .clickOnNewAccountButton()
                .createNewAccount("test 2");


       // accountsPage = accountsPage.createNewAccount("test123");

    }
}


