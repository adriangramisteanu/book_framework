package adrian.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import adrian.utils.WaitUtils;

public class RegisterPage extends PageObjectBase {

    private static final String REGISTER_TITLE_PAGE_XPATH   = "//*[@class=\"card-title\"][contains(text(),'Register')]";
    private static final String USERNAME_INPUT_CSS          = "[placeholder='Username']";
    private static final String PASSWORD_INPUT_CSS          = "[placeholder='Password']";
    private static final String RETYPE_PASSWORD_INPUT_CSS   = "[placeholder='Retype password']";
    private static final String EMAIL_ADDRESS_CSS           = "[placeholder='Email Addres']";
    private static final String CREATE_ACCOUNT_BUTTON_CLASS = "btn-primary";
    private static final String READ_AND_AGREED_CLASS       = "custom-control-label";

    @FindBy(css = USERNAME_INPUT_CSS)
    private WebElement usernameField;

    @FindBy(css = PASSWORD_INPUT_CSS)
    private WebElement passwordField;

    @FindBy(css = RETYPE_PASSWORD_INPUT_CSS)
    private WebElement retypePasswordField;

    @FindBy(css = EMAIL_ADDRESS_CSS)
    private WebElement emailAddressesField;

    @FindBy(className = CREATE_ACCOUNT_BUTTON_CLASS)
    private WebElement createAccountBtn;

    @FindBy(className = READ_AND_AGREED_CLASS)
    private WebElement readAndAgreedCheckbox;

    public RegisterPage(WebDriver driver) {
        super(driver);
        WaitUtils.waitForElementToBeDisplayed(By.xpath(REGISTER_TITLE_PAGE_XPATH), driver);
    }

    public void typeUserName(String username) {
        usernameField.click();
        usernameField.sendKeys(username);
    }

    public void typePassword(String password) {
        passwordField.click();
        passwordField.sendKeys(password);
    }

    public void retypePassword(String password) {
        retypePasswordField.click();
        retypePasswordField.sendKeys(password);
    }

    public void clickRegister() {
        createAccountBtn.click();
    }
}
