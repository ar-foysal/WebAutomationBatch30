package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest extends DriverSetup{
//    public static void main(String[] args) throws InterruptedException {
//
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://facebook.com");
//        Thread.sleep(2000);
//        driver.close();
//
//    }
    @Test
    public void testPageTitle(){
        driver.get("https://google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println(driver.getCurrentUrl());
    }
}
