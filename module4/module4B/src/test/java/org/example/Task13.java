package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/");

        driver.findElement(By.xpath("//div[@class='search-expand-text']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='Search this blog']")).sendKeys("Demo Dropdown");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@placeholder='Search this blog']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[contains(text(),'Read more')]")).click();
        Thread.sleep(3000);

        Select countrySelect = new Select(driver.findElement(By.xpath("//select[@name='country']")));
        countrySelect.selectByValue("NG");
        Thread.sleep(2000);


        Select monthSelect = new Select(driver.findElement(By.xpath("//*[@id=\"post-body-4074800055706479627\"]/div/div[3]/select")));
        monthSelect.selectByValue("Jan");
        Thread.sleep(3000);

        monthSelect.selectByVisibleText("February");
        Thread.sleep(3000);

        monthSelect.selectByIndex(3);
        Thread.sleep(3000);




    }
}
