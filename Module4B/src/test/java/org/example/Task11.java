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



            driver.findElement(By.xpath("//a[@href='https://www.testifyltd.com/']//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Testify Limited']")).click();
            Thread.sleep(5000);

            for (String windowHandle : driver.getWindowHandles()) {
                driver.switchTo().window(windowHandle);
            }
            Thread.sleep(5000);

            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            Thread.sleep(5000);


            driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/testifyorg']//*[name()='svg']")).click();

            for (String windowHandle : driver.getWindowHandles()) {
                driver.switchTo().window(windowHandle);
            }
            Thread.sleep(5000);

            driver.findElement(By.xpath("//*[@id=\"base-contextual-sign-in-modal\"]/div/section/button/icon")).click();
            Thread.sleep(5000);


            String descriptionText= driver.findElement(By.xpath("/html/body/main/section[1]/section/div/div[2]/div[1]/h4/span")).getText();
            System.out.println("Description: " + descriptionText);
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
