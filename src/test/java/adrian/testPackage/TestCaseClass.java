package adrian.testPackage;

import org.testng.annotations.Test;

import adrian.helpers.HelperClass;
import adrian.pages.HeaderMenu;

public class TestCaseClass extends HelperClass {

    public TestCaseClass() {
    }

    @Test
    public void returnTicket() {
        try {
            driver.get("http://ec2-52-59-249-105.eu-central-1.compute.amazonaws.com/my-movies/");
            HeaderMenu menu = new HeaderMenu(driver);
            menu.clickOnLogin();
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}