package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task15 {
    WebDriver driver = null;

    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test(priority = 1)
    public  void searchGoogle() throws InterruptedException {
        // Navigate to Google
        driver.get("https://www.google.com");

        // Wait for the page to load completely
        Thread.sleep(2000);

        // search for keyword
        driver.findElement(By.name("q")).sendKeys("testify ltd");

        //submit search
        driver.findElement(By.name("q")).submit();
        // Wait for the search results to load
        Thread.sleep(5000);
        System.out.println("Testify Searched");


    }

    @Test(priority = 2)
    public  void close() {
        driver.quit();
        System.out.println("Driver closed");
        driver = new ChromeDriver();
        driver.manage().window().maximize();




    }

  @AfterMethod
    public  void mcdonaldsCode() throws InterruptedException {
        // Navigate to Google
        driver.get("https://www.mcdonalds.com/us/en-us.html");

        // Wait for the page to load completely
        Thread.sleep(2000);

        WebElement orderNowButton = driver.findElement(By.xpath("//a[@id='button-ordernow']"));
        String orderNowColor = orderNowButton.getCssValue("background-color");
        System.out.println("The colour of the order now button is " + orderNowColor);



    }

}
