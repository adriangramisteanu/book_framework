package adrian.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends PageObjectBase {

    private static final String LOGIN_TITLE_PAGE_XPATH      = "//*[@class=\"card-title\"][contains(text(),'Login')]";
    private static final String USERNAME_OR_EMAIL_INPUT_CSS = "[placeholder='Username or Email']";
    private static final String PASSWORD_INPUT_CSS          = "[placeholder='Password']";
    private static final String LOGIN_BUTTON_CLASS          = "btn-primary";

    @FindBy(css = USERNAME_OR_EMAIL_INPUT_CSS)
    private WebElement usernameOrEmailField;

    @FindBy(css = PASSWORD_INPUT_CSS)
    private WebElement passwordField;

    @FindBy(className = LOGIN_BUTTON_CLASS)
    private WebElement loginButton;

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void typeUserNameOrEmail(String email) {
        usernameOrEmailField.click();
        usernameOrEmailField.sendKeys(email);
    }

    public void typePassword(String password) {
        passwordField.click();
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }
}
