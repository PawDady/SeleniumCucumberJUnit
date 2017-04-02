package org.strumento.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.strumento.Scenarios;

/**
 * Created by Pawel_D on 2017-02-18.
 */
public class ParametersStep extends ExtraStepsMethods {

    WebDriver driver;

    public ParametersStep(Scenarios scenarios) {
        try {
            driver = scenarios.setUp();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(scenarios.id);
        }
    }

    @Given("^kolejny sparametryzowany test home page of the  \"(.*)\"$")
    public void kolejnySparametryzowanyTestHomePageOfThe(String website) throws Throwable {
        driver.get(website);
    }

    @Then("^zawiera tytul \"(.*)\"$")
    public void zawieraTytul(String title) throws Throwable {
        assert driver.getTitle().toLowerCase().contains(title);
        driver.close();
    }

    @Given("^google strona home page of the  \"(.*)\"$")
    public void googleStronaHomePageOfThe(String website) throws Throwable {
        driver.get(website);
    }

    @Then("^zawiera tytul   \"(.*)\"$")
    public void zawieraTytulGoogle(String title) throws Throwable {
        assert driver.getTitle().toLowerCase().contains(title);
    }
}