package org.strumento.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.strumento.Scenarios;

/**
 * Created by Pawel_D on 2017-02-18.
 */
public class ATMspecsSteps extends ExtraStepsMethods {

    WebDriver driver;

    public ATMspecsSteps(Scenarios scenarios) {
        try {
            driver = scenarios.setUp();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(scenarios.id);
        }
    }

    @Given("^I insert the ATM card in the ATM machine$")
    public void iInsertTheATMCardInTheATMMachine() throws Throwable {
    }

    @And("^I am asked to enter the PIN$")
    public void iAmAskedToEnterThePIN() throws Throwable {
    }

    @When("^I enter the correct PIN$")
    public void iEnterTheCorrectPIN() throws Throwable {
    }

    @Then("^I should be able to see option to withdraw money$")
    public void iShouldBeAbleToSeeOptionToWithdrawMoney() throws Throwable {
    }

    @Then("^I withdraw money$")
    public void iWithdrawMoney() throws Throwable {
    }

    @When("^I enter the wrong PIN$")
    public void iEnterTheWrongPIN() throws Throwable {
    }

    @Then("^I should not be able to see option to withdraw money$")
    public void iShouldNotBeAbleToSeeOptionToWithdrawMoney() throws Throwable {
    }
}