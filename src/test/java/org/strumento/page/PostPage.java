package org.strumento.page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Pawel_D on 2016-12-14.
 */
public class PostPage extends AdminPage {

    public PostPage(WebDriver driver) {
        super(driver);
    }

    public void publishNewComment(String name, String email, String comment) {
        insertTekst(By.id("author"), name);
        insertTekst(By.id("email"), email);
        insertTekst(By.id("comment"), comment);
        click(By.name("submit"));
    }

    @Test
    public void isPresentedTest() {
        boolean title = driver.getTitle().contains("Posts Page");

        assertTrue(title);
    }
}