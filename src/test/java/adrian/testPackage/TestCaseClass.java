package adrian.testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import adrian.helpers.HelperClass;
import adrian.pages.HeaderMenu;
import adrian.pages.LogInPage;
import adrian.pages.NotificationMessages;

public class TestCaseClass extends HelperClass {

    public TestCaseClass() {
    }

    @Test
    public void loginWithInvalidUser() {

        driver.get("http://ec2-52-59-249-105.eu-central-1.compute.amazonaws.com/my-movies/");
        HeaderMenu menu = new HeaderMenu(driver);
        menu.clickOnLogin();
        LogInPage login = new LogInPage(driver);
        login.typeUserNameOrEmail("Vasilica");
        login.typePassword("Vasilica");
        login.clickLogin();
        NotificationMessages message = new NotificationMessages(driver);
        Assert.assertEquals(message.getNotificationMessage(),
                            "Invalid username or password.",
                            "Confirmation message is not displayed or incorrectly.");
    }
}