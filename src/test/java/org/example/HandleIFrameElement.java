package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleIFrameElement extends DriverSetup{
    @Test
    public void testiFrameElement(){
        driver.get("https://testing-and-learning-hub.vercel.app/Selenium/pages/iframe.html");

        WebElement head2 = driver.findElement(By.xpath("//h2[normalize-space()='Learning Objectives']"));
        System.out.println(head2.getText());


//        driver.switchTo().frame("googleIframe");
//        driver.switchTo().frame(0);
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='googleIframe']"));
        driver.switchTo().frame(frame);
        WebElement getStartedBtn = driver.findElement(By.xpath("//a[@href='https://programmablesearchengine.google.com/controlpanel/all']"));
        getStartedBtn.click();
//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        head2 = driver.findElement(By.xpath("//h2[normalize-space()='Learning Objectives']"));
        System.out.println(head2.getText());
    }
}
