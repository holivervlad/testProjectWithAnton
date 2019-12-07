package accounts;

import base.BaseTest;
import data.UserData;
import org.testng.annotations.AfterMethod;
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
        accountsPage = logInPage.logInPlayGround(UserData.SALES_USER_EMAIL, UserData.SALES_USER_PASSWORD)
                .openAccountsPage()
                .openAccount("test Account")
                .OpenEditAccountPage()
                .updateAccountName("Hello World")
                .returnToAccountsPage();
        accountsPage
                .isAccountAvailable("Hello World");
    }
        @AfterMethod
                public void afterMethodActions() throws InterruptedException {
        accountsPage
                .openAccount("Hello World")
                .OpenEditAccountPage()
                .returnOriginalNameOfAccount("test Account");
    }
}
