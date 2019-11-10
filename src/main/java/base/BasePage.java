package base;

import configurationManager.BaseConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver = BaseConfiguration.getDriver();
    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public void waitUntilLoading(WebElement element){
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) element));
    }
}
