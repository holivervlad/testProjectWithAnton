package pages;

import base.BasePage;
import data.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public WebDriver driver;
    public BasePage basePage;
    public UserData userData = new UserData(driver);
    HomePage homePage;

    @FindBy(xpath = "//div[@class = 'navMenu slds-context-bar__item--divider-right oneAppNavMenu']")
    private WebElement tabDropDown;

    @FindBy(xpath = "//*[@id='navMenuList']//span[@data-aura-rendered-by= '912:0']")
    private WebElement accountsTab;


    public AccountsPage openAccountsPage() throws InterruptedException {
        homePage = userData.logInAsSalesUser();
    driver.findElement((By)tabDropDown).click();
    basePage.waitUntilLoading((WebElement) accountsTab);
    driver.findElement((By)accountsTab).click();
    return new AccountsPage();
        }

//        public HomePage openHomePage() throws InterruptedException {
//        //написать експлисити вейт
//            driver.get("");
//            return this;
//        }
    }

