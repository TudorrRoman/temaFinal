package tests;

import io.cucumber.java.it.Ma;
import org.junit.Test;
import screens.MainPage;

public class MainPageTest extends BaseTest {

    @Test
    public void accessLoginPage() {
        MainPage mainPage = new MainPage();
        mainPage.clickLogButton();
    }

    @Test
    public void clickOnContactPage() {
        MainPage mainPage = new MainPage();
        mainPage.selectContactPage("Contact Us")
                .navigateBack();
    }
}
