package configurationManager;

import org.openqa.selenium.WebDriver;

public class BaseConfiguration {
    public WebDriver driver;

    public BaseConfiguration(WebDriver driver) {
        this.driver = driver;
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "\\src\\main\\resources\\chromedriver");
    }
}
