package org.andersen.lab.lesson11.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    public WebDriver driver;

    public AccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id='center_column']/h1")
    private WebElement myAccount;

    @FindBy(xpath = "//*[@title='Information']")
    private WebElement personalInformationButton;

    @FindBy(xpath = "//*[@id='old_passwd']")
    private WebElement oldPasswordField;

    @FindBy(xpath = "//*[@id='passwd']")
    private WebElement newPasswordField;

    @FindBy(xpath = "//*[@id='confirmation']")
    private WebElement confirmationPasswordField;

    @FindBy(xpath = "//*[@name='submitIdentity']")
    private WebElement saveButton;
    public String findMyAccount() {
        return myAccount.getText();
    }
    public void personalInformationClick() {
        personalInformationButton.click();
    }

    public void inputOldPassword(String oldPassword) {
        oldPasswordField.sendKeys(oldPassword);
    }

    public void inputNewPassword(String newPassword) {
        newPasswordField.sendKeys(newPassword);
    }

    public void confirmNewPassword(String newPassword) {
        confirmationPasswordField.sendKeys(newPassword);
    }

    public void clickSave() {
        saveButton.click();
    }
}
