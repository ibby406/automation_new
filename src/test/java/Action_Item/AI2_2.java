package Action_Item;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AI2_2 {
    public static void main(String[] args) throws InterruptedException {
        //Setup Chrome driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //create chrome driver
        WebDriver driver = new ChromeDriver();

        //maximize screen
        driver.manage().window().maximize();

        //create arraylist named values
        ArrayList <String> hobby = new ArrayList<>();
        hobby.add("procrastinating");
        hobby.add("sleeping");
        hobby.add("snacking");
        hobby.add("coding");

        //create for loop to iterate through different searches
        for (int i=0;i< hobby.size();i++){

            //navigate to bing.com
            driver.navigate().to("https://bing.com");

            //wait 1 second
            Thread.sleep(1000);

            //find text button path and enter index value in arraylist
            driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys(hobby.get(i));

            //enter search button on text field after inputting text
            driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).submit();

            //wait a second
            Thread.sleep(1000);

            //capture the search information into a string
            String result = driver.findElement(By.xpath("//span[@class='sb_count']")).getText();

            //create new array to split the search info by space
            String [] splitResult = result.split(" ");

            //print the search number value
            System.out.println("For " + hobby.get(i) + " , the search results are: " + splitResult[1]);

        } // end for loop

        //quit browser
        driver.quit();


    } // end of main
} // end of class
