package adrian.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class WaitUtils extends FluentWait<WebDriver> {

    public WaitUtils(WebDriver input) {
        super(input);
    }

    private static Wait<WebDriver> wait(WebDriver driver) {

        Wait<WebDriver> result = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        return result;
    }

    public static void waitForElementToBeDisplayed(final By selector, WebDriver driver) {
        //final WebDriver driver = DriverManager.getDriver();
        WaitUtils.wait(driver).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selector));
    }

}
