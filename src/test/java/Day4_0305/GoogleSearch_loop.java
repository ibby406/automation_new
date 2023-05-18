package Day4_0305;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class GoogleSearch_loop {

    public static void main(String[] args) throws InterruptedException {
        //setup driver thru web driver manager
        WebDriverManager.chromedriver().setup();

        //define chrome driver you will use for automation

        WebDriver driver =  new ChromeDriver();

        //setup arraylist of cars
        ArrayList <String> cars = new ArrayList<>();
        cars.add("BMW");
        //cars.add("Mercedes");
        //cars.add("Audi");

        //iterate through list of cars and print out search number for each car
        for(int i=0; i < cars.size();i++){
            driver.navigate().to("https://google.com");

            //wait 2 seconds
            Thread.sleep(2000);

            //enter keyword bmw to search fiels
            driver.findElement(By.xpath("//*[@name='q'] and ([@id='APjFqb']")).sendKeys(cars.get(i));

            //click on google search button
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();

            //whenever you go to a new page or navigate, always use 2-3 seconds wait to pause your script a bit
            Thread.sleep(2000);

           // capture the search results using .getText()
            String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            System.out.println("Search results: " + result);


            //print out only the number
            String[] arrayResult = result.split(" ");
            System.out.println("For " + cars.get(i) + " the search number is " + arrayResult[1]);

        }//end of loop

//outside of loop is where you quit/close the driver
        driver.quit();


        }

    }

