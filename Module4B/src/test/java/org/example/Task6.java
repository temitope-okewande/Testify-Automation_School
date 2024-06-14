package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("input.input_error.form_input")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[name*='butt']")).click();
        driver.findElement(By.cssSelector("a[class^='shop']")).click();
        driver.findElement(By.cssSelector("button[name$='out']")).click();
    }
}
