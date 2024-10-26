package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorAdv extends BrowserSetup{
    @Test
    public void Testelement() throws InterruptedException {
        browser.get("https://www.google.com/");
       // browser.findElement(By.cssSelector("textarea")).sendKeys("CSS Selector");
        browser.findElement(By.xpath("//textarea")).sendKeys("Hi");
        String text = browser.findElement(By.cssSelector("div[class=\"KxwPGc AghGtd\"] > a")).getText();

        System.out.println("css selector: " + text);
        Thread.sleep(2000);
    }
}
