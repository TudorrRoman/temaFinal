package tests;

import org.junit.Test;
import screens.AccountPage;
import screens.LoginPage;
import screens.MainPage;

public class AccountPageTest extends BaseTest {

    @Test
    public void logoutTest() {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        AccountPage accPage = new AccountPage();
        mainPage.clickLogButton();
        loginPage.enterUsername("tudor.roman.endava@gmail.com")
                .enterPassword("Parola_1")
                .clickLogIn()
                .enterPinNum("1589")
                .clickContinueButton();
        accPage.clickLogout();
    }

    @Test
    public void selectFromDropdown() {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        AccountPage accPage = new AccountPage();
        mainPage.clickLogButton();
        loginPage.enterUsername("tudor.roman.endava@gmail.com")
                .enterPassword("Parola_1")
                .clickLogIn()
                .enterPinNum("1589")
                .clickContinueButton();
        accPage.clickResources()
                .selectFromDropdown("OPENCART DOCUMENTATION");
    }
}
