package com.juaracoding.risnaputri.ujiantigarisna.pageobject.pages;

import com.juaracoding.risnaputri.ujiantigarisna.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuRegister {
    private WebDriver driver;

    public MenuRegister() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")
    WebElement myAccount;

    @FindBy(id = "reg_username")
    WebElement reg_username;


    @FindBy(id = "reg_email")
    WebElement reg_email;


    @FindBy(id = "reg_password")
    WebElement reg_passsword;


    @FindBy(name = "register")
    WebElement btnRegister;




    //Page Object

    public void Regristrasi(){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 250)");
        myAccount.click();
        System.out.println("klik menu myAccount");

        js.executeScript("window.scrollBy(0,550)");

        this.reg_username.sendKeys("nana");
        System.out.println("input register username");

        this.reg_email.sendKeys("nana@gmail.com");
        System.out.println("input register email");

        this.reg_passsword.sendKeys("kucing123");
        System.out.println("input register passowrd");

        js.executeScript("window.scrollBy(0, 100)");
        js.executeScript("arguments[0].click();", btnRegister);

        System.out.println("klik button register");



    }
}

