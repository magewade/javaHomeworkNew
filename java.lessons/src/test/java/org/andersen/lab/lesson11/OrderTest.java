package org.andersen.lab.lesson11;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.andersen.lab.lesson11.order.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
public class OrderTest {

    public static MainPage mainPage;
    public static CartPage cartPage;
    public static WebDriver driver;
    public static AccountPage accountPage;

    public static String email;


    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        cartPage = new CartPage(driver);
        accountPage = new AccountPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfProperties.getProperty("orderpage"));
    }

    @Test
    @Story("Positive, one item")
    @Description("Positive, one item")
    @Step("Making the order with one item and registration")
    public void orderWithOneItem() {
        mainPage.clickDresses();
        mainPage.clickPrintedChiffonDress();
        Assert.assertEquals("Printed Chiffon Dress", mainPage.findPrintedChiffonDress());
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
        Assert.assertEquals("ORDER CONFIRMATION", cartPage.findOrderCompleteMessage());
        //тут пробую подтвердить успешность, находя текст подтверждение ордера
    }

    @Test
    @Story("Positive, multiply items")
    @Description("Positive, multiply items")
    @Step("Making the order with multiply items and registration")
    public void orderWithMultiplyItems() {
        mainPage.clickFadedTshirt(); //в методе попробовала навестись и щелкнуть сразу Add to Cart
        mainPage.clickContinue();
        mainPage.clickBlouse(); //тут также
        mainPage.clickContinue();
        mainPage.clickToCheckout();

        //проверяем что в корзине точно то, что мы выбрали
        Assert.assertEquals("Faded Short Sleeve T-shirts", cartPage.findFadedTshirtNameInCart());
        Assert.assertEquals("Blouse", cartPage.findBlouseNameInCart());

        //проверяем сумму
        Assert.assertEquals(cartPage.getBlousePrice() + cartPage.getFadedTshirtPrice(), cartPage.getTotalProductPrice(), 0.01);

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
    }

    @Test
    @Story("Positive, one item, registration for the next test")
    @Description("Positive, one item, registration for the next test")
    @Step("Making the order with one item and registration for future test")
    public void orderWithOneItemForAuthorisation() {
        //тут попробую зарегестрировать, а в следующем тесте зайти с этого же аккаунта
        mainPage.clickPrintedDress();
        mainPage.clickContinue();
        mainPage.clickToCheckout();
        cartPage.clickToCheckoutCart();
        email = "mail" + RandomStringUtils.randomNumeric(10) + "@gmail.com";
        cartPage.inputEmail(email);
        cartPage.clickSubmitButton();
        cartPage.selectMaleGender();
        cartPage.inputFirstName(ConfProperties.getProperty("firstname3"));
        cartPage.inputLastName(ConfProperties.getProperty("lastname3"));
        cartPage.inputPassword(ConfProperties.getProperty("password3"));
        cartPage.inputDay(ConfProperties.getProperty("day3"));
        cartPage.inputMonth(ConfProperties.getProperty("month3"));
        cartPage.inputYear(ConfProperties.getProperty("year3"));
        cartPage.inputAddress(ConfProperties.getProperty("address3"));
        cartPage.inputCity(ConfProperties.getProperty("city3"));
        cartPage.inputState(ConfProperties.getProperty("state3"));
        cartPage.inputPostcode(ConfProperties.getProperty("zip3"));
        cartPage.inputCountry(ConfProperties.getProperty("country"));
        cartPage.inputPhone(ConfProperties.getProperty("phone3"));
        cartPage.clickRegisterButton();

        //проверяю, чтобы информация совпадала с введенной
        Assert.assertEquals(ConfProperties.getProperty("firstname3") + " " + ConfProperties.getProperty("lastname3"), cartPage.getAddressName());
        Assert.assertEquals(ConfProperties.getProperty("address3"), cartPage.getAddressAddress());
        Assert.assertEquals(ConfProperties.getProperty("city3") + ", " + ConfProperties.getProperty("state3") + " " + ConfProperties.getProperty("zip3"), cartPage.getAddressCityStateZip());
        Assert.assertEquals(ConfProperties.getProperty("country"), cartPage.getAddressCountry());
        Assert.assertEquals(ConfProperties.getProperty("phone3"), cartPage.getAddressPhone());

        cartPage.clickNextToCheckout();
        cartPage.clickCheckBox();
        cartPage.clickToPayment();
        cartPage.clickPayButton();
        cartPage.clickConfirmButton();
        Assert.assertEquals("ORDER CONFIRMATION", cartPage.findOrderCompleteMessage());
    }

    @Test(dependsOnMethods = {"orderWithOneItemForAuthorisation"})
    @Story("Positive, authorisation and password changing")
    @Description("Positive, authorisation and password changing")
    @Step("Authorisation and password changing")
    //этот тест не делается сам по себе без предыдущего, потому что использует его данные из регистрации
    //переписала аннотации с junit на testng соответственно, чтобы dependsOnMethods добавить
    public void authorisationAndPasswordChanging() {
        mainPage.clickLogIn();
        //тут слишком долго у меня грузилось, ждем до появления
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id, 'login_form')]")));
        mainPage.fillEmailRegistered(email);
        mainPage.fillPasswordRegistered(ConfProperties.getProperty("password3"));
        mainPage.submitLoginClick();
        //проверяем, что действительно зашли в аккаунт
        Assert.assertEquals("MY ACCOUNT", accountPage.findMyAccount());
        //заходим в personal information и пробуем поменять пароль
        accountPage.personalInformationClick();
        accountPage.inputOldPassword(ConfProperties.getProperty("password3"));
        accountPage.inputNewPassword(ConfProperties.getProperty("new_password"));
        accountPage.confirmNewPassword(ConfProperties.getProperty("c_new_password"));
        accountPage.clickSave();
        //проверяем, что все получилось
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'alert alert-success')]")));
    }

    @Test
    @Story("Authorisation with wrong data plus screenshot")
    @Description("Authorisation with wrong data plus screenshot")
    @Step("Wrong authorisation")
    public void failedAuthorisationWithScreenshot() {
            mainPage.clickLogIn();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id, 'login_form')]")));
            mainPage.fillEmailRegistered("thisemailiswrong@gmail.com");
            mainPage.fillPasswordRegistered("passwordiswrongtoo");
            mainPage.submitLoginClick();
            saveFailureScreenShot(driver);
            //попробовала скриншот приаттачить, просто так, для интереса
            //хотелось бы, чтобы скринил при падении теста, но что-то я пока не поняла как
            Assert.assertEquals("MY ACCOUNT", accountPage.findMyAccount());
    }

    @AfterMethod
    @Step("LogOut")
    public void signOut() {
        mainPage.clickSignOut();
        mainPage.clickToMainPage();
    }

    // это я нашла при попытках выяснить как делать скрин, потом разберусь что это вообще
//    public void onTestFailure(ITestResult result) {
//        System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
//        System.out.println(result.getMethod().getMethodName() + " failed!");
//
//        ITestContext context = result.getTestContext();
//        WebDriver driver = (WebDriver) context.getAttribute("driver");
//
//        // attach screenshots to report
//        saveFailureScreenShot(driver);
//    }


    @Attachment
    public byte[] saveFailureScreenShot(WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
