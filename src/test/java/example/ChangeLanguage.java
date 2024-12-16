package example;

import org.example.HomePage;
import org.example.Json;
import org.example.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ChangeLanguage extends UserLogin{

    @Test
    public void changeLanguage() throws IOException {

        HomePage homePage=new HomePage(driver);


        homePage.handleBrowserAlerts();
        homePage.openLanguage();
        homePage.changeAr();
        homePage.clickConfirm();
        Assert.assertEquals(homePage.homeMsg(), new Json().getValue("src/main/resources/data.json", "HomeTitle"));



    }
}
