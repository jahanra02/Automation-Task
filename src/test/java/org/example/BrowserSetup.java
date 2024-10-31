package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BrowserSetup {

    WebDriver browser;
    @BeforeSuite

    public WebDriver openBrowser() {
        browser=new EdgeDriver();
        browser.manage().window().maximize();
        return browser;
    }
    @AfterSuite
    public void closeBrowser(){
        browser.quit();
    }
    public WebElement getElement(By locator){
        return browser.findElement(locator);
    }


}
