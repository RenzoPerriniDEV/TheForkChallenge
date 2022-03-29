package pages;

import config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Users;

public class OnboardingPage extends BasePage {

    public OnboardingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Get started button - Next button
    @FindBy(id = "next_button")
    WebElement next_button;

    //Accept and continue
    @FindBy(id = "consent_button")
    WebElement accept_continue_button;

    public void clickOnGetStartedButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(next_button));
        next_button.click();
    }

    public void clickOnNextButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(next_button));
        next_button.click();
    }

    public LoginPage clickOnAcceptAndContinueButton() {
        LoginPage loginPage = new LoginPage(driver);
        webDriverWait.until(ExpectedConditions.visibilityOf(accept_continue_button));
        accept_continue_button.click();
        return loginPage;
    }

}
