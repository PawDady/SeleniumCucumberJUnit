package org.strumento;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.strumento.steps.ExtraStepsMethods;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.fail;

//import cucumber.api.java.Before;

/**
 * Created by Pawel_D on 2017-02-19.
 */
public class Scenarios extends ExtraStepsMethods {

    WebDriver driver = null;

    private StringBuffer verificationErrors = new StringBuffer();
    public String id = "0";

    @Before
    public WebDriver setUp() throws Exception {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        if (driver == null) {
            driver = new ChromeDriver(chromeOptions);
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        String status;
        if(!scenario.isFailed()) {
            status = "( ͡° ͜ʖ ͡°)";
        } else {
            status = "(✖╭╮✖)";
        }
        System.out.println("\n"+status+" End of: " + scenario.getName() + " scenario.");
        driver.close();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
            driver.quit();
            driver = null;
        }
    }
}