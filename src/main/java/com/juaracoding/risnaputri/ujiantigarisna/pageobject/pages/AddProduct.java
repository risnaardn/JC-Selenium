package com.juaracoding.risnaputri.ujiantigarisna.pageobject.pages;

import com.juaracoding.risnaputri.ujiantigarisna.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddProduct {

    private final WebDriver driver;

    public AddProduct() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/div/div/div/a")
    WebElement beranda;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[4]/div/div[1]/div/div/div/div[2]/div[2]/div[1]")
    WebElement clickItem;

     @FindBy(id = "color")
    WebElement color;


    @FindBy(id = "size")
    WebElement size;

    @FindBy(xpath = "//*[@id=\"product-704\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement addToCart;

   //Page Object

    public void addTheProduct(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        beranda.click();
        js.executeScript("window.scrollBy(0, 1000)");
        clickItem.click();
        js.executeScript("window.scrollBy(0, 1000)");
        Select color = new Select(driver.findElement(By.id("color")));
        color.selectByVisibleText("White");
        Select size = new Select(driver.findElement(By.id("size")));
        size.selectByVisibleText("L");
        js.executeScript("arguments[0].click();", addToCart);





    }
}
