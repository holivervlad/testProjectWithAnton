package base;

import configurationManager.BaseConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private WebDriver driver = BaseConfiguration.getDriver();
    protected BasePage() {
        PageFactory.initElements(driver, this);
    }


}
