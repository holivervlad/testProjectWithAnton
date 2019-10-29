package accounts;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OpenPlayGround;


import java.util.concurrent.TimeUnit;

public class OpenAccountPageTest {
    public static WebDriver driver ;
    public static String baseURL = "https://trailhead.salesforce.com/";

    @BeforeTest
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get(baseURL);

    }

    @Test
    public void openAccountPageTest() {
        OpenPlayGround openPlayGround = new OpenPlayGround(driver);
        openPlayGround.logInPlayGround("holivervlad@gmail.com",
                "Vmapa89vmapa89");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomePage homePage = new HomePage(driver);
        homePage.clickOnAccountTab();
    }

    @After
    public static void closeDown() {
        driver.quit();
    }
}
