package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://idorenyinankoh.github.io/loginPage/ ");
        Thread.sleep(2000);






        driver.findElement(By.xpath("//*[@id=\"create\"]")).click();
        boolean beforeCreateAccount= driver.findElement(By.xpath("//*[@id=\"create\"]")).isEnabled();
        System.out.println(beforeCreateAccount);


        //First name field
        driver.findElement(By.name("firstName")).sendKeys("Temitope");
        Thread.sleep(3000);

        //Lastname field
        driver.findElement(By.id("lastName")).sendKeys("Okewande");
        Thread.sleep(3000);

       //Email field
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Topehnics@gmail.com");
        Thread.sleep(3000);

        //Gender field
        driver.findElement(By.cssSelector("#female")).click();
        Thread.sleep(3000);

       //password field
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@Test123");
        Thread.sleep(3000);

        //Confirm password field
        driver.findElement(By.cssSelector("#confirmPass")).sendKeys("@Test123");
        Thread.sleep(3000);

        //About you field
        driver.findElement(By.name("xpLevel")).sendKeys("I am great,I am a QA engineer.");
        driver.findElement(By.name("xpLevel")).click();
        Thread.sleep(5000);

        //Confirm password field
        driver.findElement(By.cssSelector("#confirmPass")).sendKeys("@Test123");
        Thread.sleep(3000);

        //About you field
        driver.findElement(By.name("xpLevel")).sendKeys("I am great,I am a QA engineer.");
        driver.findElement(By.name("xpLevel")).click();
        Thread.sleep(5000);

        //Click on create account
        boolean afterCreateAccount= driver.findElement(By.tagName("button")).isEnabled();
        System.out.println(afterCreateAccount);













    }
}
