package Action_Item;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI3 {
    public static void main(String[] args) throws InterruptedException {
        //set up arraylist of zipcodes
        ArrayList <String> zipCodes = new ArrayList<>();
        //add 3 zipcodes to arraylist
        zipCodes.add("11784");
        zipCodes.add("11552");
        zipCodes.add("11729");

        //setup webdrivermanager
        WebDriverManager.chromedriver().setup();

        //define chrome options
        ChromeOptions options = new ChromeOptions();

        //setup incognito through some options
        options.addArguments("incognito");

        //create chrome instance
        WebDriver driver = new ChromeDriver(options);

        //create for loop to iterate through different zipcodes
        for (int i=0;i<zipCodes.size();i++){

            //nnavigate to weight watchers
            driver.navigate().to("https://weightwatchers.com/us/");

            //use driver option to maximize
            options.addArguments("start-maximized");

            //wait
            Thread.sleep(2000);

            //click on find a workshop link by finding xpath
            driver.findElement(By.xpath("//*[text()='Find a Workshop']")).click();

            //click on in person link
            driver.findElement(By.xpath("//*[text()='In-Person']")).click();

            //wait
            Thread.sleep(1000);

            //create webelement to use textbox location
            WebElement textBox = driver.findElement(By.xpath("//*[@id='location-search']"));

            //clear textbox
            textBox.click();

            //enterzipcode
            textBox.sendKeys(zipCodes.get(i));

            //click the arrow button
            driver.findElement(By.xpath("//*[@type='submit']")).click();

            //wait 2 seconds
            Thread.sleep(1000);

            //store studioLinks in search results in an array list
            ArrayList <WebElement> studioLink= new ArrayList<>(driver.findElements(By.xpath("//*[@class='linkUnderline-1_h4g']")));

            //use if conditional statement, to click into the desired location
            if(i==0){
                studioLink.get(1).click();
            }  else if (i==1){
                studioLink.get(2).click();
            }  else if (i==2){
                studioLink.get(0).click();
            } // end if

            //wait
            Thread.sleep(1000);

                //store address box in array and split
                String addressBox = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                String [] address = addressBox.split("In-");
                System.out.println("Location: " + address[0] + "\n");

                //create web element for wokshop schedule view
                WebElement scheduleView = driver.findElement(By.xpath("//*[@id='studioWorkshopSchedule']"));

            //create javascript executor class
            JavascriptExecutor jse = (JavascriptExecutor)driver;

            //scroll downto workshop schedule view
            jse.executeScript("arguments[0].scrollIntoView(true)",scheduleView);

            //wait
            Thread.sleep(2000);

            //print out the schedule view by getting text value
            System.out.println(scheduleView.getText() + '\n');

        } // end of for loop

    }// end of class

}//end of main
