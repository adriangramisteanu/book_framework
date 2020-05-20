package adrian.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMessages extends PageObjectBase {

    private static final String ALERT_CSS = "[role='alert']";

    @FindBy(css = ALERT_CSS)
    private WebElement alertMessage;


    public NotificationMessages(WebDriver driver) {
        super(driver);
    }

    public String getNotificationMessage() {
        return alertMessage.getText();
    }
}