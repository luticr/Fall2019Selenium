package com.automation.pages.fleet;

import com.automation.pages.AbstractPageBase;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

public class VehiclesPage extends AbstractPageBase {

    @FindBy (partialLinkText = "Create Car")
    private WebElement createCar;

    public void clickToCreateCar() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(createCar)).click();

    }




}
