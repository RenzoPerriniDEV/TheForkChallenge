package pages;

import config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TheForkPage extends BasePage {

    public TheForkPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "_evidon-accept-button")
    WebElement accept_cookies_button;

    @FindBy(id = "_evidon_banner")
    WebElement modal_coockies;

    @FindBy(xpath = "//button[@data-test='user-space']")
    WebElement login_button;

    @FindBy(xpath = "//user-space-identification-step")
    WebElement login_container;

    //Accept cookies
    public void clickOnAcceptCookiesButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(accept_cookies_button));
        accept_cookies_button.click();
        webDriverWait.until(ExpectedConditions.visibilityOf(modal_coockies));
    }

    public void loginWebSite() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(login_button));
        login_button.click();
        webDriverWait.until(ExpectedConditions.visibilityOf(login_container));
    }

}
