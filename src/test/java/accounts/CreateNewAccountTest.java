package accounts;

import base.Base;
import base.BaseTest;
import data.UserData;
import org.openqa.selenium.WebDriver;
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
        accountsPage = logInPage.logInPlayGround(UserData.salesUserEmail, UserData.salesUserPassword)
                .openAccountsPage()
                .clickOnNewAccountButton()
                .createNewAccount("test 2", "5000");

    }
}


