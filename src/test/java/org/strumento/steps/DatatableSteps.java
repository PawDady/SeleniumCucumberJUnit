package org.strumento.steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.strumento.Scenarios;

import java.util.Map;

/**
 * Created by Pawel_D on 2017-02-18.
 */
public class DatatableSteps extends ExtraStepsMethods {

    WebDriver driver;

    public DatatableSteps(Scenarios scenarios) {
        try {
            driver = scenarios.setUp();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(scenarios.id);
        }
    }

    @Given("^website title as tutorial home page of the$")
    public void websiteTitleAsTutorialHomePageOfThe(Map<String, String> dataMap) throws Throwable {
        String website = dataMap.get("website");
        String title = dataMap.get("title");
        System.out.println(dataMap.get("user"));
        driver.get(website);
        assert driver.getTitle().toLowerCase().contains(title);
    }

    @Given("^website title as google home page of the$")
    public void websiteTitleAsGoogleHomePageOfThe(Map<String, String> dataMap) throws Throwable {
        String website = dataMap.get("website");
        String title = dataMap.get("title");
        driver.get(website);
        assert driver.getTitle().toLowerCase().contains(title);
    }
}