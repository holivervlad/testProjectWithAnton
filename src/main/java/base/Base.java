package base;

import configurationManager.BaseConfiguration;
import data.UserData;
import pages.LogInPage;

public class Base extends UserData {
    private static String originUrl = "https://curious-moose-50xavl-dev-ed.lightning.force.com/";
    public LogInPage openPlayGroundPage() {
        BaseConfiguration.getDriver().get(originUrl);
        return new LogInPage();
    }
}
