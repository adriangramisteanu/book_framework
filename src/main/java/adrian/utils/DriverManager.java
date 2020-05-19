package adrian.utils;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static WebDriver getDriver() {

        return threadLocal.get();
    }

    public static void setDriver(final WebDriver driver) {

        DriverManager.threadLocal.set(driver);
    }
}