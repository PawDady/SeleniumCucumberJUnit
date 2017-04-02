package org.strumento.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.strumento.Scenarios;

/**
 * Created by Pawel_D on 2017-02-18.
 */
public class OutlinesDataSteps extends ExtraStepsMethods {

    WebDriver driver;

    public OutlinesDataSteps(Scenarios scenarios) {
        try {
            driver = scenarios.setUp();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(scenarios.id);
        }
    }

    @Given("^I am on the website \"(.*)\"$")
    public void iAmOnTheWebsite(String url) throws Throwable {
        driver.get(url);
    }

    @Then("^I verify that I can enter first name as (.*)$")
    public void iVerifyThatICanEnterFirstNameAsFirstName(String firstName) throws Throwable {
        driver.findElement(By.id("fn")).sendKeys(firstName);
    }

    @Then("^I verifythat I can enter last nam`e as (.*)$")
    public void iVerifythatICanEnterLastNamEAsLastName(String lastName) throws Throwable {
        webWait(By.xpath("(//input)[4]"), driver);
        driver.findElement(By.xpath("(//input)[4]")).sendKeys(lastName);
    }
}