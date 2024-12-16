package org.example;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class UserProfile extends com.pages.BasePage {

    private final By editName = By.xpath("(//android.widget.Button[@text=\"Edit\"])[2]");

    private final By firstName=By.xpath("//android.widget.EditText[@resource-id=\"first_name\"]");
    private final By save =By.xpath("//android.widget.Button[@text=\"Save Changes\"]");

    private final By profileName =By.xpath("//*[contains(@text, 'anwar')]");



    public void clickEdit(){
        waitForVisibility(editName);
        clickElement(editName);
    }

    public void editName(String a){
        waitForVisibility(firstName);
        sendKeys(firstName, a);
        scrollDown();
        waitForVisibility(save);
        clickElement(save);
    }




    public String updatedName(){
        waitForVisibility(profileName);
        return getElementText(profileName);
    }



    public UserProfile(AppiumDriver driver) {
        super(driver);
    }
}
