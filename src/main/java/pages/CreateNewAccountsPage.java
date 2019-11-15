package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindBy;

public class CreateNewAccountsPage extends BasePage {

    @FindBy(xpath = "//span[text() = 'Account Name']/../..//input[@type = 'text']")
    private WebElement accountNameField;

    @FindBy(xpath = "//button[@title = 'Save']")
    private WebElement saveNewCcountButton;

    @FindBy(xpath = "//span[text() = 'Active']/../..//div[@class = 'uiMenu']")
    private WebElement activeDropDown;

    @FindBy (xpath = "//div[@class = 'select-options']//a[text() = 'Yes']")
    private WebElement chooseActiveinActiveDropDown;

    @FindBy(xpath = "//div[@class = 'form-element']")
    private WebElement slaExpirationDateDropDownCalendar;
    @FindBy(xpath = "//td[@class = 'slds-is-today slds-is-selected uiDayInMonthCell']")
    private WebElement todaysDateInSlaExpirationDateDropDownCalendar;

    @FindBy(xpath = "//span[text() = 'SLA']/../..//div[@class = 'uiMenu']")
    private WebElement slaDropDown;
    @FindBy (xpath = "/html/body/div[8]/div/ul/li[2]/a")
    private WebElement valueInTheSlaDropDown;

    @FindBy(xpath = "//span[text() = 'SLA Expiration Date']/../..//div[@class = 'uiMenu']")
    private WebElement slaSerialNumberField;

    public AccountsPage createNewAccount(String accountName, String slaSerialNumber) throws InterruptedException {
        accountNameField.sendKeys(accountName);
        activeDropDown.click();
        waitUntilLoading(chooseActiveinActiveDropDown);
//        Thread.sleep(5000);
        chooseActiveinActiveDropDown.click();
//        Thread.sleep(5000);
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
//                ,slaExpirationDateDropDownCalendar);

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("0, window.scrollTo(document.body.scrollDown)");
//
//        Thread.sleep(5000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 500);");
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("scroll(0, 500);");
//        jse.executeScript("window.scrollBy(5)");
        waitUntilLoading(slaExpirationDateDropDownCalendar);
        slaExpirationDateDropDownCalendar.click();
        waitUntilLoading(todaysDateInSlaExpirationDateDropDownCalendar);
        todaysDateInSlaExpirationDateDropDownCalendar.click();
        waitUntilLoading(slaDropDown);
        slaDropDown.click();
        waitUntilLoading(valueInTheSlaDropDown);
        valueInTheSlaDropDown.click();
        waitUntilLoading(slaSerialNumberField);
        slaSerialNumberField.sendKeys(slaSerialNumber);
        waitUntilLoading(saveNewCcountButton);
        saveNewCcountButton.click();
        return new AccountsPage();
    }
}
