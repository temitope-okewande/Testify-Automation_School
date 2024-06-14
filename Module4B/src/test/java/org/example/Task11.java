package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {
        // Set the correct path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize browser window
            driver.manage().window().maximize();

            // Navigate to Google
            driver.get("https://www.google.com");

            // Wait for the page to load completely
            Thread.sleep(2000); // Using Thread.sleep for simplicity, but WebDriverWait is preferred

            // search for keyword
            driver.findElement(By.name("q")).sendKeys("testify ltd");

            //submit search
            driver.findElement(By.name("q")).submit();
           // Wait for the search results to load
            Thread.sleep(5000);

            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy(0,300)");
            Thread.sleep(5000);

            driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]")).click();
            Thread.sleep(5000);
//
////            for (String windowHandle : driver.getWindowHandles()) {
////                driver.switchTo().window(windowHandle);
////            }
////            Thread.sleep(5000);
//
            WebElement descriptionText = driver.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[2]/div[1]/div[2]/main[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/p[1]')]"));
            String description = descriptionText.getText();
            System.out.println("Description: " + descriptionText);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("done");
        }
    }
}
