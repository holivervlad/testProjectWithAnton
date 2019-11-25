package accounts;

import base.BaseTest;
import data.UserData;
import org.testng.annotations.Test;
import pages.accounts.AccountsPage;
import pages.accounts.CreateNewAccountsPage;
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
        logInPage.driver.get("https://www.ukr.net");
        accountsPage = logInPage.logInPlayGround(UserData.salesUserEmail, UserData.salesUserPassword)
                .openAccountsPage()
                .clickOnNewAccountButton()
                .createNewAccount("test 2", "5000");

    }
}


