package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task14 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.toolsqa.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Wait for the dialogue box to appear and then close it
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='accept-cookie-policy']")));
        closeButton.click();
        Thread.sleep(3000);


        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[4]/a[1]")).click();
        Thread.sleep(3000);


        driver.quit();
    }
}
