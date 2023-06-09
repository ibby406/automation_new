package day9_0325;

    import reusableLibrary.reusableMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class reusableConcept {
        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = reusableMethods.defineChromeDriver();

            //navigate to ups website
            driver.navigate().to("http://www.ups.com/us");

            //declare the explicit wait command
            WebDriverWait wait = new WebDriverWait(driver,20);

            //click on shipping
            //your explicit wait condition replaces your driver.findElement(s)
            //presenceOfAllElementsLocatedBy is same as findElements
            reusableMethods.clickMethod(driver,"//*[@id='mainNavDropdown1']", "Shipping Link");

            //click on Schedule a Pickup
            //when you see element not interactable exception then you have to use Thread.sleep for few seconds before
            Thread.sleep(2000);
            reusableMethods.clickMethod(driver,"//*[text()='Schedule a Pickup']", "Schedule a Pickup");

            //click on Freight
            reusableMethods.clickMethod(driver,"//*[text()='Freight']","Freight");

        }//end of main
    }//end of class

