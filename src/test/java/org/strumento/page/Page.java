package org.strumento.page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.strumento.InitialConditions.PagesVariables;

import java.util.UUID;

/**
 * Created by Pawel_D on 2016-12-13.
 */
public class Page extends PagesVariables implements PageInterface {
    WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public void insertTekst(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public PostPage click(By by) {
        driver.findElement(by).click();
        return null;
    }

    public void webWait(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void webWaitByTime(Long time) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void open(String baseUrl) {
        driver.get(baseUrl);
    }

    public UUID randomTitle() {
        UUID temp = UUID.randomUUID();
        return temp;
    }

    @Test
    public void isPresentedTest() {
    }
}