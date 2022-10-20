package com.juaracoding.risnaputri.pages;

import com.juaracoding.risnaputri.ujiantigarisna.pageobject.drivers.DriverSingleton;
import com.juaracoding.risnaputri.ujiantigarisna.pageobject.pages.FiturSearch;
import com.juaracoding.risnaputri.ujiantigarisna.pageobject.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearch {

    public static WebDriver driver;

    private FiturSearch fiturSearch;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
    }

    @BeforeMethod
    public void pageObject() {
        fiturSearch = new FiturSearch();
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }


    @Test
    public void testSerachItem() {
        delay(Constants.DETIK);
        fiturSearch.clickSearchIcon();
        fiturSearch.writeTheItem();
        Assert.assertFalse(fiturSearch.getTxtDress().contains("Dress"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300)");
        System.out.println("Test Case Search Item");
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
