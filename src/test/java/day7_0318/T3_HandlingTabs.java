package day7_0318;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class T3_HandlingTabs {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https:fideliscare.org");

        Thread.sleep(2000);

        //store start month locator as an webElement
        driver.findElement(By.xpath("//*[text()='Shop For a Plan']")).click();
        //wait
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Shop for a Plan']")).click();

        Thread.sleep(1000);

        //click on find a doctor

        driver.findElements(By.xpath("//*[@href='/Find-A-Doctor']")).get(0).click();


//call the window handles in array list and switch to the new tab
        ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
//switch to the new tab by index of 1
        driver.switchTo().window(tabs.get(1));

//enter zipcode on the location field
        WebElement zipCode = driver.findElement(By.xpath("//*[@id='searchLocation']"));
        zipCode.sendKeys("11218");
    Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='I am looking near']")).click();

    }
}
