package org.example.task19WebOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ClassC {

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

        WebElement text = driver.findElement(By.xpath("//h5[contains(text(),'Elements')]"));
        String pageText = text.getText();
        Assert.assertEquals(pageText, "Elements");
        System.out.println("text on homepage: " +pageText);

    }

    @AfterClass
    public void closeBrowser() {

        driver.quit();
    }
}
