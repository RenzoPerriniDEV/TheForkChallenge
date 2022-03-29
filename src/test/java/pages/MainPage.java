package pages;

import config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Main page after logging
    @FindBy(id = "content_recycler")
    WebElement main_container;

    //Menu opener
    @FindBy(id = "icon_search")
    WebElement top_menu;

    //Personal info button
    @FindBy(id = "personal_info")
    WebElement personal_info_button;

    //Check if main page is loaded
    public boolean mainPageIsLoaded() {
        webDriverWait.until(ExpectedConditions.visibilityOf(main_container));
        return true;
    }

    public void openListOfOptions() {
        webDriverWait.until(ExpectedConditions.visibilityOf(top_menu));
        top_menu.click();
    }

    public void clickOnPersonalInfoButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(personal_info_button));
        personal_info_button.click();
    }
}
