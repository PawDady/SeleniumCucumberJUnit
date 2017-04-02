package org.strumento.page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Pawel_D on 2016-12-13.
 */
public class HomePage extends AdminPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean iSPostPublishPost(String tytul) {
        return driver.getPageSource().contains(tytul);
    }

    public boolean isNewCommentPublished(String comment) {

        return driver.getPageSource().contains(comment);
    }

    public PostPage moveToNewPost(String tytul) {
        driver.getPageSource().contains(tytul);
        click(By.linkText(tytul));
        return new PostPage(driver);
    }

    @Test
    public void isPresentedTest() {
        boolean title = driver.getTitle().contains("streser.Admin - Szkolenia");

        assertTrue(title);
    }
}