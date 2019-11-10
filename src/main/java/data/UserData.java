package data;

import base.BasePage;
import configurationManager.BaseConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.HomePage;
import pages.LogInPage;

public class UserData {
    public BasePage basePage;

    public UserData(WebDriver driver){this.driver = driver;}

    private static String CustomSalesProfileUser = "https://curious-moose-50xavl-dev-ed.lightning.force.com/lightning/setup/ManageUsers/page?address=%2F0051i000001HJCeAAO%3Fnoredirect%3D1%26isUserEntityOverride%3D1%26retURL%3D%252Fsetup%252Fhome";
    WebDriver driver;

    @FindBy (xpath = "//div[@id = 'ep']//td[@id='topButtonRow']//input[@value = 'Login']")
    WebElement logInButton;

    public HomePage logInAsSalesUser() throws InterruptedException {
        //

        BaseConfiguration.getDriver().get(CustomSalesProfileUser);
        Thread.sleep(10000);
        BasePage basePage;
        basePage = new BasePage();
        basePage.waitUntilLoading(logInButton);
        driver.findElement((By)logInButton).click();
        return new HomePage();
    }
}
