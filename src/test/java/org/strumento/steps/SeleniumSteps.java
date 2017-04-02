package org.strumento.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.strumento.Scenarios;

/**
 * Created by Pawel_D on 2017-02-18.
 */
public class SeleniumSteps extends ExtraStepsMethods {

    WebDriver driver;

    public SeleniumSteps(Scenarios scenarios) {
        try {
            driver = scenarios.setUp();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(scenarios.id);
        }
    }

    @Given("^User is on www.softpost.org$")
    public void userIsOnWwwWebsite() throws Throwable {
        System.out.println("Wywołuje given dla website ");
        driver.get("http://www.softpost.org");
        assert driver.getTitle().toLowerCase().contains("tutorials");
    }

    @When("^User cliks Contact us$")
    public void userCliksContactUs() throws Throwable {
        System.out.println("Wywołuje when dla contact us");
        assert driver.getTitle().toLowerCase().contains("tutorials");
        driver.findElement(By.id("menu-item-8")).click();
    }

    @Then("^user is redirected to contact website$")
    public void userIsRedirectedToContactWebsite() throws Throwable {
        System.out.println("Wywołuje then dla contact us");
        webWait(By.className("entry-header"), driver);
        assert driver.getTitle().toLowerCase().contains("contact");
    }

    @Given("^User is on www.onet.pl$")
    public void userIsOnWwwOnetWebsite() throws Throwable {
        System.out.println("Wywołuje given dla website ");
        driver.get("http://www.Onet.pl");
        assert driver.getTitle().toLowerCase().contains("onet.pl");
    }

    @When("^User cliks shoping$")
    public void userCliksShoping() throws Throwable {
        System.out.println("Wywołuje when dla onet i shopping");
        assert driver.getTitle().toLowerCase().contains("onet.pl");
        driver.findElement(By.className("ico2")).click();
    }

    @Then("^user is redirected to shoping website$")
    public void userIsRedirectedToShopingWebsite() throws Throwable {
        System.out.println("Wywołuje then dla onet i redirect to shopping");
        assert driver.getTitle().toLowerCase().contains("skąpiec");
    }

    @When("^User cliks poczta$")
    public void userCliksPoczta() throws Throwable {
        System.out.println("Wywołuje when dla onet i email");
        assert driver.getTitle().toLowerCase().contains("onet.pl");
        driver.findElement(By.id("mailCounter")).click();
    }

    @Then("^user is redirected to email website$")
    public void userIsRedirectedToEmailWebsite() throws Throwable {
        System.out.println("Wywołuje then dla onet i redirect to shopping");
        assert driver.findElement(By.id("k_mainBar")).getText().contains("poczta");
    }
}