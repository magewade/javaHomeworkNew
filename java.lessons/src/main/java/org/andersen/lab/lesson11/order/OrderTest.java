package org.andersen.lab.lesson11.order;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrderTest {
    public static MainPage mainPage;
    public static CartPage cartPage;
    public static WebDriver driver;


    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        cartPage = new CartPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfProperties.getProperty("orderpage"));
    }

    @Test
    public void firstOrder() {
        mainPage.clickDresses();
        mainPage.clickPrintedChiffonDress();
        mainPage.clickAddToCard();
        mainPage.clickToCheckout();
        cartPage.clickToCheckoutCart();
        cartPage.inputEmail("mail" + RandomStringUtils.randomNumeric(10) + "@gmail.com");
        cartPage.clickSubmitButton();
        cartPage.selectMaleGender();
        cartPage.inputFirstName(ConfProperties.getProperty("firstname"));
        cartPage.inputLastName(ConfProperties.getProperty("lastname"));
        cartPage.inputPassword(ConfProperties.getProperty("password"));
        cartPage.inputDay(ConfProperties.getProperty("day"));
        cartPage.inputMonth(ConfProperties.getProperty("month"));
        cartPage.inputYear(ConfProperties.getProperty("year"));
        cartPage.inputAddress(ConfProperties.getProperty("address"));
        cartPage.inputCity(ConfProperties.getProperty("city"));
        cartPage.inputState(ConfProperties.getProperty("state"));
        cartPage.inputPostcode(ConfProperties.getProperty("zip"));
        cartPage.inputCountry(ConfProperties.getProperty("country"));
        cartPage.inputPhone(ConfProperties.getProperty("phone"));
        cartPage.clickRegisterButton();
        cartPage.clickNextToCheckout();
        cartPage.clickCheckBox();
        cartPage.clickToPayment();
        cartPage.clickPayButton();
        cartPage.clickConfirmButton();
        Assert.assertEquals("ORDER CONFIRMATION", cartPage.findOrderCompleteMessage()); //тут пробую подтвердить успешность, находя текст подтверждение ордера
        mainPage.clickSignOut();
        mainPage.clickToMainPage();
    }

    @Test
    public void secondOrder() {
        mainPage.clickFadedTshirt(); //в методе попробовала навестись и щелкнуть сразу Add to Cart
        mainPage.clickContinue();
        mainPage.clickBlouse(); //тут также
        mainPage.clickContinue();
        mainPage.clickToCheckout();
        cartPage.clickToCheckoutCart();
        cartPage.inputEmail("mail" + RandomStringUtils.randomNumeric(10) + "@gmail.com");
        cartPage.clickSubmitButton();
        cartPage.selectMaleGender();
        cartPage.inputFirstName(ConfProperties.getProperty("firstname2"));
        cartPage.inputLastName(ConfProperties.getProperty("lastname2"));
        cartPage.inputPassword(ConfProperties.getProperty("password2"));
        cartPage.inputDay(ConfProperties.getProperty("day2"));
        cartPage.inputMonth(ConfProperties.getProperty("month2"));
        cartPage.inputYear(ConfProperties.getProperty("year2"));
        cartPage.inputAddress(ConfProperties.getProperty("address2"));
        cartPage.inputCity(ConfProperties.getProperty("city2"));
        cartPage.inputState(ConfProperties.getProperty("state2"));
        cartPage.inputPostcode(ConfProperties.getProperty("zip2"));
        cartPage.inputCountry(ConfProperties.getProperty("country"));
        cartPage.inputPhone(ConfProperties.getProperty("phone2"));
        cartPage.clickRegisterButton();
        cartPage.clickNextToCheckout();
        cartPage.clickCheckBox();
        cartPage.clickToPayment();
        cartPage.clickPayButton();
        cartPage.clickConfirmButton();
        Assert.assertEquals("ORDER CONFIRMATION", cartPage.findOrderCompleteMessage());
        mainPage.clickSignOut();
        mainPage.clickToMainPage();
    }


    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
