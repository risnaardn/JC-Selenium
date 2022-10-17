package com.juaracoding.risnaputri.ujiantigarisna.pageobject.pages;

import com.juaracoding.risnaputri.ujiantigarisna.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuLogin {

    private final WebDriver driver;

    public MenuLogin(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")
    WebElement myAccount;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(name = "login")
    WebElement login;

    //Page Object

    public void Login(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)");
        this.username.sendKeys("nana");
        System.out.println("input login username");
        this.password.sendKeys("kucing123");
        System.out.println("input login passowrd");
        js.executeScript("arguments[0].click();", login);
        System.out.println("klik button login");

    }

}

