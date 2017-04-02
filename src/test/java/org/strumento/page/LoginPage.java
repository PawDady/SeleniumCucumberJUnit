package org.strumento.page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertTrue;


/**
 * Created by Pawel_D on 2016-12-13.
 */
public class LoginPage extends Page {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MainPage logIn(String login, String password) {
        webWait(By.id("user_login"));
        insertTekst(By.id("user_login"), login);
        insertTekst(By.id("user_pass"), password);
        driver.findElement(By.id("wp-submit")).click();
        return new MainPage(driver);
    }

    @Test
    public void isPresentedTest() {
        boolean title = driver.getTitle().contains("Szkolenie Automatyzacja › Log In");
        WebElement loginInput = driver.findElement(By.id("user_login"));
        WebElement passwordInput = driver.findElement(By.id("user_pass"));
        WebElement checkBoxRemember = driver.findElement(By.cssSelector("#rememberme"));
        WebElement textRemember = driver.findElement(By.id("rememberme"));
        WebElement submitButton = driver.findElement(By.name("wp-submit"));
        WebElement textAutomatyzacja = driver.findElement(By.linkText("Szkolenie Automatyzacja"));

        assertTrue(title);
        assertTrue(loginInput.isDisplayed());
        assertTrue(passwordInput.isDisplayed());
        assertTrue(checkBoxRemember.isDisplayed());
        assertTrue(textRemember.isDisplayed());
        assertTrue(submitButton.isDisplayed());
        assertTrue(textAutomatyzacja.isDisplayed());
    }
}