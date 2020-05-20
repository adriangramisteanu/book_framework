package adrian.backend;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import adrian.utils.BrowserFactory;

public class HelperClass {
    public static WebDriver              driver;
    private final ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal();
    BrowserFactory obj1;

    public HelperClass() {
    }

    public WebDriver getDriver() {
        if (this.threadLocalDriver.get() == null) {
            //LogUtils.errorForThrow(LOG, new NullPointerException("WebDriver is null in the variable threadLocalDriver"));
        }

        return (WebDriver) this.threadLocalDriver.get();
    }

    @BeforeSuite
    public void beforeSuite() {

    }

    @BeforeClass
    public void beforeClass() {
        //System.out.println("in @BeforeClass");
    }

    @BeforeMethod
    public void beforeMethodClass() {
        //System.out.println("in @BeforeMethod");
        HelperClass.driver = BrowserFactory.getDriver();

    }

    @AfterMethod
    public void close() {
        //this.driver.close();
    }

    @AfterClass
    public void afterClass() {

    }

    @AfterSuite
    public void afterSuite() throws IOException, EmailException {

        driver.quit();
    }
}