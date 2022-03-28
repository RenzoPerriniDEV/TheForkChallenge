package tests;

import config.BasePage;
import org.testng.annotations.Test;
import pages.TheForkPage;

public class TestPersonalData extends BasePage {

    @Test
    public void test_validate_personal_information() {
        goTo(base_url);
        TheForkPage theForkPage = new TheForkPage(driver);
        theForkPage.clickOnAcceptCookiesButton();
        theForkPage.loginWebSite();
    }

}
