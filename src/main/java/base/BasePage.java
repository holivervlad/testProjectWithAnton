package base;

import configurationManager.BaseConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;

    public BasePage() {
        driver = BaseConfiguration.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void waitUntilLoading(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));

    }
}
