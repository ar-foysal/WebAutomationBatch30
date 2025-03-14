package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class InteractingWithDropdown extends DriverSetup{
    @Test
    public void testDropdown() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement selectElement = driver.findElement(By.id("dropdown-class-example"));
        selectElement.click();
        Thread.sleep(3000);
        Select select = new Select(selectElement);
        select.selectByValue("option3");
        Thread.sleep(3000);
        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByVisibleText("Option1");
        Thread.sleep(3000);
        System.out.println( "First selected option: " +select.getFirstSelectedOption().getText());
        List<WebElement> options = select.getOptions();
        for (WebElement el: options){
            System.out.println(el.getText());
            System.out.println(el.getAttribute("value"));
        }
    }
}
