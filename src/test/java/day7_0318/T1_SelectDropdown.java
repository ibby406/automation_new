package day7_0318;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class T1_SelectDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https:mortgagecalculator.org");

        Thread.sleep(1000);

        //store start month locator as an webElement
        WebElement months = driver.findElement(By.xpath("//*[@name='param[start_month]']"));

        //call select function to store dropdown locator
        Select dropdown = new Select(months);

        dropdown.selectByVisibleText("May");

        //dropdown.selectByIndex(4);

        //dropdown.selectByValue("4");

    }
}
