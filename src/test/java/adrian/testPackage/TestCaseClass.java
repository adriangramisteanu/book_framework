package adrian.testPackage;

import org.testng.annotations.Test;

import adrian.helpers.HelperClass;

public class TestCaseClass extends HelperClass {

    public TestCaseClass() {
    }

    @Test
    public void returnTicket() {
        try {
            System.out.println("in returnTicket");
            driver.get("http://ec2-52-59-249-105.eu-central-1.compute.amazonaws.com/my-movies/");
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}