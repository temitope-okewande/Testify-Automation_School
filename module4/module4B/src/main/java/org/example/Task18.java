package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task18 {
    WebDriver Sdriver;
    public   Task18(WebDriver driver){
        Sdriver = driver;
        PageFactory.initElements(Sdriver, this);

    }
    @FindBy( xpath = "//input[@id='user-name']") private WebElement username;
    public WebElement getUsername(){
        return username;

    }
    @FindBy( xpath = "//input[@id='password']") private WebElement password;
    public WebElement getPassword(){
        return password;

    }

    @FindBy( xpath = "//input[@id='login-button']") private WebElement login;
    public WebElement getLogin(){
        return login;

    }

    @FindBy( xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement cart;
    public WebElement getCart(){
        return cart;

    }

    @FindBy( xpath = "//span[@class='shopping_cart_badge']") private WebElement addCart;
    public WebElement getAddCart(){
        return addCart;

    }
    @FindBy( className = "inventory_item_name") private WebElement cartTitle;
    public WebElement getCartTitle(){
        return cartTitle;

    }

    @FindBy( xpath = "//button[@id='checkout']") private WebElement checkout;
    public WebElement getCheckout(){
        return checkout;

    }

    @FindBy( xpath = "//input[@id='first-name']") private WebElement firstname;
    public WebElement getFirstname(){
        return firstname;

    }

    @FindBy( xpath = "//input[@id='last-name']") private WebElement lastname;
    public WebElement getLastname(){
        return lastname;

    }

    @FindBy( xpath = "//input[@id='postal-code']") private WebElement postalCode;
    public WebElement getPostalCode(){
        return postalCode;

    }


    @FindBy( xpath = "//input[@id='continue']") private WebElement continueCart;
    public WebElement getcontinueCart(){
        return continueCart;

    }

    @FindBy( css= "#finish") private WebElement finish;
    public WebElement getFinish(){
        return finish;

    }


    //h2[contains(text(),'Thank you for your order!')]

    @FindBy( xpath = "//h2[contains(text(),'Thank you for your order!')]") private WebElement thankYou;
    public WebElement getThankYou(){
        return thankYou;

    }









}
