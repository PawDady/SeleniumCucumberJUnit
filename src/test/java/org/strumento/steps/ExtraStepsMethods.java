package org.strumento.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.strumento.InitialConditions.PagesVariables;

/**
 * Created by Pawel_D on 2017-02-19.
 */
public class ExtraStepsMethods extends PagesVariables {

    public void webWait(By element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}