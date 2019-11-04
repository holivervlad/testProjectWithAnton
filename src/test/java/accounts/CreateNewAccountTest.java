package accounts;

import base.Base;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.OpenPlayGround;

import java.util.concurrent.TimeUnit;

public class CreateNewAccountTest extends BaseTest {
    public OpenPlayGround openPlayGround;
    public HomePage homePage;
    public Base base;
    //WebDriver driver;


    @Test
    public void openAccountPageTest() {
        //base.openPlayGroundPage();
        openPlayGround = base.openPlayGroundPage();
        homePage = openPlayGround.logInPlayGround("vladyslav.holiver@curious-moose-50xavl.com",
                "Test_123");
        HomePage homePage = new HomePage();
        homePage.clickOnAccountTab();
        AccountPage accountPage = new AccountPage();
        accountPage.createNewAccount("test123");
    }
}


