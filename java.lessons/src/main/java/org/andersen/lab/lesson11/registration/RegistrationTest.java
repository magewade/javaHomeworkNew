package org.andersen.lab.lesson11.registration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class RegistrationTest {
    public static RegistrationPage registrationPage;
    public static WebDriver driver;


    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        registrationPage = new RegistrationPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfProperties.getProperty("registrationpage"));
    }


    @Test
    public void registrationTestSuccess() {
        registrationPage.inputName(ConfProperties.getProperty("firstname"));
        registrationPage.inputSecondName(ConfProperties.getProperty("lastname"));
        registrationPage.clickMartialStatusSingle();
        registrationPage.clickHobbyReading();
        registrationPage.inputPhone(ConfProperties.getProperty("phone"));
        registrationPage.inputUsername(ConfProperties.getProperty("username"));
        registrationPage.inputEmail("mail" + RandomStringUtils.randomNumeric(10) + "@gmail.com");
        registrationPage.inputPassword(ConfProperties.getProperty("password"));
        registrationPage.inputConfirmPassword(ConfProperties.getProperty("c_password"));
        registrationPage.clickSubmitButton();

    }

    @Test
    public void registrationTestFailed() {
        registrationPage.inputName(ConfProperties.getProperty("firstname"));
        registrationPage.inputSecondName(ConfProperties.getProperty("lastname"));
        registrationPage.clickMartialStatusSingle();
        registrationPage.clickHobbyReading();
//        registrationPage.inputPhone(ConfProperties.getProperty("phone")); //не указываем телефон
        registrationPage.inputUsername(ConfProperties.getProperty("username"));
        registrationPage.inputEmail("mail" + RandomStringUtils.randomNumeric(10) + "@gmail.com");
        registrationPage.inputPassword(ConfProperties.getProperty("password"));
        registrationPage.inputConfirmPassword(ConfProperties.getProperty("c_password"));
        registrationPage.clickSubmitButton();
        registrationPage.getErrorMessage(); //ищем ошибку
        }


    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}