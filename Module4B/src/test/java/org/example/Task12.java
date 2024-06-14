package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/");
        driver.findElement(By.xpath("//a[normalize-space()='Resizable']")).click();
        Thread.sleep(5000);

        driver.switchTo().frame(0);
        Thread.sleep(5000);



        WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
        Actions resizeElement = new Actions(driver);
        resizeElement.clickAndHold(resize).moveByOffset(165,176).release().perform();
        Thread.sleep(9000);




    }
}
