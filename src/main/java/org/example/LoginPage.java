package org.example;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginPage extends com.pages.BasePage {

    private final By email= By.xpath("//android.view.View[@resource-id='email-login']/android.view.View[2]/android.widget.EditText");
    private final By password= By.xpath("//android.widget.EditText[@resource-id=\"password\"]");

private final By login =By.xpath("//android.widget.Button[@resource-id=\"email-login-button\"]");

    public void userLogin(String mail,String pass){
        waitForVisibility(email);
        sendKeys(email,mail);
        sendKeys(password,pass);
        clickElement(login);
    }

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }
}
