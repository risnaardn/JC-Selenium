package com.juaracoding.risnaputri.pages;

import com.juaracoding.risnaputri.ujiantigarisna.pageobject.drivers.DriverSingleton;
import com.juaracoding.risnaputri.ujiantigarisna.pageobject.pages.AddWishList;
import com.juaracoding.risnaputri.ujiantigarisna.pageobject.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAddWishList {
    public static WebDriver driver;

    private AddWishList addWishList;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
    }

    @BeforeMethod
    public void pageObject() {
        addWishList = new AddWishList();
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    @Test
    public void testAddWishListItemOne() {
        delay(Constants.DETIK);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 950)");
        addWishList.AddWishListOne();
        delay(Constants.DETIK);
        js.executeScript("window.scrollBy(0, 250)");
        delay(Constants.DETIK);
        System.out.println("Add Wishlist Item One");
    }

    @Test
    public void testAddWishListItemTwo() {
        delay(Constants.DETIK);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 550)");
        addWishList.AddWishListTwo();
        js.executeScript("window.scrollBy(0, 570)");
        delay(Constants.DETIK);
        System.out.println("Add Wishlist Item Two");
    }



    static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
