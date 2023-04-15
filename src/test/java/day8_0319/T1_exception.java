package day8_0319;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class T1_exception {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https:mortgagecalculator.org");

        Thread.sleep(1000);


        //clear and enter a home value
        try{
            WebElement homeVal = driver.findElement(By.xpath("//*[@name='param[homevalue]']"));
            homeVal.clear();
            homeVal.sendKeys("350000");
            System.out.println("Successfully entered home value on the field");
        }catch (Exception e) {
            System.out.println("Unable to enter a value on Home Value field. " + e);
        }//end of exception for home value

        //clear and enter a interest rate
        try{
            WebElement interestRate = driver.findElement(By.xpath("//*[@name'param[interest_rate]']"));
            interestRate.clear();
            interestRate.sendKeys("2.5");
            System.out.println("Successfully entered interest rate on the field");
        }catch (Exception e) {
            System.out.println("Unable to enter a value on Interest Rate field. " + e);
        }//end of exception for interest rate

        //select start month
        try{
            WebElement strMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
            Select dropDown = new Select(strMonth);
            dropDown.selectByVisibleText("Apr");
            System.out.println("Successfully Selected Month from the dropdown");
        }catch (Exception e) {
            System.out.println("Unable to select a value Start Month drop down. " + e);
        }//end of exception for start month



    }
}
