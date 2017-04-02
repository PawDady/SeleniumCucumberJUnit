package org.strumento.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.strumento.Scenarios;
import org.strumento.page.*;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Pawel_D on 2017-02-19.
 */
public class PostsSteps extends ExtraStepsMethods {

    public PostsSteps(Scenarios scenarios) {
        try {
            driver = scenarios.setUp();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(scenarios.id);
        }
    }

    WebDriver driver;
    LoginPage loginPage;
    MainPage mainPage;
    AddNewPostPage addNewPostPage;
    LogedOutPage logedOutPage;
    HomePage homePage;
    PostPage postPage;

    @Given("^User is on Admin webside$")
    public void userIsOnAdminWebside() throws Throwable {
        loginPage = new LoginPage(driver);
        loginPage.open(getAdresAdmin());
        loginPage.isPresentedTest();
    }

    @When("^User logins to main website$")
    public void userLoginsToMainWebsite() throws Throwable {
        mainPage = loginPage.logIn(getLOGIN(), getPASSWORD());
    }

    @Then("^User is logedin on website$")
    public void userIsLogedOnWebsite() throws Throwable {
        mainPage.isPresentedTest();
    }

    @When("^User goes to write post site$")
    public void userGoesToWritePostSite() throws Throwable {
        addNewPostPage = mainPage.goToNewPost();
    }

    @Then("^User is on Posts site$")
    public void userIsOnPostsSite() throws Throwable {
        addNewPostPage.isPresentedTest();
    }

    @When("^User writes and sends post$")
    public void userWritesAndSendsPost() throws Throwable {
        addNewPostPage.publishNewPost(getPost().toString(), "text");
    }

    @Then("^User logedouts from admin website$")
    public void userLogedoutsFromAdminWebsite() throws Throwable {
        logedOutPage = addNewPostPage.logOut();
        logedOutPage.isPresentedTest();
    }

    @When("^User go to home website$")
    public void userGoToHomeWebsite() throws Throwable {
        homePage = new HomePage(driver);
        homePage.open(getADRES());
        homePage.isPresentedTest();
    }

    @Then("^User sees writen posts$")
    public void userSeesWritenPosts() throws Throwable {
        assertTrue(homePage.iSPostPublishPost(getPost().toString()));
    }

    @Given("^User is on home page$")
    public void userIOnHomePage() throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.open(getADRES());
        homePage.isPresentedTest();
    }

    @When("^User goes to posts$")
    public void userGoesToPosts() throws Throwable {
        postPage = homePage.moveToNewPost(getHardCommend());
        postPage.isPresentedTest();
    }

    @Then("^User sees posts$")
    public void userSeesPosts() throws Throwable {
        assertTrue(homePage.iSPostPublishPost(getPost().toString()));
    }

    @When("^User writes comment to post$")
    public void userWritesCommentToPost() throws Throwable {
        postPage.publishNewComment(getComment().toString(), getEMAIL(), getComment().toString());
    }

    @Then("^User sees writen comment$")
    public void userSeesWritenComment() throws Throwable {
        assertTrue(homePage.isNewCommentPublished(getComment().toString()));
    }
}