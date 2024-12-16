package example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestBase {

    public static AppiumDriver driver;

   @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability( "chromedriverExecutable","/Users/admin/Downloads/chromedriver_mac64/chromedriver");
        caps.setCapability("appium:uiautomator2ServerLaunchTimeout", 60000);

       driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);

        driver.get("https://webook.com/en");

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
