package base;

import configurationManager.BaseConfiguration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BaseTest extends BaseConfiguration{
    public final Base base = new Base();
    //public WebDriver driver = BaseConfiguration.getDriver();

    @BeforeSuite(alwaysRun = true)
    protected void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }


    @AfterSuite(alwaysRun = true)
    protected void afterSuiteActions() {
//        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//        driver.close();
//        BaseConfiguration.getDriver().quit();
    }
}
