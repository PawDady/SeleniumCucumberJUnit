package org.strumento.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.strumento.Scenarios;

/**
 * Created by Pawel_D on 2017-02-18.
 */
public class OutlinesExampleSteps extends ExtraStepsMethods {

    WebDriver driver;

    public OutlinesExampleSteps(Scenarios scenarios) {
        try {
            driver = scenarios.setUp();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(scenarios.id);
        }
    }

    @Given("^przechodzimy na strone home page of the  (.*)$")
    public void przechodzimyNaStroneHomePageOfTheWebsite(String website) throws Throwable {
        driver.get(website);
    }

    @Then("^znajdziemy tam  (.*)$")
    public void znajdziemyTamWord(String title) throws Throwable {
        assert driver.getTitle().toLowerCase().contains(title);
    }
}