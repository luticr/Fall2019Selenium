package com.automation.tests.vytrack;

import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class AbstractTestBase {

    //base class for other classes
    //it has to be extended
    //we cannot use it on its own/ by definition it is NOT concrete

    //will be visible in the subclass, regardless on subclass location (same package or no)
    protected WebDriverWait wait;

    //for explicit wait ( explicit i and implicit cannot be used in the same task - can be in the same class)
    //if this variable needs to be visible in same class and subclasses make it protected
    //if anywhere then public

    //we can also insert Actions in base class
    protected Actions actions;
    //you cannot create a generic Select class!! it needs to be created for specific element!

    @BeforeMethod
    public void setup(){
        String URL = ConfigurationReader.getProperty("qa1");
        Driver.getDriver().get(URL);// open URL = q1 in the browser
        Driver.getDriver().manage().window().maximize();
        wait = new WebDriverWait(Driver.getDriver(),15);
        actions = new Actions(Driver.getDriver());
    }



    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
        //any webdriver object open webbrowser
        //when we use this singleton webdriver we are ensuring that it is alwasy the same web driver
    }

    //page class - we create page object , every page object contains web elements .. and we store locators in these classes .
    //this pattern is called test page object model
    //well organized , easily to maintain
    //every page that will be tested need to have page object class

    // configuration.properties = does not have locators ..but some people do that too

    //VASYL SAYS keep elements inside the class because
    //page class broken down into 2 piece then you have to jump back and forth between classes and config file


    //package package represents collection of page classes
}
