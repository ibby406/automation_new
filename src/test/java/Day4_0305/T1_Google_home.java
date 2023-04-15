package Day4_0305;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Google_home {
    public static void main(String[] args) throws InterruptedException {
        //set up driver thru web driver manager
        WebDriverManager.chromedriver().setup();

        //define chrome driver
        WebDriver driver = new ChromeDriver();

        //navigate to google home
        driver.navigate().to("https://google.com");

        //maximize the browser
        driver.manage().window().maximize(); // for windows
        // driver.manage().window().fullscreen(); // mac

        //pause for 2 seconds
        Thread.sleep(2000);

        //enter keyboard bmw to search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("BMW");

        //click on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

        //new webpage, wait some seconds
        Thread.sleep(2000);

        //capture search results using .getText()
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        System.out.println("search results: " + result);
        //print out only the number

        // we want to replace paranthesis to a blank
        String newResult = result.replace("(", "").replace(")", "");
        System.out.println(newResult);

        //print out only number
        String[] arrayResult = result.split(" ");
        System.out.println("search number: " + arrayResult[1]);
        System.out.println("Search Number: " + arrayResult[1] + " Seconds: " + arrayResult[3] + " " + arrayResult[4]);

        //simply close the chrome tab/driver
        driver.close();
        //driver.quit

    }
}
