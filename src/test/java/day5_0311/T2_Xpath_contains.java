package day5_0311;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Xpath_contains {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https:yahoo.com");

        //find element by text value for - mail link
        driver.findElement(By.xpath("//a[contains(text(), 'Mail')]")).click();
    }
}
