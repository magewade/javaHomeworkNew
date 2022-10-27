package org.andersen.lab.lesson11.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

//  вот тут меня тревожат ворнинги, я же к ним обращаюсь, даже вот отмечается 1 usage,
//  понятно, что если на паблик поменять, то предупреждения уйдут, но хотелось бы так оставить.
//  это ничего?
    @FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]")
    private WebElement toCheckoutCartButton;

    @FindBy(xpath = "//*[contains(@id, 'email_create')]")
    private WebElement emailField;

    @FindBy(xpath = "//*[contains(@id, 'SubmitCreate')]")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id='id_gender1']")
    private WebElement maleGender;

    @FindBy(xpath = "//*[@id='customer_firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@id='customer_lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id='passwd']")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id='days']")
    private WebElement dayField;

    @FindBy(xpath = "//*[@id='months']")
    private WebElement monthField;

    @FindBy(xpath = "//*[@id='years']")
    private WebElement yearField;

    @FindBy(xpath = "//*[@id='address1']")
    private WebElement addressField;

    @FindBy(xpath = "//*[@id='city']")
    private WebElement cityField;

    @FindBy(xpath = "//*[@id='id_state']")
    private WebElement stateField;

    @FindBy(xpath = "//*[@id='postcode']")
    private WebElement postcodeField;

    @FindBy(xpath = "//*[@id='id_country']")
    private WebElement countryField;

    @FindBy(xpath = "//*[@id='phone_mobile']")
    private WebElement phoneField;

    @FindBy(xpath = "//*[@id='submitAccount']")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id='center_column']/form/p/button")
    private WebElement nextToCheckoutButton;

    @FindBy(xpath = "//*[@id='cgv']")
    private WebElement checkBox;

    @FindBy(xpath = "//*[contains(@name, 'processCarrier')]")
    private WebElement toPaymentButton;

    @FindBy(xpath = "//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")
    private WebElement payButton;

    @FindBy(xpath = "//*[@id='cart_navigation']/button")
    private WebElement confirmButton;

    @FindBy(xpath = "//*[@id='center_column']/h1")
    private WebElement orderCompleteMessage;

    @FindBy(xpath = "//*[@id='product_1_1_0_0']/td[2]/p/a")
    private WebElement fadedTshirtNameInCart;

    @FindBy(xpath = "//*[@id='product_2_7_0_0']/td[2]/p/a")
    private WebElement blouseNameInCart;

    @FindBy(xpath = "//*[@id='total_product_price_1_1_0']")
    private WebElement fadedTshirtTotalPrice;

    @FindBy(xpath = "//*[@id='total_product_price_2_7_0']")
    private WebElement blouseTotalPrice;

    @FindBy(xpath = "//*[@id='total_product']")
    private WebElement totalProductPrice;

    @FindBy(xpath = "//*[@class='address_firstname address_lastname']")
    private WebElement addressFirstNameLastName;

    @FindBy(xpath = "//*[@class='address_address1 address_address2']")
    private WebElement addressAddress;

    @FindBy(xpath = "//*[@class='address_city address_state_name address_postcode']")
    private WebElement addressCityStateZip;

    @FindBy(xpath = "//*[@class='address_country_name']")
    private WebElement addressCountry;

    @FindBy(xpath = "//*[@class='address_phone_mobile']")
    private WebElement addressPhone;



    public void clickToCheckoutCart() {
        toCheckoutCartButton.click();
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void selectMaleGender() {
        maleGender.click();
    }

    public void inputFirstName(String name) {
        firstNameField.sendKeys(name);
    }

    public void inputLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void inputDay(String day) {
        dayField.sendKeys(day);
    }

    public void inputMonth(String month) {
        monthField.sendKeys(month);
    }

    public void inputYear(String year) {
        yearField.sendKeys(year);
    }

    public void inputAddress(String address) {
        addressField.sendKeys(address);
    }

    public void inputCity(String city) {
        cityField.sendKeys(city);
    }

    public void inputState(String state) {
        stateField.sendKeys(state);
    }

    public void inputPostcode(String postcode) {
        postcodeField.sendKeys(postcode);
    }

    public void inputCountry(String country) {
        countryField.sendKeys(country);
    }

    public void inputPhone(String phone) {
        phoneField.sendKeys(phone);
    }


    public void clickNextToCheckout() {
        nextToCheckoutButton.click();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void clickCheckBox() {
        checkBox.click();
    }

    public void clickToPayment() {
        toPaymentButton.click();
    }

    public void clickPayButton() {
        payButton.click();
    }

    public void clickConfirmButton() {
        confirmButton.click();
    }

    public String findOrderCompleteMessage() {
        return orderCompleteMessage.getText();
    }

    public String findFadedTshirtNameInCart() {
        return fadedTshirtNameInCart.getText();
    }

    public String findBlouseNameInCart() {
        return blouseNameInCart.getText();
    }

    public float getFadedTshirtPrice() {
        return Float.parseFloat(fadedTshirtTotalPrice.getText().substring(1));
    }

    public float getBlousePrice() {
        return Float.parseFloat(blouseTotalPrice.getText().substring(1));
    }

    public float getTotalProductPrice() {
        return Float.parseFloat(totalProductPrice.getText().substring(1));
    }

    public String getAddressName() {
        return addressFirstNameLastName.getText();
    }

    public String getAddressAddress() {
        return addressAddress.getText();
    }

    public String getAddressCityStateZip() {
        return addressCityStateZip.getText();
    }

    public String getAddressCountry() {
        return addressCountry.getText();
    }

    public String getAddressPhone() {
       return addressPhone.getText();
    }
}
