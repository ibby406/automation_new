package Action_Item;


import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethods_Logger;

public class AI07_testcases extends ReusableAnnotations {

        @Test
        //verify error message appears for incorrect zipcode format
        //
        //
public void zipcodeErrorMessage() throws InterruptedException {
            //navigate to huntington bank webpage
            driver.navigate().to("https://www.huntington.com/");
            //click on borrowing tab
            ReusableMethods_Logger.clickMethod(driver, "//*[@aria-label='Borrowing main menu']", logger, "Borrowing tab");
            //click on auto loans
            ReusableMethods_Logger.clickMethod(driver, "//*[text()='Auto Loans']", logger, "Auto Loans link");
            Thread.sleep(1000);
            //submit wrong zipcode
            ReusableMethods_Logger.sendKeysMethod(driver, "//*[@name='zipcode']", "11a", logger, "incorrect zipcode-11a");
            Thread.sleep(1500);
            //click update button
            ReusableMethods_Logger.clickMethod(driver, "//*[text()='Update']", logger, "zipcode update button");
            //get text of incorrect zipcode error message
            String result = ReusableMethods_Logger.captureTextMethod(driver, "//*[@id='zip-code-update-error']", logger, "zipcode error message");
            Thread.sleep(2000);
        } // end of zipcode error test case

    //Verify User can type in address to find a branch
    @Test
    public void typeAddress() throws InterruptedException {
        //navigate to huntington bank webpage
        driver.navigate().to("https://www.huntington.com/");
        //click on borrowing tab
        ReusableMethods_Logger.clickMethod(driver, "//*[@aria-label='Borrowing main menu']", logger, "Borrowing tab");
        //click on auto loans
        ReusableMethods_Logger.clickMethod(driver, "//*[text()='Personal Loans']", logger, "personal Loans link");
        Thread.sleep(1000);
        //click on Find a branch link
        ReusableMethods_Logger.clickMethod(driver, "//*[@title='Find a Branch']", logger, "find a branch link");
        //navigate to second tab
        ReusableMethods_Logger.changeTabs(driver, 1, logger, "Branch Locator Page");
        //type in address
        ReusableMethods_Logger.sendKeysMethod(driver, "//*[@id='locator-search']", "41 W Cherry St, Columbus, OH 43215, USA", logger, "address value");
        //click GO Submit button
        ReusableMethods_Logger.clickMethod(driver, "//*[text()='Go']", logger, "Submit button");
        Thread.sleep(2000);

    } // end of type address class

//Verify User can confirm before redirecting to KBB website
    @Test
    public void thirdPartylinkConfirmation() throws InterruptedException {
        //navigate to huntington bank webpage
        driver.navigate().to("https://www.huntington.com/");
        //click on borrowing tab
        ReusableMethods_Logger.clickMethod(driver, "//*[@aria-label='Borrowing main menu']", logger, "Borrowing tab");
        //click on auto buying resources
        ReusableMethods_Logger.clickMethod(driver, "//*[text()='Auto Buying Resources']", logger, "Auto buying resources link");

        //scroll to kbb section
        ReusableMethods_Logger.scrollToElementMethod(driver,"//*[text()='Other Car Buying Resources']", logger, "KBB link view");
        Thread.sleep(2000);
        //Click on visit KBB link
        ReusableMethods_Logger.clickMethod(driver,"//*[@title='Visit Kelley Blue Book']", logger, "KBB Link");
        Thread.sleep(2000);
        //get text of confirmation page
        String result = ReusableMethods_Logger.captureTextMethod(driver, "//*[contains(text(), 'LEAVE')]", logger, "Confirmation text");
        System.out.println("\n" + result);
        //click continue button
        ReusableMethods_Logger.clickMethod(driver, "//*[text()='Continue']", logger, "KBB confirmation continue button");
        Thread.sleep(2000);
    } // end of third party confirmation link class

    @Test
    public void googleMaps() throws InterruptedException {
        //navigate to branch locator page
        driver.navigate().to("https://www.huntington.com/branchlocator");
        //click on first branch location
        Thread.sleep(2000);
        ReusableMethods_Logger.clickMethod(driver, "//*[@class='locator-list__item__pin']", logger, "branch locator");
        Thread.sleep(5000);

        //store address for first branch in string
        String result = ReusableMethods_Logger.captureTextMethod(driver, "//*[@class='locator-list__item__address']", logger, "branch location icon");
        //hover over open in maps to see tooltip
        ReusableMethods_Logger.mouseHoverMethod(driver, "//*[@title='Open in Maps (Opens in new window)']",logger, "hover over open in maps link");
        Thread.sleep(3000);
        //click maps link
        ReusableMethods_Logger.clickMethod(driver, "//*[@class='locator-list__item__mapurl']",logger, "open in maps link");
        Thread.sleep(2000);

        //switch tab to google maps
        ReusableMethods_Logger.changeTabs(driver, 1, logger, "google maps new tab");
        //Store address in string
        String result2 = ReusableMethods_Logger.captureTextMethod(driver, "//*[@aria-label='Search Google Maps']", logger, "google maps address");
        //confirm google maps address matches address from branch locator page
        if (result.contains(result2)){
            System.out.println("google maps successfully searched correct location");
        } else {
            System.out.println("google maps didnt search same address");
        }

    } // end of google maps page class

    //change amount of monthly payment so you can see amount you can afford for car
     @Test
    public void automatedAssistant() throws InterruptedException {
       //navigate to huntington bank webpage
         driver.navigate().to("https://www.huntington.com/");
         //click on borrowing tab
         ReusableMethods_Logger.clickMethod(driver, "//*[@aria-label='Borrowing main menu']", logger, "Borrowing tab");
         //click on personal loans
         ReusableMethods_Logger.clickMethod(driver, "//*[text()='Personal Loans']", logger, "Personal Loans link");
         Thread.sleep(1000);
         //scroll to contact us section
         ReusableMethods_Logger.scrollToElementMethod(driver,"//h3[text()='Contact Us']", logger, "contact us section");
         Thread.sleep(2000);
         //click on ask us button
         ReusableMethods_Logger.clickMethod(driver, "//*[@title='Chat Online']", logger, "Ask Us Button");
         //print text of automated assistant
         String result = ReusableMethods_Logger.captureTextMethod(driver, "//*[@class='agentMsg']", logger, "automated assistant text");
         System.out.println("\n" + result);
    } // end of autoamated assistant class

    //verify system has time slot dropdown to call back
    @Test
    public void timeSlotDropdown() throws InterruptedException {
        //navigate to huntington bank webpage
        driver.navigate().to("https://www.huntington.com/");
        //click on borrowing tab
        ReusableMethods_Logger.clickMethod(driver, "//*[@aria-label='Borrowing main menu']", logger, "Borrowing tab");
        //click on payment assistance
        ReusableMethods_Logger.clickMethod(driver, "//*[text()='Payment Assistance']", logger, "Payment assistance link");
        Thread.sleep(1000);
        //scroll to request callback section
        ReusableMethods_Logger.scrollToElementMethod(driver,"//*[text()='Request a Callback']", logger, "request callback section");
        Thread.sleep(2000);
        //click on time slot button
        ReusableMethods_Logger.clickMethod(driver, "//*[@class='dropdown__selected-text']", logger, "time slot button");
       //select last dropdown
        ReusableMethods_Logger.clickMethod(driver, "//*[text()='5 p.m. -  7 p.m. ET']", logger, "5-7 pm time slot");
        Thread.sleep(1000);
    } // end of time slot dropdown class

} // end of class
