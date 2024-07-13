package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to jQuery UI website
        driver.navigate().to("https://jqueryui.com/");
        Thread.sleep(3000);

        // Click on the Dialog menu from the left pane
        driver.findElement(By.linkText("Dialog")).click();
        Thread.sleep(3000);

        // Switch to the iframe containing the dialog
        driver.switchTo().frame(0);

        // Click on the close icon to close the dialog
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(3000);



        // Close the browser
        driver.quit();
    }
}
