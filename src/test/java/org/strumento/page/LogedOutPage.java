package org.strumento.page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Pawel_D on 2017-02-19.
 */
public class LogedOutPage extends Page {

    public LogedOutPage(WebDriver driver) {
        super(driver);
    }

    @Test
    public void isPresentedTest() {
        boolean title = driver.getTitle().contains("Szkolenie Automatyzacja › Log In");
        boolean loggedOut = driver.findElement(By.className("message")).getText().contains("You are now logged out.");
        WebElement loginInput = driver.findElement(By.id("user_login"));
        WebElement passwordInput = driver.findElement(By.id("user_pass"));
        WebElement checkBoxRemember = driver.findElement(By.cssSelector("#rememberme"));
        WebElement textRemember = driver.findElement(By.id("rememberme"));
        WebElement submitButton = driver.findElement(By.name("wp-submit"));
        WebElement textAutomatyzacja = driver.findElement(By.linkText("Szkolenie Automatyzacja"));

        assertTrue(title);
        assertTrue(loggedOut);
        assertTrue(loginInput.isDisplayed());
        assertTrue(passwordInput.isDisplayed());
        assertTrue(checkBoxRemember.isDisplayed());
        assertTrue(textRemember.isDisplayed());
        assertTrue(submitButton.isDisplayed());
        assertTrue(textAutomatyzacja.isDisplayed());
    }
}