package day10_326;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusableLibrary.reusableMethods;

public class T1_staples_reusableMethod {
    public static void main(String[] args) throws InterruptedException {
        //set up the chrome driver
        WebDriver driver = reusableMethods.defineChromeDriver();

        //set up the chrome driver
        //WebDriver driver = ReusableMethods.defineChromeDriver();

        driver.navigate().to("https:mortgagecalculator.org");

        Thread.sleep(1000);


        reusableMethods.selectByText(driver,"//*[@name='param[start_month]']", "May", "threeeeeee");
/*
        //navigate to staples home page
        driver.navigate().to("https://www.staples.com");

        //type on search field using sendkeys method
        reusableMethods.sendKeysMethod(driver, "//*[@id='searchInput']", "iphone", "Search Field");

        //click on the search icon
        reusableMethods.clickMethod(driver, "//*[@class='search-bar-input__searchIcon']", "Search Icon");

        //click on first image by index
        reusableMethods.clickMethodByIndex(driver, "//*[@class='standard-tile__image standard-tile__image_hover']", 0, "Iphone Image");

        //click on add to the cart button
        reusableMethods.clickMethod(driver, "//*[@id='ctaButton']", "Add to cart");

        //capture the starting price and print it out
        Thread.sleep(3000);
        String result = reusableMethods.captureTextMethod(driver, "//*[contains(text(),'starting at')]", "Starting Price");

        System.out.println("My result is " + result);
        */
    }
}