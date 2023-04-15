package day8_0319;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class T2_AI {

    public static void main(String[] args) throws InterruptedException {

        // setup webdriver manager for chrome
        WebDriverManager.chromedriver().setup();

        //setup chrome instance
        WebDriver driver = new ChromeDriver();

        //wait 1 second
        Thread.sleep(1000);

        //maximize screen
        driver.manage().window().maximize();

        //array list of states created
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Miami");
        cities.add("San Diego");

        //array list of adults to be added for travel info
        ArrayList <Integer> adults = new ArrayList<>();
        adults.add(2);
        adults.add(3);
        adults.add(4);

        //start the for loop to iterate through states
        for (int i = 0; i < cities.size(); i++) {
            driver.navigate().to("https://hotels.com");
            Thread.sleep(1000);

            //click on search field
            try {
                WebElement location = driver.findElement(By.xpath("//*[@aria-label='Going to']"));
                location.click();

            } catch (Exception e) {
                System.out.println("unable to click search field" + e);
            } // end of exception

            //type in state and type in city
            try {
                driver.findElement(By.xpath("//*[@id='destination_form_field']")).sendKeys(cities.get(i));
                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println("unable to click city" + e);
            } // end of exception

            //wait
            Thread.sleep(1000);

            //click on first suggestion on dropdown
            try {
                driver.findElement(By.xpath("//*[@data-stid='destination_form_field-result-item-button']")).click();
            } catch (Exception e) {
                System.out.println("unable to click suggestion" + e);
            } // end of exception

            //click on travelers button
            try{
                driver.findElement(By.xpath("//*[@data-stid='open-room-picker']")).click();
            } catch (Exception e) {
                System.out.println("unable to find travelers button" + e);
            } // end of exception


            //create arraylist of (-) and (+) buttons
            ArrayList <WebElement> button = new ArrayList<>(driver.findElements(By.xpath("//*[@class='uitk-step-input-button']")));

            // wait
            Thread.sleep(2000);
            //click (-) on adult
            button.get(0).click();

            //click (+) on adult from j=1 to adults.add (index i) value
            for (int j=1;j<adults.get(i);j++){
                button.get(1).click();
            } // end of loop


            //click child + button
            try {
                button.get(3).click();
            } catch (Exception e) {
                System.out.println("unable to click child + button " + e);

            }

            //select dropdown for child age as 7
            WebElement childAge = driver.findElement(By.xpath("//*[@id='age-traveler_selector_children_age_selector-0-0']"));
            Select childDropdown = new Select (childAge);

           try{
               childDropdown.selectByVisibleText("7");
           }  catch (Exception e) {
               System.out.println("unable to click 7 as child age" + e);
           } // end of exception

            //wait 2 seconds
            Thread.sleep(2000);

           //click submit button
           try{
           driver.findElement(By.xpath("//*[@id='search_button']")).click();
           }  catch (Exception e) {
               System.out.println("unable to click submit button" + e);
           } // end of exception

            //wait 2 seconds
            Thread.sleep(2000);

            //start conditional statement

            //create arraylist for hotel links to click
            ArrayList <WebElement> hotelLinks = new ArrayList<>(driver.findElements(By.xpath("//*[@data-stid='open-hotel-information']")));


           try{
               if ( i==0) {
                   hotelLinks.get(0).click();
               } else if (i==1){
                   hotelLinks.get(2).click();
               }else if (i==2){
                   hotelLinks.get(1).click();
               }  }catch (Exception e) {
                   System.out.println("unable to select hotel link" + e);
               }



               //call the window handles in array list and switch to the new tab
                   ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());

                   //switch to the new tab by index of 1
                   driver.switchTo().window(tabs.get(1));

                   //capture title of hotel
            try{
                   String hotelName = driver.findElement(By.xpath("//*[@class='uitk-heading uitk-heading-3']")).getText();
                   System.out.println("Hotel Name: " + hotelName);
            }  catch (Exception e) {
                System.out.println("unable to print hotel name" + e);
            }


            //wait 12 seconds
            Thread.sleep(12000);

                   //click reserve button to scroll down
            try{
                   driver.findElement(By.xpath("//*[@data-stid='sticky-button']")).click();
            }  catch (Exception e) {
                System.out.println("unable to click reserve button" + e);
            }


            //print first hotels daily price
                try{
                   String price = driver.findElement(By.xpath("//*[@class='uitk-spacing uitk-spacing-padding-block-half']")).getText();
                   System.out.println(price);
                }  catch (Exception e) {
                    System.out.println("unable to print price of night" + e);
                }


            //click reserve button in box
                try{
                   driver.findElement(By.xpath("//*[@data-stid='submit-hotel-reserve']")).click();
                }  catch (Exception e) {
                    System.out.println("unable to click reserve button" + e);
                }


            //click pay now button if exists

            try{
                   driver.findElements(By.xpath("//*[text()='Pay now']")).get(1).click();
            }  catch (Exception e) {
                System.out.println("unable to click pay now button" + e);
            }


            //wait 12 seconds
            Thread.sleep(12000);

            //print check in date
            try{
                   String checkIn = driver.findElement(By.xpath("//*[@class='col-value va-t ta-r pv-tiny travel-dates-check-in fw-bold']")).getText();
                   System.out.println("Check-In Date: " + checkIn );
            }  catch (Exception e) {
                System.out.println("unable to get check in dates " + e);
            }

            //print checkout date

            try{
                String checkOut = driver.findElement(By.xpath("//*[@class='col-value va-t ta-r pv-tiny travel-dates-check-out fw-bold']")).getText();
                System.out.println("Check-Out Date: " + checkOut + "\n");

          }  catch (Exception e) {
                System.out.println("unable to get check out dates " + e);
            }

                   //close tab
                   driver.close();

                   //switch to original tab
                   driver.switchTo().window(tabs.get(0));

               }//end of loop
//quit driver
driver.quit();

    }//end of class

}//end of main

