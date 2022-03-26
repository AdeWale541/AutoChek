package LandingPageTest;

import LandingPage.LandingPage;
import org.testng.annotations.Test;

public class LandingPageTest extends LandingPage {
    @Test(priority = 1)
    public void TestBasePage() throws InterruptedException {
        String pageTitle = "Autochek: Buy & Sell Cars in Nigeria | Find New & Old Cars";

        Thread.sleep(4000);

        if (driver.getTitle().contains(pageTitle)) {
            System.out.println("The page title is " + pageTitle);
        } else {
            System.out.println("The page title is incorrect. Actual page title is " + driver.getTitle());
        }
    }

}
