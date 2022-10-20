package com.juaracoding.risnaputri.ujiantigarisna.pageobject.pages;

import com.juaracoding.risnaputri.ujiantigarisna.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiturSearch {

    private final WebDriver driver;


    public FiturSearch(){
        this.driver = DriverSingleton.getDriver();

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/a")
    WebElement txtSearch;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/a/i")
    WebElement clickSearch;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/input[1]")
    WebElement writeItem;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/input[1]")
    WebElement txtDress;





    public String geTxtSearch(){
        return txtSearch.getText();
    }

    public void clickSearchIcon(){
        clickSearch.click();
    }

    public void writeTheItem(){
        writeItem.sendKeys("Dress");
        writeItem.sendKeys(Keys.ENTER);


    }

    public String getTxtDress(){
        return txtDress.getText();
    }

}
