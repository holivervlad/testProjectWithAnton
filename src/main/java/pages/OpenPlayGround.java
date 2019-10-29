package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenPlayGround {
    public WebDriver driver;

    public OpenPlayGround(WebDriver driver) {
        this.driver = driver;
    }

    private By logInButton = By.xpath("//header//div[2]//div" +
            "[@class = \"slds-m-left_x-small\"][2]");
    private By linkidineButton = By.xpath("//button[@id=\"login_with_linkedin\"]/span");
    private By logInFieldLinkidine = By.xpath("//input[@id=\"username\"]");
    private By passwordFieldLinkidine = By.xpath("//input[@id=\"password\"]");
    private By signInButtonLinkidine = By.xpath("//div/form/div[3]/button[@type= \"submit\"]");
    private By nameOfUser = By.xpath("//div[@data-test = \"header-user-name\"]");
    private By launchButton = By.xpath("//div[@class = \"slds-p-bottom_large slds-p-horizontal_large\"]//a");

    public HomePage logInPlayGround(String emailData, String passwordData) {
        driver.findElement(logInButton).click();
        driver.findElement(linkidineButton).click();
        driver.findElement(logInFieldLinkidine).clear();
        driver.findElement(logInFieldLinkidine).sendKeys(emailData);
        driver.findElement(passwordFieldLinkidine).clear();
        driver.findElement(passwordFieldLinkidine).sendKeys(passwordData);
        driver.findElement(signInButtonLinkidine).click();
            WebElement explicitWait = (new WebDriverWait(driver, 20))
                    .until(ExpectedConditions.presenceOfElementLocated(nameOfUser));
            driver.get("https://trailhead.salesforce.com/content/learn/modules/platform-developer-i-certification-maintenance-winter-19/work-with-the-lightning-map-component-and-apex-inherited-sharing");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,100050)");
        driver.findElement(launchButton).click();
        return new HomePage(driver);
    }
}
