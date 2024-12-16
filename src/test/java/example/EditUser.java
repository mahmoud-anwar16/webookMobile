package example;

import org.example.HomePage;
import org.example.Json;
import org.example.LoginPage;
import org.example.UserProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class EditUser extends TestBase{
    @Test
    public void changeLanguage() throws IOException {

        HomePage homePage=new HomePage(driver);
        LoginPage login=new LoginPage(driver);
        UserProfile profile=new UserProfile(driver);


        homePage.handleBrowserAlerts();
        homePage.openSideMenu();
        homePage.clickLogin();
        login.userLogin(new Json().getValue("src/main/resources/data.json", "Email"),new Json().getValue("src/main/resources/data.json", "password"));
        homePage.clickProfile();
        profile.clickEdit();
        profile.editName(new Json().getValue("src/main/resources/data.json", "UpdateName"));
        Assert.assertEquals(profile.updatedName(),new Json().getValue("src/main/resources/data.json", "profileName"));



    }


}
