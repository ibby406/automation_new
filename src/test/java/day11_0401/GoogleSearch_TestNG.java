package day11_0401;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import reusableLibrary.reusableMethods;

public class GoogleSearch_TestNG {

    //make variable global
    WebDriver driver;

    @BeforeSuite
    public void setUpDriver(){
        driver = reusableMethods.defineChromeDriver();
    } // end of before suite

    //@Test is replacement of main method to execute your code
    @Test
    public void googleSearchNumber(){
        driver.navigate().to("https://google.com");
        //enter bmw
        reusableMethods.sendKeysMethod(driver, "//*[@name='q']", "bmw", "search field");
        //submit of google search
        reusableMethods.submitMethod(driver, "//*[@name='btnK']", "google search");
        //capture text print out number
        String result = reusableMethods.captureTextMethod(driver, "//*[@id='result-stats']", "search results");
        String [] arrayResults = result.split(" ");
        System.out.println("result is: " + arrayResults[1]);
    }//end of test

    //quit the driver
    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite

}
