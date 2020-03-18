package com.automation.tests.day10;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ActionsTests {
    private WebDriver driver;



    @BeforeMethod
    public void setup() {
        driver = DriverFactory.createDriver("chrome");

    }

    public void hoverOnImage () {
        driver.get("http://practice.cybertekschool.com/hovers");
        BrowserUtils.wait(3);

        WebElement img1 = driver.findElement(By.xpath("(//img)[1]"));
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
     }
}
