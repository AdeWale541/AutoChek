package SignUpPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    public SignUpPage(WebDriver driver) {
            this.driver = driver;
    }
    public WebDriver driver;

    private By Registerbtn = By.id("Register");
    private By Firstname = By.className("firstname");
    private By lastname = By.className("lastname");
    private By email = By.className("email");
    private By numb= By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/form/div[3]/div/input");
    private By pwd = By.className("password");
    private By Regbtn = By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/form/div[6]/button");
    private By logo = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/a/div/img");
    //  Using By as a locator to find login fields


    public void clickRegisterbtn() {
        driver.findElement(Registerbtn).click();
        //Find the login button and click it
    }

    public void enterfirstnme (String VName){
        driver.findElement(Firstname).sendKeys (VName);
        //find the username field and assign a string to the username value
    }

    public void lastnme (String pwa){
        driver.findElement(lastname).sendKeys (pwa);
        //find the password field and assign a string to the password value

    }

    public void mail (String mal){
        driver.findElement(email).sendKeys (mal);

    }

    public void Enternumb (String num){
        driver.findElement(numb).sendKeys (num);

    }

    public void Enterpwd (String psw){
        driver.findElement(pwd).sendKeys (psw);

    }


    public void Clickregbtn (String rgn){
        driver.findElement(Regbtn).sendKeys (rgn);

    }

    public SignUpPage clickLoginButton (){
        driver.findElement(logo).click();
        return new SignUpPage(driver);
        // Find the login button and click it
    }


}
