package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {

    public static void main(String[] args) throws InterruptedException {

        // set up chrome driver thru webdriver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver
        WebDriver driver = new ChromeDriver();

        //navigate to google home page
        driver.navigate().to("https://google.com");

        //pause
        //Thread.sleep(2000);

        //maximize browser window
        driver.manage().window().maximize();

        //type bmw into search bar
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("BMW");

        //click on google search
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).submit();

        //capture text
        String result = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
        System.out.println("result is: " + result);

        //create new array to split result
        String[] arrayResult = result.split(" ");
        System.out.println("results: " + arrayResult[1]);


        driver.close();



    }
}
