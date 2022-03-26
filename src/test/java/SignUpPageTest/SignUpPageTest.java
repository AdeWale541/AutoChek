package SignUpPageTest;

import LandingPage.LandingPage;

public class SignUpPageTest extends LandingPage {

    private void clickloginmenu() throws InterruptedException {
        Thread.sleep(2000);
        signUpPage.clickRegisterbtn();
    }

    private void enterfirstname() throws InterruptedException {
        Thread.sleep(2000);
        signUpPage.enterfirstnme("Adewale");
    }

    private void enterlastname() throws InterruptedException {
        Thread.sleep(2000);
        signUpPage.lastnme("Akano");
    }

    private void entermail() throws InterruptedException {
        Thread.sleep(2000);
        signUpPage.mail("Adewale@mailinator.com");
    }

    private void enternum() throws InterruptedException {
        Thread.sleep(2000);
        signUpPage.Enternumb("8126994937");
    }

    private void enterpassword() throws InterruptedException {
        Thread.sleep(2000);
        signUpPage.Enterpwd("Adewale1");
    }






}
