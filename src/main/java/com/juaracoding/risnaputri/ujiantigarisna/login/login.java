package com.juaracoding.risnaputri.ujiantigarisna.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
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

        driver.findElement(By.id("username")).sendKeys("nana");
        System.out.println("Login Input Username");

        driver.findElement(By.id("password")).sendKeys("kucing123");
        System.out.println("Login Input Password");

        driver.findElement(By.name("login")).click();
        System.out.println("Click Login Button");


        driver.quit();
    }
}
