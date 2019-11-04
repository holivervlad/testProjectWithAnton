package base;

import configurationManager.BaseConfiguration;
import pages.OpenPlayGround;

public class Base {
    private static String originUrl = "https://curious-moose-50xavl-dev-ed.lightning.force.com/";

    public OpenPlayGround openPlayGroundPage() {
        BaseConfiguration.getDriver().get(originUrl);
        return new OpenPlayGround();
    }
}
