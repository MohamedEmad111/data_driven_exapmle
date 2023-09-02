package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver){
        super(driver);
    }
    private By loginButton=By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a");
    public LoginPage clickOnloginButton(){
        click(loginButton);
        return new LoginPage(driver);
    }
}
