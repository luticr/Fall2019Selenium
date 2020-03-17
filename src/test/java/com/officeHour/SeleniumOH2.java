package com.officeHour;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOH2 {

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/");
        WebElement search_box = driver.findElement(By.id("search_query_top"));

        search_box.sendKeys("tshirt" + Keys.ENTER);

        Thread.sleep(3000);

        WebElement error = driver.findElement(By.className("alert alert-warning"));

        String errorText = error.getText();
        System.out.println("Error message" + errorText);

        driver.quit();




    }
}
