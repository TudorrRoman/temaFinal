package screens;

import driver.helper.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver = Driver.getInstance();
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "input-email")
    private WebElement enterUsernameField;

    @FindBy(id = "input-password")
    private WebElement enterPasswordField;

    @FindBy(id ="input-pin")
    private WebElement enterPin;

    @FindBy(xpath = "//*[@class = 'btn btn-primary btn-lg hidden-xs']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement continueButt;

    @FindBy(xpath = "//div[@id = 'account-login']/div[2]/div[1]")
    private WebElement checkErrorMessage;


    public LoginPage enterUsername(String username) {
        enterUsernameField.sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        enterPasswordField.sendKeys(password);
        return this;
    }

    public LoginPage clickLogIn() {
        loginButton.click();
        return this;
    }

    public LoginPage enterPinNum(String number) {
        enterPin.sendKeys("1589");
        return this;
    }

    public LoginPage clickContinueButton() {
        continueButt.click();
        return this;
    }

    public LoginPage errorMessage(String message) {
        checkErrorMessage.getText();
        return this;
    }

}
