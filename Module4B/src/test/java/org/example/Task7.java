package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://worldweather.wmo.int/en/home.html");

        driver.findElement(By.id("q_search")).sendKeys("lagos");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input.top_searchbox_submit")).click();
        Thread.sleep(3000);

        String firstDate= driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")).getText();
//        System.out.println(firstDate);

        String secondDate= driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[2]/div[1]/div")).getText();
//        System.out.println(secondDate);

        String firstWeather= driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[1]/div[4]")).getText();
//        System.out.println(firstWeather);

        String secondWeather = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[2]/div[4]")).getText();
//        System.out.println(secondWeather);

        System.out.println("The weather today " + firstDate + " is " + firstWeather);
        System.out.println("The weather today " + secondDate + " is " + secondWeather);



    }
}
