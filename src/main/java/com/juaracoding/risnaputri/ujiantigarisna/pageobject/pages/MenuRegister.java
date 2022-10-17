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
        js.executeScript("window.scrollBy(0,550)");
        this.reg_username.sendKeys("nana");
        this.reg_email.sendKeys("nana@gmail.com");
        this.reg_passsword.sendKeys("kucing123");
        js.executeScript("window.scrollBy(0, 100)");
        js.executeScript("arguments[0].click();", btnRegister);



    }
}

