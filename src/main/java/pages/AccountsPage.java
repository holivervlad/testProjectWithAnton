package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountsPage extends BasePage {

   public WebDriver driver;
   public CreateNewAccountsPage createNewAccountsPage;

    public AccountsPage(WebDriver driver){this.driver = driver;}

    @FindBy(xpath = "//ul/li[@class = 'slds-button slds-button--neutral slds-truncate']//div[@title = 'New']")
    private WebElement newAccountButton;

    @FindBy(xpath = "//div//a/div[@title = 'Import']")
    private WebElement importButton;

    @FindBy(xpath = "//h1[@class = 'slds-truncate slds-page-header__title slds-text-color--default']")
    private WebElement listViewDropDown;

    @FindBy(xpath = "//ul[@id='virtualAutocompleteListbox_e4947a128442e']/li[2]")
    private WebElement allAccountsListView;

    @FindBy (xpath = "//input[@id = 'input-101']")
    private WebElement localSearch;



// описать лист вьюхи (ll accounts как базовый)
// писать поле серч локальное и через jsvsscript передать Энтер
// создать тестового юзера под которым залогиниться(не админ). Создать под профилем Custom: Sales Profile
// експлисити вейт создать и вынести в basepage (метод который будет принимать в себя какой то елемент и он будет отрабатывает с этим эелементом)




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

    public AccountsPage() {

    }

    public CreateNewAccountsPage clickOnNewAccountButton () {
     driver.findElement((By) newAccountButton).click();
     return new CreateNewAccountsPage();
    }

}
