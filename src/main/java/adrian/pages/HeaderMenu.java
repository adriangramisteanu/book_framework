package adrian.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderMenu extends PageObjectBase {

    private static final String LOGIN_BUTTON_XPATH    = "//a[contains(text(),'Login')]";
    private static final String REGISTER_BUTTON_XPATH = "//a[contains(text(),'Register')]";
    private static final String MOVIES_BUTTON_XPATH   = "//a[contains(text(),'Movies')]";
    private static final String ABOUT_BUTTON_XPATH    = "//a[contains(text(),'About')]";

    @FindBy(xpath = LOGIN_BUTTON_XPATH)
    private WebElement loginButton;

    @FindBy(xpath = REGISTER_BUTTON_XPATH)
    private WebElement registerButton;

    @FindBy(xpath = ABOUT_BUTTON_XPATH)
    private WebElement aboutButton;

    @FindBy(xpath = MOVIES_BUTTON_XPATH)
    private WebElement moviesButton;

    public HeaderMenu(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegister() {
        registerButton.click();
    }

    public void clickOnLogin() {
        loginButton.click();
    }

    public void clickOnAbout() {
        aboutButton.click();
    }

    public void clickOnMovies() {
        moviesButton.click();
    }
}
