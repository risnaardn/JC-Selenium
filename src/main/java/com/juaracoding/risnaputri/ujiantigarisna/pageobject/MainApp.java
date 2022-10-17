package com.juaracoding.risnaputri.ujiantigarisna.pageobject;

import com.juaracoding.risnaputri.ujiantigarisna.pageobject.drivers.DriverSingleton;
import com.juaracoding.risnaputri.ujiantigarisna.pageobject.pages.AddProduct;
import com.juaracoding.risnaputri.ujiantigarisna.pageobject.pages.MenuLogin;
import com.juaracoding.risnaputri.ujiantigarisna.pageobject.pages.MenuRegister;
import com.juaracoding.risnaputri.ujiantigarisna.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

        MenuRegister menuRegister = new MenuRegister();
        menuRegister.Regristrasi();

        MenuLogin menuLogin = new MenuLogin();
        menuLogin.Login();

        AddProduct addProduct = new AddProduct();
        addProduct.addTheProduct();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}