package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Interect extends BrowserSetup{


    @Test
    public void testelement() throws  InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement radio_button01= getElement(By.cssSelector("input[value='radio1']"));


        Assert.assertFalse(radio_button01.isSelected());
        radio_button01.click();

        WebElement radio_button02= getElement(By.cssSelector("input[value='radio2']"));
        Assert.assertTrue(radio_button01.isSelected());
        Assert.assertFalse(radio_button02.isSelected());
        WebElement displayed_box= getElement(By.xpath("//input[@id='displayed-text']"));
        System.out.println(displayed_box.isDisplayed());
        getElement(By.xpath("//input[@id='hide-textbox']")).click();

        System.out.println(displayed_box.isDisplayed());

        WebElement dropdown_text =  getElement(By.xpath("//select[@id='dropdown-class-example']"));
        System.out.println(dropdown_text.getText());
        WebElement name =  getElement(By.xpath("//input[@id='name']"));
        name.sendKeys("Utah");
        Assert.assertEquals(name.getAttribute("value"),"Utah");
        Thread.sleep(3000);
        String placeholder= name.getAttribute("placeholder");
        Assert.assertEquals(placeholder,"Enter Your Name");
        name.clear();
    }
}