package com.juaracoding.risnaputri.ujiantigarisna.register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://shop.demoqa.com/";
        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement titleMenu = driver.findElement(By.xpath("//*[@id=\"slide-6-layer-4\"]"));
        System.out.println("Title Menu: "+ titleMenu.getText());

        js.executeScript("window.scrollBy(0,250)");
        driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")).click();
        System.out.println("Click Menu My Account ");


        WebElement titleMenuMyAccount = driver.findElement(By.xpath("//*[@id=\"noo-site\"]/section/div/div/h1"));
        System.out.println("Title Menu: "+ titleMenuMyAccount.getText());

        js.executeScript("window.scrollBy(0,550)");

        driver.findElement(By.id("reg_username")).sendKeys("nana");
        System.out.println("Regristrasi Input Username");

        driver.findElement(By.id("reg_email")).sendKeys("nana@gmail.com");
        System.out.println("Regristrasi Input Email");

        driver.findElement(By.id("reg_password")).sendKeys("kucing123");
        System.out.println("Regristrasi Input Password");

        js.executeScript("window.scrollBy(0,150)");

        driver.findElement(By.name("register")).click();
        System.out.println("Click Register Button");


        delay(3);
        driver.quit();
    }
    static void delay(int detik){
        // delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
