package LandingPage;

import LogInPage.LogInPage;
import SignUpPage.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;
public class LandingPage {

    public static SignUpPage signUpPage;
    public static LogInPage logInPage;
    //create Page Object


    protected WebDriver driver;
    //create a Webdriver Object


    @BeforeTest

    public void BasePage(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//Importing chromedriver
        driver = new ChromeDriver();
//Instatiating a webdriver object
        driver.manage().window().maximize();
//Maximize the window
        driver.get("https://marketplace.staging.myautochek.com/ng");
//Launch application URL
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//Wait 5 seconds
        signUpPage = new SignUpPage(driver);
        logInPage = new LogInPage(driver);
//Instantiate loginpage and loginhomepage

    }


    @AfterTest

    public void closeBrowser(){
        driver.quit();
        //Close the window and quit the session
    }
}
