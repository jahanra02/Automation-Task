package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class Browsermanager extends BrowserSetup {
    @Test
    public void testBrowser() throws InterruptedException {


        browser.get("https://www.google.com");

        Thread.sleep(2000);
        browser.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        browser.navigate().back();
        Thread.sleep(2000);
        browser.navigate().forward();
        Thread.sleep(2000);
        browser.navigate().refresh();
        Thread.sleep(2000);
        browser.manage().window().minimize();

        Thread.sleep(2000);

        browser.manage().window().maximize();

        Thread.sleep(2000);

        browser.manage().window().fullscreen();

        Thread.sleep(2000);
        browser.switchTo().newWindow(WindowType.TAB);
        browser.get("http://www.google.com");
        System.out.println(browser.getTitle());
        System.out.println(browser.getCurrentUrl());
        Thread.sleep(2000);
        browser.close();



    }
}