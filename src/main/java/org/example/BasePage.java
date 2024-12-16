package com.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

public abstract class BasePage {

    public static final long WAIT = 10;
    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }

    protected void waitForVisibility(By by) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected void clickElement(By by) {
        driver.findElement(by).click();
    }

    protected boolean isDisplayed(By by) {
        return driver.findElement(by).isDisplayed();
    }

    protected String getElementText(By by) {
        return driver.findElement(by).getText();
    }

    protected void sendKeys(By by, String e) {
        driver.findElement(by).sendKeys(e);
    }
    protected void selectByIndex(By locator, String value) {
        WebElement dropdownElement = driver.findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(value);
    }
    protected String getAlertText() {
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        return alertText;
    }
    public void scrollDown() {
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.8);
        int scrollEnd = (int) (dimension.getHeight() * 0.4);

        int x = (int) (dimension.getWidth() * 0.5);             // Center of the screen for X-axis

        // Create PointerInput for touch action
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        // Create a sequence of touch actions
        Sequence swipe = new Sequence(finger, 1);

        // Add actions to the sequence
        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, scrollStart)); // Move to start point
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())); // Press down
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(3), PointerInput.Origin.viewport(), x, scrollEnd)); // Move to end point
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg())); // Release

        // Perform the swipe action
        driver.perform(Arrays.asList(swipe));

    }

}
