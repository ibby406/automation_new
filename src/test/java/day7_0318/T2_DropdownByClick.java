package day7_0318;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class T2_DropdownByClick {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https:mortgagecalculator.org");

        Thread.sleep(1000);

        //select start month as april from dropdown using select function
        //if select tag not showing in dropdown

        //if dropdown is not under select tag, click on drop down first
        driver.findElement(By.xpath("//*[@name='param[start_month]']")).click();

        Thread.sleep(2000);

        //click on dropdown value using xpath text
        driver.findElement(By.xpath("//*[text()='Apr']")).click();



    }
}
