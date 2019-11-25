package base;

import configurationManager.BaseConfiguration;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static configurationManager.BaseConfiguration.getDriver;

public class BasePage {
    public WebDriver driver;

    public BasePage() {
        driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void waitUntilLoading(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

//    public void scrollScreenAndroid(int timesToScroll) throws InterruptedException {
//        Dimension dimension = getDriver().manage().window().getSize();
//        int width = dimension.getWidth() / 2;
//        for (int i = 0; i < timesToScroll; i++) {
//            int startY = (int) (dimension.getHeight() * 0.7);
//            int endY = (int) (dimension.getHeight() * 0.3);
//
//            JavascriptExecutor js = ((JavascriptExecutor) driver);
//            js.executeScript(driver.navigate(width, endY)).wait(2000);
//
//            new TouchAction(getDriver(press(width, startY).waitAction(wait(2222);
//                    .moveTo(point(width, endY)).release().perform();
//        }
//    }

}
