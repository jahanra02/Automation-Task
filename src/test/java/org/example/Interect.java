package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Interect extends BrowserSetup{
    @Test
    public void testelement() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement radio_button01= browser.findElement(By.cssSelector("input[value='radio1']"));


        System.out.println(radio_button01.isSelected());
        radio_button01.click();

        WebElement radio_button02= browser.findElement(By.cssSelector("input[value='radio2']"));
        System.out.println(radio_button01.isSelected());
        System.out.println(radio_button02.isSelected());
        WebElement displayed_box= browser.findElement(By.xpath("//input[@id='displayed-text']"));
        System.out.println(displayed_box.isDisplayed());
        browser.findElement(By.xpath("//input[@id='hide-textbox']")).click();

        System.out.println(displayed_box.isDisplayed());

        Thread.sleep(3000);

    }
}
