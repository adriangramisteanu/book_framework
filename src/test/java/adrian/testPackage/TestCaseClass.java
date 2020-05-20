package adrian.testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import adrian.backend.HelperClass;
import adrian.constants.SystemProperties;
import adrian.pages.HeaderMenu;
import adrian.pages.LogInPage;
import adrian.pages.NotificationMessages;
import adrian.pages.RegisterPage;

public class TestCaseClass extends HelperClass {

    public TestCaseClass() {
    }

    @Test
    public void loginWithInvalidUser() {

        driver.get(SystemProperties.HOME_PAGE);
        HeaderMenu menu = new HeaderMenu(driver);
        menu.clickOnLogin();
        LogInPage login = new LogInPage(driver);
        login.typeUserNameOrEmail(SystemProperties.WRONG_USERNAME);
        login.typePassword(SystemProperties.WRONG_PASSWORD);
        login.clickLogin();
        NotificationMessages message = new NotificationMessages(driver);
        Assert.assertEquals(message.getNotificationMessage(),
                            SystemProperties.ERROR_LOGIN_MESSAGE,
                            "Confirmation message is not displayed or incorrectly.");
    }

    @Test
    public void registerWithValidData() throws InterruptedException {

        driver.get(SystemProperties.HOME_PAGE);
        HeaderMenu menu = new HeaderMenu(driver);
        menu.clickOnRegister();
        RegisterPage register = new RegisterPage(driver);
        register.typeUserName("Andrei");
        register.typePassword("testdata");
        register.retypePassword("testdata");
        Thread.sleep(10000);
        register.clickRegister();
    }
}