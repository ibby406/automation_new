package Action_Item;

import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.reusableMethods;

public class AI06 extends ReusableAnnotations {

    @Test
    public void fidelisCare() throws InterruptedException {
        //navigate to fidelis care
        driver.navigate().to("https://www.fideliscare.org");
        //click on search box by index 1
        reusableMethods.clickMethodByIndex(driver, "//*[@class='dropdown-toggle']", 1, "Search Button");
        //type in get dental coverage on search bar
        reusableMethods.sendKeysMethod(driver, "//*[@class='form-control search-input']", "get dental coverage", "type - get dental coverage");
        Thread.sleep(1000);
        //click on search button on dropdown
        reusableMethods.clickMethodByIndex(driver, "//*[@class='fal fa-search']", 1, "search button in dropdown");
        //capture the search results
        String result = reusableMethods.captureTextMethod(driver, "//*[@class='gsc-result-info']", "results search text");
        //split to get result numbers
        String [] arrayResult = result.split(" ");
        System.out.println("Search results: " + arrayResult[1]);
        //click on get dental coverage
        reusableMethods.clickMethod(driver, "//a[@class='gs-title']", "Get dental coverage link");
        Thread.sleep(2000);
    }//end of test 1 - fideliscare search method
@Test(dependsOnMethods = "fidelisCare")
    public void GetDentalCoverage() throws InterruptedException {
        //select new tab
        reusableMethods.changeTabs(driver, 1, "view get dental coverage tab");
        //enter first name
        reusableMethods.sendKeysMethod(driver, "//*[@id='firstName']", "John",  "first name");
        //enter last name
        reusableMethods.sendKeysMethod(driver, "//*[@id='lastName']", "Wick",  "last name");
        //enter zipccode
         reusableMethods.sendKeysMethod(driver, "//*[@id='zipCode']", "11784",  "Zipcode");
         //enter county from dropdown
        reusableMethods.selectByText(driver, "//*[@id='county']", "Suffolk", "County Name");
        //enter phone number
        reusableMethods.sendKeysMethod(driver, "//*[@id='phoneNumber']", "5165165161",  "Zipcode");
        //enter EMAIL
        reusableMethods.sendKeysMethod(driver, "//*[@id='email']", "meow@meow.com",  "email");
        //click on contact me checkbox
    //Thread.sleep(2000);
    reusableMethods.clickMethod(driver, "//*[@for='contactMe']", "contact me checkbox");
    Thread.sleep(2000);
    //click submit button
    reusableMethods.clickMethodByIndex(driver, "//*[text()='Contact Me']", 2, "submit button");
    //capture text of submission confirmation and print it
    System.out.println("\n" + reusableMethods.captureTextMethod(driver, "//*[@role='alert']", "submission confirmation"));
    //close tab
    driver.close();

} // end of test 2 - get dental coverage method

    @Test(dependsOnMethods = {"fidelisCare", "GetDentalCoverage"})
    public void login() throws InterruptedException {
        //switch to original tab
        reusableMethods.changeTabs(driver, 0, "original tab");
        //click on login
        reusableMethods.clickMethod(driver, "//a[@class='dropdown-toggle']", "login-button");
        Thread.sleep(1000);
        //click on member portal login
        reusableMethods.clickMethod(driver, "//h4[@class='link-external']", "member portal login");
        Thread.sleep(1000);
        //switch to next tab
        reusableMethods.changeTabs(driver, 1, "member portal tab");
        //print out helpful tips
        String result = reusableMethods.captureTextMethod(driver, "//*[@class='tipsContentPanel']", "helpful hints");
        String [] arrayResult = result.split("Renew Your Coverage");
        System.out.println("\n" + arrayResult[0]);
        //wait 1 second
        Thread.sleep(1000);

    } // end of test 3 - login member portal class


} // end of class
