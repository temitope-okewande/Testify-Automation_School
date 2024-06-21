package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Task16 {
    WebDriver driver = null;

    @BeforeClass
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testifyAssert() throws InterruptedException {

        driver.get("https://testifyltd.com/");

        // Wait for the page to load completely
        Thread.sleep(2000);



        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(5000);

        // Find and assert email
        driver.findElement(By.xpath("//a[normalize-space()='Contact Us']")).click();
        Thread.sleep(5000);

        WebElement emailElement = driver.findElement(By.xpath("//span[contains(text(),'info@testifyltd.com')]"));
        String email = emailElement.getText();
        Assert.assertEquals("info@testifyltd.com", email);
        System.out.println("emailAssert: " + email);
        Thread.sleep(5000);

        WebElement phoneElement = driver.findElement(By.xpath("//span[contains(text(),'(+234)905-882-0971')]"));
        String phone = phoneElement.getText();
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(phone, "(+234)905-882-0971");
        System.out.println("phoneAssert: " + phone);
        Thread.sleep(5000);
        sa.assertAll();


        // Find and assert location
        WebElement locationElement = driver.findElement(By.xpath("//span[normalize-space()='Nigeria']"));
        String location = locationElement.getText();
        Assert.assertEquals("Nigeria", location);
        System.out.println("locationAssert: " + location);
        Thread.sleep(5000);



    }







    @AfterClass
    public void closeBrowser() {

        driver.quit();
    }
}
