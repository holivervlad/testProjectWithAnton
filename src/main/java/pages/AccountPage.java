package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountPage extends BasePage {

   public WebDriver driver;

    public AccountPage(WebDriver driver){this.driver = driver;}

    @FindBy(xpath = "//ul/li[@class = 'slds-button slds-button--neutral slds-truncate']//div[@title = 'New']")
    private WebElement newAccountButton;

    @FindBy(xpath = "//div//a/div[@title = 'Import']")
    private WebElement importButton;

    @FindBy(xpath = "//input[@id='94:1424;a']")
    private WebElement accountNameField;

    @FindBy(xpath = "//button[@type = 'button'][@title = 'Save']/span")
    private WebElement saveNewCcountButton;


//    WebElement localSearchofSomeAccount = driver.findElement(
//            By.id("input-114"));
//    WebElement listViewControls = driver.findElement(
//            By.xpath("//div[@title = \"List View Controls\"]"));
//    WebElement displayAsTable = driver.findElement(
//            By.xpath("//button[@class = \"slds-button slds-button_icon s"+
//                    "lds-button_icon-more\"][@title = \"Display as Table\"]"));
//    WebElement refreshButton = driver.findElement(
//            By.xpath("//button[@name = \"refreshButton\"]"));
//    WebElement inlineEditButton = driver.findElement(
//            By.xpath("//button[@name = \"inlineEditButton\"]"));

    public AccountPage() {

    }

    public AccountPage createNewAccount (String accountName) {
     driver.findElement((By) newAccountButton).click();
     driver.findElement((By) accountNameField).sendKeys();
     return new AccountPage(driver);
    }

}
