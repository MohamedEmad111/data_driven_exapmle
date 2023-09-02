package base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class BaseTests {
    WebDriver driver;
 public    HomePage homePage;
    ReadDataFromJson readDataFromJson;
    @BeforeClass
    public void setup() throws FileNotFoundException {
        driver=new EdgeDriver();
        homePage=new HomePage(driver);
        goHome();
    }
    @BeforeMethod
    public void goHome() throws FileNotFoundException {
        readDataFromJson=new ReadDataFromJson();
        driver.get(readDataFromJson.ReadJsonFile().URL);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
