package base;

import configurationManager.BaseConfiguration;
import pages.OpenPlayGround;

public class Base {
    private static String originUrl = "";

    public OpenPlayGround openPlayGroundPage() {
        BaseConfiguration.getDriver().get(originUrl);
        return new OpenPlayGround();
    }
}
