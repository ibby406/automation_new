package day11_0401;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import reusableLibrary.reusableMethods;

public class T2_GoogleSearchTestNG_priorities {

    //make variable global
    WebDriver driver;

   @Test
    public void searchForBMW() {
       driver.navigate().to("https://google.com");
       //enter bmw
       reusableMethods.sendKeysMethod(driver, "//*[@name='q']", "bmw", "search field");
       //submit of google search
       reusableMethods.submitMethod(driver, "//*[@name='btnK']", "google search");
   } //end of test

    //test2 depends on test1 method to run
   @Test(dependsOnMethods = "searchForBMW")
   //capture text print out number
           public void captureSearchforBMW(){
        String result = reusableMethods.captureTextMethod(driver, "//*[@id='result-stats']", "search results");
        String [] arrayResults = result.split(" ");
        System.out.println("result is: " + arrayResults[1]);
    }//end of test

    //test 3 depends on first 2 methods
    @Test(dependsOnMethods = {"searchForBMW","captureSearchforBMW"})
    public void clickOnFinance() {
        reusableMethods.clickMethod(driver," //div[text()='Finance']","Finance");
    }//end of test 3
    @BeforeSuite
    public void setUpDriver(){
        driver = reusableMethods.defineChromeDriver();
    } // end of before suite

    //@Test is replacement of main method to execute your code

    //quit the driver
    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite

}
