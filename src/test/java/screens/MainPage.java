package screens;

import driver.helper.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver = Driver.getInstance();

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class = 'btn btn-link navbar-btn']")
    private WebElement selectLoginButton;

    public MainPage clickLogButton() {
        selectLoginButton.click();
        return this;
    }


}
