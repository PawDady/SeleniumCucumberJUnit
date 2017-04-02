package org.strumento.page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Pawel_D on 2016-12-13.
 */
public class MainPage extends AdminPage implements PageInterface {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Test
    public void isPresentedTest() {
        boolean title = driver.getTitle().contains("Dashboard ‹ Szkolenie Automatyzacja — WordPress");
        WebElement avatar = driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a/img[contains(@class, 'avatar avatar-26 photo')]"));
        WebElement posts = driver.findElement(By.linkText("Posts"));
        WebElement menuPost = driver.findElement(By.id("menu-posts"));
        WebElement buttonCustomizeYourSite = driver.findElement(By.linkText("Customize Your Site"));
        WebElement autocmpleetOff = driver.findElement(By.xpath("//*[@id=\"title\"][contains(@autocomplete, 'off')]"));
        WebElement welcomePanel = driver.findElement(By.className("welcome-panel-close"));

        assertTrue(title);
        assertTrue(avatar.isDisplayed());
        assertTrue(posts.isDisplayed());
        assertTrue(menuPost.isDisplayed());
        assertTrue(buttonCustomizeYourSite.isDisplayed());
        assertTrue(autocmpleetOff.isDisplayed());
        assertTrue(welcomePanel.isDisplayed());
    }

    public AddNewPostPage goToNewPost() {
        click(By.linkText("Posts"));
        click(By.linkText("Add New"));
        return new AddNewPostPage(driver);
    }

    public PostPage MoveToPostPage() {
        click(By.linkText("Posts"));
        return new PostPage(driver);
    }
}