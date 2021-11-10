package tests;

import org.junit.Test;
import screens.LoginPage;
import screens.MainPage;

public class LoginPageTest extends BaseTest {

    @Test
    public void loginSuccessfulTest() {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        mainPage.clickLogButton();
        loginPage.enterUsername("tudor.roman.endava@gmail.com")
                .enterPassword("Parola_1")
                .clickLogIn()
                .enterPinNum("1589")
                .clickContinueButton();
    }

    @Test
    public void loginErrorMessage() {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        mainPage.clickLogButton();
        loginPage.enterUsername("tudor.roman.endava@gmail.com")
                .enterPassword("123465")
                .clickLogIn()
                .errorMessage("No match for E-Mail and/or Password.");
    }

}
