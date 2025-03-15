package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DiffWait extends DriverSetup{
    @Test
    public void testDelayElement() throws InterruptedException {
        driver.get("https://testing-and-learning-hub.vercel.app/Selenium/pages/slow_resources_page.html");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//        Thread.sleep(15000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement successMsg = driver.findElement(By.xpath("//p[normalize-space()='Success: The slow request has completed.']"));
        Assert.assertTrue(successMsg.isDisplayed());
        Assert.assertEquals(successMsg.getText(), "Success: The slow request has completed.");

        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//        Thread.sleep(15000);
        successMsg = driver.findElement(By.xpath("//p[normalize-space()='Success: The slow request has completed.']"));
        Assert.assertTrue(successMsg.isDisplayed());
        Assert.assertEquals(successMsg.getText(), "Success: The slow request has completed.");

    }
    @Test
    public void testExplicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://qavbox.github.io/demo/delay/");
        driver.findElement(By.xpath("//input[@name='commit']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='two']")));
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[@id='two']"), "I am here!"));

        WebElement message = getElement(By.xpath("//h2[@id='two']"));

        wait.until(ExpectedConditions.textToBePresentInElement(message, "I am here!"));
        Assert.assertTrue(message.isDisplayed());
        Assert.assertEquals(message.getText(), "I am here!");
    }


}
