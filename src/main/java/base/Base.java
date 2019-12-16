package base;

import configurationManager.BaseConfiguration;
import data.UserData;
import pages.LogInPage;

public class Base {
    private static String originUrl = "https://curious-moose-50xavl-dev-ed.my.salesforce.com";
    public LogInPage openPlayGroundPage() throws InterruptedException {
        BaseConfiguration.getDriver().get(originUrl);
        Thread.sleep(5000);
        return new LogInPage();
    }
}
