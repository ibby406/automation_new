package reusableLibrary;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class ReusableAnnotations {

    //you need to make your WebDriver driver variable static since we are calling it to our test class
    public static WebDriver driver;
    //declare the report variable here
    public static ExtentReports reports;
    //declare the logger variable here
    public static ExtentTest logger;


    //set before suite annotation method
    @BeforeSuite
    public void setDriver(){


        reports = new ExtentReports("src/main/java/HTML_Report/automationReport.html",true);
    }//end of before suite

    //call before method annotation to capture each test name dynamically
    @BeforeMethod
    public void getTestName(Method methodName){
        driver = reusableMethods.defineChromeDriver();

        //get a name of the test
        logger = reports.startTest(methodName.getName());
    }//end of before method

    @AfterMethod
    public void closeDriver(){
    driver.close();
    }//end of before method


    @AfterSuite
    public void quitDriver(){
        driver.quit();
        reports.endTest(logger);
        reports.flush();
    }//end of after suite

}
