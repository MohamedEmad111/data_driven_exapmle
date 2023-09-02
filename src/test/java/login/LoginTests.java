package login;

import Pages.LoginPage;
import base.BaseTests;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reader.ReadDataDrivenFromJson;
import reader.ReadDataFromJson;

import java.io.IOException;

public class LoginTests extends BaseTests {
    ReadDataFromJson readDataFromJson;
    ReadDataDrivenFromJson readDataDrivenFromJson;

    @DataProvider
    public Object[] testDataforSucessdulLogin() throws IOException, ParseException {
        readDataDrivenFromJson = new ReadDataDrivenFromJson();
        return readDataDrivenFromJson.testDataForSucessfulLogin();
    }

    @Test(dataProvider = "testDataforSucessdulLogin")
    public void sucesslogin(String data) {
        String users[] = data.split(",");
        LoginPage loginPage = homePage.clickOnloginButton();
        loginPage.insertEmail(users[0]);
        loginPage.insertPassword(users[1]);
        loginPage.clickOnLoginButton();
    }
}
