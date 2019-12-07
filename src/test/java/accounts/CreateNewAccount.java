package accounts;

import base.BaseTest;
import data.UserData;
import org.testng.annotations.Test;
import pages.accounts.AccountsPage;
import pages.accounts.CreateNewAccountsPage;
import pages.HomePage;
import pages.LogInPage;

public class CreateNewAccount extends BaseTest {
    public LogInPage logInPage;
    public HomePage homePage;
    public AccountsPage accountsPage;
    public CreateNewAccountsPage createNewAccountsPage;
    public UserData userData;


    @Test
    public void createAccount() throws InterruptedException {

        logInPage = base.openPlayGroundPage();
        logInPage.driver.get("https://curious-moose-50xavl-dev-ed.lightning.force.com/");
        accountsPage = logInPage.logInPlayGround(UserData.SALES_USER_EMAIL, UserData.SALES_USER_PASSWORD)
                .openAccountsPage()
                .clickOnNewAccountButton()
                .createNewAccount("test 2", "5000");

    }
}


