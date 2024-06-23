package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task18Sauce {
    WebDriver driver;
    @Test
    public void sauce() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/temitopeokewande/projects/Testify/Module4B/src/test/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        Task18 obj = new Task18(driver);
        obj.getUsername().sendKeys("standard_user");
        Thread.sleep(3000);

        obj.getPassword().sendKeys("secret_sauce");
        Thread.sleep(3000);

        obj.getLogin().click();
        Thread.sleep(3000);

        obj.getCart().click();
        Thread.sleep(3000);

        String title = obj.getCartTitle().getText();

        Thread.sleep(3000);
        obj.getAddCart().click();
        Thread.sleep(5000);

        Assert.assertEquals(title, "Sauce Labs Backpack");
        Thread.sleep(3000);
        System.out.println("Title" + title);

        obj.getCheckout().click();
        Thread.sleep(3000);

        obj.getFirstname().sendKeys("Temitope ");
        Thread.sleep(3000);

        obj.getLastname().sendKeys("Okewande");
        Thread.sleep(3000);

        obj.getPostalCode().sendKeys("12345");
        Thread.sleep(3000);

        obj.getcontinueCart().click();
        Thread.sleep(3000);

        Assert.assertEquals(title, "Sauce Labs Backpack");
        System.out.println("Title" + title);
        Thread.sleep(3000);

        obj.getFinish().click();
        Thread.sleep(3000);


        String thanks = obj.getThankYou().getText();
        System.out.println("Thanks " + thanks);
        Assert.assertEquals(thanks, "Thank you for your order!");
        Thread.sleep(3000);


        driver.quit();




    }
}
