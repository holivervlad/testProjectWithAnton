package accounts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;

public class OpenAccountPageTest extends BaseTest {
    public LogInPage logInPage;
    public HomePage homePage;

    @Test
    public void openAccountPageTest() {
        logInPage = base.openPlayGroundPage();
        homePage = logInPage.logInPlayGround("vladyslav.holiver@curious-moose-50xavl.com",
                "Test_123");

    }
}
