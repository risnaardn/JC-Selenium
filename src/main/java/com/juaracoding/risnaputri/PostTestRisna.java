package com.juaracoding.risnaputri;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PostTestRisna {
    private static int detik;

    public static void main(String[] args) throws InterruptedException {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://formy-project.herokuapp.com/form";
        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement titleMenu = driver.findElement(By.xpath("/html/body/div/h1"));
        System.out.println("Title Menu: "+ titleMenu.getText());

        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Risna Putri");
        System.out.println("Input First Name");
        delay(detik);

        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Ramadhani");
        System.out.println("Input Last Name");
        delay(detik);

        driver.findElement(By.xpath("//*[@id=\"job-title\"]")).sendKeys("TA");
        System.out.println("Input Job");
        delay(3);

        js.executeScript("window.scrollBy(0,500)");

        WebElement radio1 = driver.findElement(By.id("radio-button-2"));
        radio1.click();
        radio1.isSelected();
        System.out.println("College Radio Button");

        driver.findElement(By.xpath("//*[@id=\"checkbox-2\"]")).click();
        System.out.println("Female checkilst");

        WebElement elementSelect = driver.findElement(By.id("select-menu"));
        Select select = new Select(elementSelect);
        select.selectByIndex(2);
        System.out.println("Select Year Experience");

        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("01/08/2023");
        System.out.println("Date Picker");
        delay(detik);

        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
        System.out.println("Submit button");
        delay(detik);



        delay(5);

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