package tests;

import config.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.Users;

public class TestCheckPersonalData extends BasePage {

    @Test
    public void test_onboarding_the_fork() {
        goTo(base_url);
        LoginPage loginPage;
        OnboardingPage onboardingPage = new OnboardingPage(driver);
        onboardingPage.clickOnGetStartedButton();
        onboardingPage.clickOnNextButton();
        loginPage = onboardingPage.clickOnAcceptAndContinueButton();
        Assert.assertTrue(loginPage.loginPageIsLoaded());
    }

    @Test
    public void test_login_on_page() {
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLoginEmail();
        loginPage.loginOnThePage();
        Assert.assertTrue(mainPage.mainPageIsLoaded());
    }

    @Test
    public void test_navigate_to_personal_info_page() {
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        PersonalInfoPage personalInfoPage = new PersonalInfoPage(driver);
        mainPage.openListOfOptions();
        mainPage.clickOnPersonalInfoButton();
        loginPage.clickOnContinueButton();
        loginPage.setPassword();
        Assert.assertTrue(personalInfoPage.personalInfoPageIsLoaded());
    }

    @Test
    public void test_verify_personal_data() {
        PersonalInfoPage personalInfoPage = new PersonalInfoPage(driver);
        Assert.assertEquals(personalInfoPage.getEmailText(), Users.Email);
        Assert.assertEquals(personalInfoPage.getFirstNameText(), Users.FirstName);
        Assert.assertEquals(personalInfoPage.getLastNameText(), Users.LastName);
        Assert.assertEquals(personalInfoPage.getBirthDateText(), Users.BirthDate);
        Assert.assertEquals(personalInfoPage.getPhoneNumberText(), Users.Phone);
    }

}
