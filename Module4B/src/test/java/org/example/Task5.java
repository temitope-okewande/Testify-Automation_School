package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@type='password' and @id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@data-test='login-button' or @id='login-button']")).click();
        driver.findElement(By.xpath("//a[contains(@class, 'link')]")).click();
        driver.findElement(By.xpath("//button[text()='Checkout']")).click();
    }
}
