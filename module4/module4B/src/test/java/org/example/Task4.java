package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/");
        driver.findElement(By.linkText("Security Project")).click();
        driver.navigate().refresh();
        driver.findElement(By.linkText("Security Project")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("uid")).sendKeys("mngr575755");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("vUpUjEv");
        driver.quit();

    }
}
