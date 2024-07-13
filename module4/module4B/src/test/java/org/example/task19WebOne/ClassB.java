package org.example.task19WebOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ClassB {
    WebDriver driver = null;

    @BeforeClass
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test(groups = "homepage")
    public void testifyAssert() throws InterruptedException {

        driver.get("https://demoqa.com");

        // Wait for the page to load completely
        Thread.sleep(2000);


        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "DEMOQA");
        System.out.println("current form url assert: " + pageTitle);

    }

    @AfterClass
    public void closeBrowser() {

        driver.quit();
    }
}
