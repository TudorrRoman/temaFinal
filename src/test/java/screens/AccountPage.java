package screens;

import driver.helper.Driver;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Waiter;

import java.util.List;

public class AccountPage {

    Waiter wait = new Waiter();
    private WebDriver driver = Driver.getInstance();
    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class = 'btn btn-black navbar-btn']")
    private WebElement clickLogOutButton;

    @FindBy(xpath = "//*[@data-toggle = 'dropdown']")
    private WebElement clickResourcesField;

    @FindBy(xpath = "//ul[@class = 'dropdown-menu']/li")
    private List<WebElement> selectFromDropdownField;


    public AccountPage clickLogout() {
        clickLogOutButton.click();
        return this;
    }
//new
    public AccountPage clickResources() {
        clickResourcesField.click();
        return this;
    }

    public AccountPage selectFromDropdown(String selectDropdown) {
//        wait.waitForElementsToBeVisible(selectFromDropdownField);
        selectFromDropdownField.forEach(webElement -> {
            if(webElement.getText().equals(selectDropdown)) {
            String elementName = webElement.getText().toUpperCase();
                System.out.println(elementName);
                //                webElement.click();
            }
        });
        return this;
    }

    public AccountPage checkPageTitle(String name) {
        Assert.assertEquals(name, driver.getTitle());
        return new AccountPage();
    }

}
