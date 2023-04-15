package day6_312;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class t1_findElements {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://www.mlcalc.com");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@name='ma']")).clear();

        driver.findElement(By.xpath("//*[@name='ma']")).sendKeys("250000");


        driver.findElement(By.xpath("//*[@value='Calculate']")).click();

        Thread.sleep(1000);

        String result = driver.findElements(By.xpath("//*[@style='font-size: 32px']")).get(0).getText();
        System.out.println("Monthly payment " + result);

        String result1 = driver.findElements(By.xpath("//*[@style='font-size: 32px']")).get(1).getText();
        System.out.println("Monthly payment " + result1);

        driver.quit();


    }
}
