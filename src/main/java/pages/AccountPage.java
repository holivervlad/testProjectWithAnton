package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AccountPage {

   public static WebDriver driver;
   public static String s;

    public AccountPage(WebDriver driver){this.driver = driver;}

private By newAccountButton = By.xpath("//ul/li[@class = \"slds-button slds-button--neutral slds-truncate\"][1]");
    WebElement listViewDropDown = driver.findElement(
            By.xpath("//div[@class = \"slds-grid\"]/h1"));
//    WebElement newAccountButton = driver.findElement(
//            By.xpath("//ul/li[@class = \"slds-button slds-button--neutral slds-truncate\"][1]"));
    WebElement importButton = driver.findElement(
            By.xpath("//div//a/div[@title = \"Import\"]"));

    WebElement localSearchofSomeAccount = driver.findElement(
            By.id("input-114"));
    WebElement listViewControls = driver.findElement(
            By.xpath("//div[@title = \"List View Controls\"]"));
    WebElement displayAsTable = driver.findElement(
            By.xpath("//button[@class = \"slds-button slds-button_icon s"+
                    "lds-button_icon-more\"][@title = \"Display as Table\"]"));
    WebElement refreshButton = driver.findElement(
            By.xpath("//button[@name = \"refreshButton\"]"));
    WebElement inlineEditButton = driver.findElement(
            By.xpath("//button[@name = \"inlineEditButton\"]"));

    //pop-up for creating New Account
 private By accountField = By.xpath("//input[@id=\"94:1260;a\"]");
 private By saveButton = By.xpath("//button[@type = \"button\"][@title = \"Save\"]/span");

    public AccountPage createNewAccount () {
     driver.findElement(newAccountButton).click();
     for (int i = 1; i < 900; i++){
      s = s +i;
     }
     driver.findElement(accountField).sendKeys("Test" + s);
     return new AccountPage(driver);
    }

}
