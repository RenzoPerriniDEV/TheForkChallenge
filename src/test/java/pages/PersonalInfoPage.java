package pages;

import config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PersonalInfoPage extends BasePage {

    public PersonalInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "fragment_container_view")
    WebElement personal_info_container;

    @FindBy(id = "email_text_view")
    WebElement email_text;

    @FindBy(id = "first_name_edit_text")
    WebElement first_name_text;

    @FindBy(id = "last_name_edit_text")
    WebElement last_name_text;

    @FindBy(id = "birth_date_edit_text")
    WebElement birthdate_text;

    @FindBy(id = "edittext_phone")
    WebElement pone_text;

    public boolean personalInfoPageIsLoaded() {
        webDriverWait.until(ExpectedConditions.visibilityOf(personal_info_container));
        return true;
    }

    public String getEmailText() {
        webDriverWait.until(ExpectedConditions.visibilityOf(email_text));
        return email_text.getText();
    }

    public String getFirstNameText() {
        webDriverWait.until(ExpectedConditions.visibilityOf(first_name_text));
        return first_name_text.getText();
    }

    public String getLastNameText() {
        webDriverWait.until(ExpectedConditions.visibilityOf(last_name_text));
        return last_name_text.getText();
    }

    public String getBirthDateText() {
        webDriverWait.until(ExpectedConditions.visibilityOf(birthdate_text));
        return birthdate_text.getText();
    }

    public String getPhoneNumberText() {
        webDriverWait.until(ExpectedConditions.visibilityOf(pone_text));
        return pone_text.getText();
    }
}
