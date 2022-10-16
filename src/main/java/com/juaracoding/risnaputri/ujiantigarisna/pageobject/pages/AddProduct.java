package com.juaracoding.risnaputri.ujiantigarisna.pageobject.pages;

import com.juaracoding.risnaputri.ujiantigarisna.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProduct {

    private WebDriver driver;

    public AddProduct() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

     @FindBy(id = "color")
    WebElement color;

    @FindBy(id = "size")
    WebElement size;

    @FindBy(name = "submit")
    WebElement submit;

   //Page Object

    public void addTheProduct(){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 1000)");
        color.isSelected();
        size.isSelected();
        js.executeScript("arguments[0].click();", submit);




    }
}
