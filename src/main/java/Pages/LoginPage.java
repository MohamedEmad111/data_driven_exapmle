package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By Email=By.id("Email");
    private By password=By.id("Password");
    private By LoginButton=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");

    public void insertEmail(String user){
        SendKeys(Email,user);
    }
    public void insertPassword(String pass){
        SendKeys(password,pass);
    }
    public void clickOnLoginButton(){
        click(LoginButton);
    }

}
