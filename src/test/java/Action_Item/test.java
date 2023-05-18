package Action_Item;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://bing.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='sb_form_q']")).sendKeys("lakers");
        driver.findElement(By.xpath("//*[@id='sb_form_q']")).submit();

        Thread.sleep(2000);

        String message = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
        String [] result = message.split(" ");
        System.out.println(result[1]);


    }
}
