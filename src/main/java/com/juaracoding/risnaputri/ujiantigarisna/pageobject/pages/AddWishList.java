package com.juaracoding.risnaputri.ujiantigarisna.pageobject.pages;

import com.juaracoding.risnaputri.ujiantigarisna.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddWishList {
    private final WebDriver driver;


    public AddWishList(){
        this.driver = DriverSingleton.getDriver();

        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[contains(@class,'custom-logo-link')]//img[contains(@alt,'ToolsQA Demo Site')]")
    WebElement home;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[4]/div/div[1]/div/div/div/div[2]/div[2]/div[1]/div/h3/a")
    WebElement clickItemOne;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/h3/a")
    WebElement clickItemTwo;

    @FindBy(xpath = "//*[@id=\"product-704\"]/div[1]/div[2]/div[2]/div/a")
    WebElement addWishListOne;

    @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/div[2]/div/a")
    WebElement addWishListTwo;


    public void AddWishListOne(){
        clickItemOne.click();
        addWishListOne.click();
        driver.navigate().back();


    }

    public void AddWishListTwo(){
        home.click();
        clickItemTwo.click();
        addWishListTwo.click();

    }
}
