package org.strumento.page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Pawel_D on 2016-12-13.
 */
public class AddNewPostPage extends AdminPage {

    public AddNewPostPage(WebDriver driver) {
        super(driver);
    }

    @Test
    public void isPresentedTest() {
        boolean title = driver.getTitle().contains("Add New Post ‹ Szkolenie Automatyzacja — WordPress");
        WebElement addNewPostTitle = driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[4]/h2"));
        WebElement postTitleInput = driver.findElement(By.name("post_title"));
        WebElement textField = driver.findElement(By.xpath("//*[@id=\"wp-content-editor-container\"]/textarea"));
        WebElement addMediaButton = driver.findElement(By.xpath("//*[@id=\"wp-content-media-buttons\"]/a[contains(@title, 'Add Media')]"));
        WebElement publishButton = driver.findElement(By.id("publish"));
        WebElement toolbar = driver.findElement(By.id("ed_toolbar"));

        assertTrue(title);
        assertTrue(addNewPostTitle.isDisplayed());
        assertTrue(postTitleInput.isDisplayed());
        assertTrue(textField.isDisplayed());
        assertTrue(addMediaButton.isDisplayed());
        assertTrue(publishButton.isDisplayed());
        assertTrue(toolbar.isDisplayed());

    }

    public void publishNewPost(String tytul, String text) {
        insertTekst(By.id("title"), tytul);
        click(By.id("content-html"));
        insertTekst(By.id("content"), text);
        webWait(By.id("sample-permalink"));
        webWait(By.id("view-post-btn"));
        webWait(By.id("change-permalinks"));
        webWait(By.id("edit-slug-box"));
        click(By.id("publish"));
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", driver.findElement(By.id("publish")));
        webWait(By.linkText("View post"));
    }
}