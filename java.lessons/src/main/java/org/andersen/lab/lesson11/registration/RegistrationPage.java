package org.andersen.lab.lesson11.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public WebDriver driver;
    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//input[contains(@name, 'name')]")
    private WebElement nameField;

    @FindBy(css= "p:nth-child(2) > input")
    private WebElement secondNameField;

    @FindBy(xpath = "//label[contains(text(), 'Single')]")
    private WebElement martialStatusSingleField;

    @FindBy(xpath = "//label[contains(text(), 'Reading')]")
    private WebElement hobbyReadingField;

    @FindBy(css= "fieldset:nth-child(4)")
    private WebElement countryField;

    @FindBy(css= "time_feild:nth-child(2)")
    private WebElement dayField;

    @FindBy(css= "time_feild:nth-child(3)")
    private WebElement monthField;

    @FindBy(css= "time_feild:nth-child(3)")
    private WebElement yearField;

    @FindBy(xpath = "//input[contains(@name, 'phone')]")
    private WebElement phoneField;

    @FindBy(xpath = "//input[contains(@name, 'username')]")
    private WebElement userNameField;

    @FindBy(xpath = "//input[contains(@name, 'email')]")
    private WebElement emailField;

    @FindBy(xpath = "//input[contains(@name, 'password')]")
    private WebElement passwordField;

    @FindBy(xpath = "//input[contains(@name, 'c_password')]")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//input[contains(@value, 'submit')]")
    private WebElement submitButton;

    @FindBy(xpath = "//*[contains(@class, 'error_p')]")
    private WebElement errorMessage;


    public void getErrorMessage() {
        errorMessage.isEnabled(); }

    public void inputName(String name) {
        nameField.sendKeys(name); }

    public void inputSecondName(String secondName) {
        secondNameField.sendKeys(secondName); }

    public void clickMartialStatusSingle() {
        martialStatusSingleField.click();
    }
    public void clickHobbyReading() {
        hobbyReadingField.click();
    }

    public void inputPhone(String phone) {
        phoneField.sendKeys(phone);
    }

    public void inputUsername(String username) {
        userNameField.sendKeys(username);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void inputConfirmPassword(String c_password) {
        confirmPasswordField.sendKeys(c_password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

}

