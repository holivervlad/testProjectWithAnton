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
    protected BasePage() {
        PageFactory.initElements(driver, this);
    }


//    WebDriverWait wait = new WebDriverWait(WebDriverRefrence,20);
//    WebElement aboutMe;
//    aboutMe= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_me")));

public void waitUntilLoading(WebElement element){
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) element));
}

}
