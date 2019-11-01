package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenPlayGround {
    @FindBy(xpath = "//header//div[2]//div[@class = \"slds-m-left_x-small\"][2]")
    private WebElement logInButton;

    @FindBy(xpath = "//button[@id=\"login_with_linkedin\"]/span")
    private WebElement linkidineButton;

    @FindBy(xpath = "//input[@id=\"username\"]")
    private WebElement logInFieldLinkidine;

    @FindBy(xpath = "//input[@id=\"password\"]")
    private WebElement passwordFieldLinkidine;

    @FindBy(xpath = "//div/form/div[3]/button[@type= \"submit\"]")
    private WebElement signInButtonLinkidine;

    @FindBy(xpath = "//div[@data-test = \"header-user-name\"]")
    private WebElement nameOfUser;

    @FindBy(xpath = "//div[@class = \"slds-p-bottom_large slds-p-horizontal_large\"]//a")
    private WebElement launchButton;

    public HomePage logInPlayGround(String emailData, String passwordData) {
        logInButton.click();
        linkidineButton.click();
        logInFieldLinkidine.clear();
        logInFieldLinkidine.sendKeys(emailData);
        passwordFieldLinkidine.clear();
        passwordFieldLinkidine.sendKeys(passwordData);
        signInButtonLinkidine.click();

        return new HomePage();
    }
}
