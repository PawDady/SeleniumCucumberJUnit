package org.strumento.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Pawel_D on 2016-12-14.
 */
public abstract class AdminPage extends Page {

    public AdminPage(WebDriver driver) {
        super(driver);
    }

    public LogedOutPage logOut() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.id(XPATH_USER));
        action.moveToElement(we).sendKeys("r").build().perform();
        webWait(By.id(ID_LOGOUT));
        driver.findElement(By.linkText(TEXT_LOGOUT)).click();
        return new LogedOutPage(driver);
    }
}