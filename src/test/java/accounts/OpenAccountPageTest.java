package accounts;

import base.Base;
import base.BaseTest;
import data.UserData;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;

public class OpenAccountPageTest extends BaseTest {
    public LogInPage logInPage;
    public HomePage homePage;

    @Test
    public void openAccountPageTest() throws InterruptedException {
        logInPage = base.openPlayGroundPage();
        homePage = logInPage.logInPlayGround(UserData.SALES_USER_EMAIL, UserData.SALES_USER_PASSWORD);
    }
}
