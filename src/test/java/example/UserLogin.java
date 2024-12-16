package example;

import org.apache.commons.logging.Log;
import org.example.HomePage;
import org.example.Json;
import org.example.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserLogin extends TestBase{

    @Test
    public void login() throws IOException, InterruptedException {

        HomePage homePage=new HomePage(driver);
        LoginPage login=new LoginPage(driver);

        homePage.handleBrowserAlerts();
        homePage.openSideMenu();
        homePage.clickLogin();
        login.userLogin(new Json().getValue("src/main/resources/data.json", "Email"),new Json().getValue("src/main/resources/data.json", "password"));
        homePage.logout();
        Assert.assertEquals(homePage.logoutMessage(), new Json().getValue("src/main/resources/data.json", "Logout Msg"));
    }

    }
