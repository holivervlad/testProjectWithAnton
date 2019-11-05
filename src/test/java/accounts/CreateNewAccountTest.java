package accounts;

import base.Base;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LogInPage;

public class CreateNewAccountTest extends BaseTest {
    public LogInPage openPlayGround;
    public HomePage homePage;
    public Base base;


    @Test
    public void openAccountPageTest() {
        openPlayGround = base.openPlayGroundPage();
        homePage = openPlayGround.logInPlayGround("vladyslav.holiver@curious-moose-50xavl.com",
                "Test_123");
        HomePage homePage = new HomePage();
        homePage.clickOnAccountTab();
        AccountPage accountPage = new AccountPage();
        accountPage.createNewAccount("test123");
    }
}


