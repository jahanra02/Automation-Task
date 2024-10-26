package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class New extends BrowserSetup{
    @BeforeClass
    public void loadGogglePage(){
        browser.get("https://www.google.com/");
    }

    @Test

        public void testPageTitle() {


        browser.get("https://www.google.com/");
        String page_title = browser.getTitle();
        Assert.assertEquals(page_title, "Google");

    }
    @Test
        public void testPageURL(){


            browser.get("https://www.google.com/");

            Assert.assertEquals(browser.getCurrentUrl(),"https://www.google.com/");

    }


}
