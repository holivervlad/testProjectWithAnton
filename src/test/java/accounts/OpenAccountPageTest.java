package accounts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OpenPlayGround;

public class OpenAccountPageTest extends BaseTest {
    public OpenPlayGround openPlayGround;
    public HomePage homePage;

    @Test
    public void openAccountPageTest() {
        openPlayGround = base.openPlayGroundPage();
        homePage = openPlayGround.logInPlayGround("vladyslav.holiver@curious-moose-50xavl.com",
                "Test_123");
    }
}
