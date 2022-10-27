package org.andersen.lab.lesson11.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[6]/ul/li[2]/a")
    private WebElement dressesButton;

    @FindBy(xpath = "//*[@id='center_column']/ul/li[5]/div/div[2]/h5/a")
    private WebElement printedChiffonDressButton;

    @FindBy(xpath = "//span[contains(.,'Add to cart')]")
    private WebElement addToCardButton;

    @FindBy(xpath = "//span[contains(.,'Proceed to checkout')]")
    private WebElement toCheckoutButton;

    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img")
    private WebElement fadedTshirtIcon;
    @FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]")
    private WebElement addToCartFadedTshirtButton;
    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id='homefeatured']/li[2]/div/div[1]/div/a[1]/img")
    private WebElement blouseIcon;

    @FindBy(xpath = "//*[@id='homefeatured']/li[2]/div/div[2]/div[2]/a[1]")
    private WebElement addToCartBlouse;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[2]/a")
    private WebElement signOutButton;

    @FindBy(xpath = "//*[@id='header_logo']/a/img")
    private WebElement toMainPage;

    @FindBy(xpath = "//*[@id='center_column']/div/div/div[3]/h1")
    private WebElement namePrintedChiffonDress;

    @FindBy(xpath = "//*[@id='homefeatured']/li[4]/div/div[2]/h5/a")
    private WebElement printedDressIcon;

    @FindBy(xpath = "//*[@id='homefeatured']/li[4]/div/div[2]/div[2]/a[1]")
    private WebElement addToCartPrintedDressButton;

    @FindBy(xpath = "//*[@class='login']")
    private WebElement logInButton;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement emailAlreadyRegistered;

    @FindBy(xpath = "//*[@id='passwd']")
    private WebElement passwordAlreadyRegistered;

    @FindBy(xpath = "//*[@id='SubmitLogin']")
    private WebElement submitLoginButton;


    public void clickDresses() {
        dressesButton.click();
    }

    public void clickPrintedChiffonDress() {
        printedChiffonDressButton.click();
    }

    public void clickAddToCard() {
        addToCardButton.click();
    }

    public void clickToCheckout() {
        toCheckoutButton.click();
    }

    public void clickFadedTshirt() {
        Actions builder = new Actions(driver);
        builder.moveToElement(fadedTshirtIcon).perform();
        addToCartFadedTshirtButton.click();
    }

    public void clickContinue() {
        continueButton.click();
    }

    public void clickBlouse() {
        Actions builder = new Actions(driver);
        builder.moveToElement(blouseIcon).perform();
        addToCartBlouse.click();
    }

    public void clickSignOut() {
        signOutButton.click();
    }

    public void clickToMainPage() {
        toMainPage.click();
    }

    public String findPrintedChiffonDress() {
        return namePrintedChiffonDress.getText();
    }

    public void clickPrintedDress() {
        Actions builder = new Actions(driver);
        builder.moveToElement(printedDressIcon).perform();
        addToCartPrintedDressButton.click();
    }

    public void clickLogIn() {
        logInButton.click();
    }

    public void fillEmailRegistered(String email) {
        emailAlreadyRegistered.sendKeys(email);
    }

    public void fillPasswordRegistered(String password) {
        passwordAlreadyRegistered.sendKeys(password);
    }

    public void submitLoginClick() {
        submitLoginButton.click();
    }
}
