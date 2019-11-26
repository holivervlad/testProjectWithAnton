package pages.accounts;

import base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.accounts.AccountsPage;

public class CreateNewAccountsPage extends BasePage {

    @FindBy(xpath = "//span[text() = 'Account Name']/../..//input[@type = 'text']")
    private WebElement accountNameField;

    @FindBy(xpath = "//button[@title = 'Save']")
    private WebElement saveNewCcountButton;

    @FindBy(xpath = "//span[text() = 'Active']/../..//div[@class = 'uiMenu']")
    private WebElement activeDropDown;

    @FindBy (xpath = "//div[@class = 'select-options']//a[text() = 'Yes']")
    private WebElement chooseActiveinActiveDropDown;

    @FindBy(xpath = "//span[text() = 'Date Picker']")
    private WebElement slaExpirationDateDropDownCalendar;

    @FindBy(xpath = "//td[@class = 'slds-is-today slds-is-selected uiDayInMonthCell']")
    private WebElement todaysDateInSlaExpirationDateDropDownCalendar;

    @FindBy(xpath = "//span[text() = 'SLA']/../..//div[@class = 'uiMenu']")
    private WebElement slaDropDown;

    @FindBy (xpath = "/html/body/div[8]/div/ul/li[2]/a")
    private WebElement valueInTheSlaDropDown;

    @FindBy(xpath = "//span[text() = 'SLA Expiration Date']/../..//div[@class = 'uiMenu']")
    private WebElement slaSerialNumberField;

    @FindBy(xpath = "//span[text() = 'Billing Street']/../..//textarea[@placeholder = 'Billing Street']")
    private WebElement billingStreetField;

    @FindBy(xpath = "//span[text() = 'Employees']")
    private WebElement employeesField;

    public AccountsPage createNewAccount(String accountName, String slaSerialNumber) throws InterruptedException {
//        Thread.sleep(5000);
//        accountNameField.sendKeys(accountName);
//        Thread.sleep(5000);
//        activeDropDown.click();
//        //waitUntilLoading(chooseActiveinActiveDropDown);
//        Thread.sleep(5000);
//        chooseActiveinActiveDropDown.click();
//        Thread.sleep(5000);

        //var 1:
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("window.scrollBy(0,350)");

        //var 2:
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("scroll(0, 1050);");

        //var 3:
//        JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        //var 4:
//        JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        //var 5:
//        Actions dragger = new Actions(driver);
//        WebElement draggablePartOfScrollbar = driver.findElement((By) slaExpirationDateDropDownCalendar);
//
//        // drag downwards
//        int numberOfPixelsToDragTheScrollbarDown = 50;
//        for (int i=10;i<500;i=i+numberOfPixelsToDragTheScrollbarDown){
//            try{
//                // this causes a gradual drag of the scroll bar, 10 units at a time
//                dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollbarDown).release().perform();
//                Thread.sleep(1000L);
//            }catch(Exception e1){}
//        }
        //var 6:
//        JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("window.scrollBy(0,450)", "");

        //var 7:
//        WebElement scrollLocation = driver.findElement((By) slaExpirationDateDropDownCalendar);
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", scrollLocation);
//        slaExpirationDateDropDownCalendar.click();

        //var 8:
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollTo(-300, document.body.scrollHeight)");

        //var 9:
//        WebElement element = slaExpirationDateDropDownCalendar;
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        //var 10:
//        JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        Thread.sleep(10000);
//        employeesField.click();
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        js.executeScript("window.scrollBy(0,350)");

        //var 11:
        int i = 1;
        while (i < 8) {
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("window.scrollTo(0,350)");
            i++;
        }
       // js.executeScript("window.scrollBy(0,1000)");

//        Thread.sleep(10000);
//        slaExpirationDateDropDownCalendar.click();
//        //waitUntilLoading(todaysDateInSlaExpirationDateDropDownCalendar);
//        Thread.sleep(5000);
//        todaysDateInSlaExpirationDateDropDownCalendar.click();
//        //waitUntilLoading(slaDropDown);
//        Thread.sleep(5000);
//        slaDropDown.click();
//        //waitUntilLoading(valueInTheSlaDropDown);
//        Thread.sleep(5000);
//        valueInTheSlaDropDown.click();
//        //waitUntilLoading(slaSerialNumberField);
//        Thread.sleep(5000);
//        slaSerialNumberField.sendKeys(slaSerialNumber);
//        //waitUntilLoading(saveNewCcountButton);
//        Thread.sleep(5000);
//        saveNewCcountButton.click();
        return new AccountsPage();
    }
}
