package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");

        //Enter username
        driver.findElement(By.cssSelector("input.input_error.form_input")).sendKeys("standard_user");
        Thread.sleep(3000);

        //Enter password
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        Thread.sleep(3000);

        //Click on login
        driver.findElement(By.cssSelector("input[name*='butt']")).click();
        Thread.sleep(3000);

        //Back to login page
        driver.navigate().back();
        Thread.sleep(3000);

        //Click on login to get the value attribute
        String loginAttribute= driver.findElement(By.cssSelector("input[name*='butt']")).getAttribute("value");
        System.out.println("Login attribute: "+loginAttribute);
        Thread.sleep(3000);

        //Navigate forward
        driver.navigate().forward();
        Thread.sleep(3000);

        //Print out a product name
        String productName = driver.findElement(By.className("inventory_item_name")).getText();
        System.out.println("Product name: " + productName);
        Thread.sleep(3000);



    }
}
