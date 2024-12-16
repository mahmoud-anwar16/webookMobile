package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class HomePage extends com.pages.BasePage {
    public HomePage(AppiumDriver driver) {
        super(driver);
    }
    private final By sideMenu= By.xpath("//android.widget.Button[@text=\"Open Mobile Menu\"]");

    private final By loginBtn= By.xpath("//*[@text='Log In / Sign Up']");
    private final By logout =By.xpath("//*[@text='Logout']");
    private final By block = By.id("com.android.chrome:id/negative_button");
    private final By logoutMsg = By.xpath( "//*[@text=\"Are you sure you want to logout?\"]");
    private final By language= By.xpath("//android.view.MenuItem[@text=\"SAR\"]");
    private final By arabic =By.xpath("//android.view.View[@text=\"العربية\"]");
    private final By english=By.id("locale_en");
    private final By confirmBtn=By.xpath("//*[@text='Confirm']");
    private final By homePageTitle =By.xpath("//android.widget.TextView[@text=\"احجز أفضل الفعاليات والتجارب والمسرحيات\"]");
    private final By openUserProfile=By.xpath("//*[@text='mahmoudbm100@gmail.com']");



    public void openSideMenu(){
          waitForVisibility(sideMenu);
        clickElement(sideMenu);
    }
    public void clickLogin(){
        waitForVisibility(loginBtn);
        clickElement(loginBtn);
    }

    public void handleBrowserAlerts() {
        driver.context("NATIVE_APP");
        clickElement(block);
        try {
            WebDriverWait wait = new WebDriverWait(driver,WAIT);
            WebElement rejectCookiesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text=\"Reject\"]")));
            rejectCookiesButton.click();
        } catch (TimeoutException e) {
            System.out.println("No cookie alert displayed.");
        }
}
    public void logout(){
        clickElement(sideMenu);
        waitForVisibility(logout);
        clickElement(logout);
    }
    public String logoutMessage(){
        waitForVisibility(logoutMsg);
        return getElementText(logoutMsg);
    }

    public void openLanguage(){
        clickElement(language);
    }

    public void changeAr(){
        waitForVisibility(arabic);
        clickElement(arabic);
    }
    public void changeEn(){
        clickElement(english);
    }

    public String homeMsg(){
        waitForVisibility(homePageTitle);
        return getElementText(homePageTitle);
    }

public void clickConfirm(){
        waitForVisibility(confirmBtn);
        clickElement(confirmBtn);
}

public void clickProfile(){

    waitForVisibility(sideMenu);
    clickElement(sideMenu);
        waitForVisibility(openUserProfile);
        clickElement(openUserProfile);
}




}
