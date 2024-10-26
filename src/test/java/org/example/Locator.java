package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locator extends BrowserSetup{


    @Test
    public void testElements()throws InterruptedException{
        browser.get("https://www.google.com/");
      // WebElement search_Button=browser.findElement(By.id("APjFqb"));
       // WebElement search_Button=browser.findElement(By.name("q"));
      //  WebElement search_Button=browser.findElement(By.className("gLFyf"));
        //WebElement search_Button=browser.findElement(By.tagName("textarea"));


       //search_Button.sendKeys("Rifat Ibn Alam");
//Thread.sleep(5000);

        //WebElement how_works=browser.findElement(By.linkText("সার্চ কীভাবে কাজ করে"));
       // how_works.click();
        //WebElement country = browser.findElement(By.cssSelector("div[class='uU7dJb']"));
        //System.out.println(country.getText());
        WebElement text_el = browser.findElement(By.xpath("//div[@class='uU7dJb']"));
        System.out.println(text_el.getText());
        Thread.sleep(2000);

    }


}
