package pages;

import config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Users;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login_email")
    WebElement email_address;

    @FindBy(id = "login_password")
    WebElement login_password;

    @FindBy(id = "button_continue")
    WebElement continue_button;

    @FindBy(id = "button_connect")
    WebElement pass_continue_button;

    @FindBy(id = "title_text_view")
    WebElement login_title;

    public void setLoginEmail() {
        webDriverWait.until(ExpectedConditions.visibilityOf(email_address));
        email_address.click();
        email_address.sendKeys(Users.Email);
    }

    public MainPage loginOnThePage() {
        webDriverWait.until(ExpectedConditions.visibilityOf(continue_button));
        continue_button.click();
        MainPage mainPage = new MainPage(driver);
        return mainPage;
    }

    public boolean loginPageIsLoaded() {
        webDriverWait.until(ExpectedConditions.visibilityOf(login_title));
        return true;
    }

    public void clickOnContinueButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(continue_button));
        continue_button.click();
    }

    public PersonalInfoPage setPassword() {
        webDriverWait.until(ExpectedConditions.visibilityOf(login_password));
        PersonalInfoPage personalInfoPage = new PersonalInfoPage(driver);
        login_password.click();
        login_password.sendKeys(Users.Pass);
        pass_continue_button.click();
        return personalInfoPage;
    }
}
