package pages.accounts;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.accounts.AccountsPage;

import javax.swing.*;

public class CreateNewAccountsPage extends BasePage {

    @FindBy(xpath = "//span[text() = 'Account Name']/../..//input[@type = 'text']")
    private WebElement accountNameField;

    @FindBy(xpath = "//button[@title = 'Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//span[text() = 'Active']/../..//div[@class = 'uiMenu']")
    private WebElement activeDropDown;

    @FindBy(xpath = "//div[@class = 'select-options']//a[text() = 'Yes']")
    private WebElement chooseActiveinActiveDropDown;

    @FindBy(xpath = "//span[text() = 'Date Picker']")
    private WebElement slaExpirationDateDropDownCalendar;

    @FindBy(xpath = "//td[@class = 'slds-is-today slds-is-selected uiDayInMonthCell']")
    private WebElement todaysDateInSlaExpirationDateDropDownCalendar;

    @FindBy(xpath = "//span[text() = 'SLA']/../..//div[@class = 'uiMenu']")
    private WebElement slaDropDown;

    @FindBy(xpath = "/html/body/div[8]/div/ul/li[2]/a")
    private WebElement valueInTheSlaDropDown;

    @FindBy(xpath = "//span[text() = 'SLA Expiration Date']/../..//div[@class = 'uiMenu']")
    private WebElement slaSerialNumberField;

    @FindBy(xpath = "//span[text() = 'Billing Street']/../..//textarea[@placeholder = 'Billing Street']")
    private WebElement billingStreetField;

    @FindBy(xpath = "//span[text() = 'Employees']")
    private WebElement employeesField;

    @FindBy(xpath = "//span[text() = 'Customer Priority']/../..//div[@class = 'uiMenu']")
    private WebElement customerPriorityDropDown;

    @FindBy(xpath = "//div[@id = 'brandBand_1']")
    private WebElement newAccountPopUp;

    public AccountsPage createNewAccount(String accountName, String slaSerialNumber) throws InterruptedException {
        waitUntilLoading(accountNameField);
        accountNameField.sendKeys(accountName);
        waitUntilLoading(activeDropDown);
        activeDropDown.click();
        waitUntilLoading(chooseActiveinActiveDropDown);
        waitUntilLoading(chooseActiveinActiveDropDown);
        chooseActiveinActiveDropDown.click();
        saveButton.click();

        //driver.switchTo().frame("FirebugUI");


//        WebElement scroll = driver.findElement(By.id("brand"));
//        scroll.sendKeys(Keys.PAGE_DOWN);

//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("window.scrollBy(0,250)", "");





        int size = driver.findElements(By.tagName("iframe")).size();

        for(int i=0; i<=size; i++){
            driver.switchTo().frame(i);
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,250)", "");
            }
//        Thread.sleep(5000);
//        jse.executeScript("window.scrollBy(0,250)", "");


//        Actions action = new Actions(driver);
//        action.moveToElement(newAccountPopUp, 1417, 763).click().build().perform();
//        Thread.sleep(5000);
//        action.moveToElement(newAccountPopUp, 1419, 781).click().build().perform();
//        action.moveToElement(newAccountPopUp, 1432, 759).click().build().perform();

//        new Actions(driver).moveToElement(slaDropDown).moveByOffset(1432, 759).click().perform();
//        new Actions(driver).moveToElement(slaDropDown).moveByOffset(1432, 759).click().perform();

//
//        if(activeDropDown.isDisplayed()) { slaExpirationDateDropDownCalendar.click();
//        waitUntilLoading(todaysDateInSlaExpirationDateDropDownCalendar);} else {
//            customerPriorityDropDown.click();
//            Thread.sleep(5000);
//
//
        Thread.sleep(5000);
        waitUntilLoading(slaDropDown);
        slaDropDown.click();
        waitUntilLoading(valueInTheSlaDropDown);

        slaExpirationDateDropDownCalendar.click();
        waitUntilLoading(todaysDateInSlaExpirationDateDropDownCalendar);

        todaysDateInSlaExpirationDateDropDownCalendar.click();
        waitUntilLoading(slaDropDown);

        valueInTheSlaDropDown.click();
        waitUntilLoading(slaSerialNumberField);
        slaSerialNumberField.sendKeys(slaSerialNumber);
        waitUntilLoading(saveButton);
        saveButton.click();
        return new AccountsPage();
    }
}
