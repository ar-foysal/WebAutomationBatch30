package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup{
    @Test
    public void testWebElementState() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement radioButtonExample = driver.findElement(By.xpath("//legend[normalize-space()='Radio Button Example']"));
        String text = radioButtonExample.getText();
        System.out.println(text);
        System.out.println(radioButtonExample.isDisplayed());

        WebElement autoCompleteInputBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        autoCompleteInputBox.sendKeys("Bangladesh");
        Thread.sleep(1000);
        autoCompleteInputBox.clear();
        Thread.sleep(1000);

        WebElement radioBtn1 = driver.findElement(By.xpath("//input[@value='radio1']"));
        System.out.println("radio button 1 before: "+ radioBtn1.isSelected());
        radioBtn1.click();
        Thread.sleep(3000);

        System.out.println("radio button 1: after"+ radioBtn1.isSelected());

        WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
        String placeHolderText = inputName.getAttribute("placeholder");
        System.out.println(placeHolderText);

        WebElement homeBtn = driver.findElement(By.xpath("//button[normalize-space()='Home']"));
        String cssValue =  homeBtn.getCssValue("background-color");
        System.out.println(cssValue);
        System.out.println(radioBtn1.isEnabled());
    }
}
