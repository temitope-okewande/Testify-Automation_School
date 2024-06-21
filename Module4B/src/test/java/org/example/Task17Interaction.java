package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task17Interaction {
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

        driver.get("https://demoqa.com");

        // Wait for the page to load completely
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards div.card.mt-4.top-card:nth-child(5) div:nth-child(1) div.avatar.mx-auto.white svg:nth-child(1) > path:nth-child(1)")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://demoqa.com/interaction");
        System.out.println("current interaction url assert: " + currentUrl);

    }
    @AfterClass
    public void closeBrowser() {

        driver.quit();
    }

}
