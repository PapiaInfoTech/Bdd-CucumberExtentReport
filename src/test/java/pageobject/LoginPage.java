package pageobject;

import base.ApplicationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends ApplicationPageBase {
    private WebDriver driver;
    @FindBy(how = How.ID, id = "email")
    private WebElement emailBox;

    @FindBy(how = How.ID, id = "pass")
    private WebElement passwordBox;


    @FindBy(how = How.ID, id = "u_0_2")
    private WebElement submitButton;

    public LoginPage login(String email, String password) throws InterruptedException {

        sendKeys(emailBox, "emailBox", email);
        sendKeys(passwordBox, "passwordBox", password);
        click(submitButton, "submitButton");
        Thread.sleep(2000);
        return new LoginPage();

    }
}
