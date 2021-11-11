package screens;

import driver.helper.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    private WebDriver driver = Driver.getInstance();

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class = 'btn btn-link navbar-btn']")
    private WebElement selectLoginButton;

    @FindBy(xpath = "//ul[@class = 'list-unstyled']/li")
    private List<WebElement> clickContactPage;

    public MainPage clickLogButton() {
        selectLoginButton.click();
        return this;
    }

    public MainPage selectContactPage(String contact) {
        clickContactPage.forEach(webElement -> {
            if(webElement.getText().equalsIgnoreCase(contact)) {
                String elementName = webElement.getText().toUpperCase();
                System.out.println(elementName);
                webElement.click();
            }
        });
        return this;
    }

    public MainPage navigateBack() {
        driver.navigate().back();
        return new MainPage();
    }

}
