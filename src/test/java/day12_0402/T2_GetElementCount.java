package day12_0402;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;

import java.util.ArrayList;

public class T2_GetElementCount extends ReusableAnnotations {
@Test
        public void getNavListCount(){
    //navigating to usps
        driver.navigate().to("https://www.usps.com");
    //store the elements list in a ArrayList with common property
    WebDriverWait wait = new WebDriverWait(driver,7);
    ArrayList<WebElement> navList = new ArrayList<>(wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]"))));
    System.out.println("Count: " + navList.size());
}
}

