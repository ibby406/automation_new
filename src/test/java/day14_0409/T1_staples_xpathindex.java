package day14_0409;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethods_Logger;

public class T1_staples_xpathindex extends ReusableAnnotations {

    @Test(priority = 1)
    public void ClickOnThirdIphonByXpathIndex() throws InterruptedException {
        logger.log(LogStatus.INFO,"Navigate to Staples home page");
        //navigate to staples home page
        driver.navigate().to("https://www.staples.com");

        //type on search field using sendkeys method
        ReusableMethods_Logger.sendKeysMethod(driver,"//*[@id='searchInput']","iphone",logger,"Search Field");

        //click on the search icon
        ReusableMethods_Logger.clickMethod(driver,"//*[@class='search-bar-input__searchIcon']",logger,"Search Icon");

        //click on third image by xpath index
        Thread.sleep(4000);
        ReusableMethods_Logger.clickMethod(driver,"(//*[@class='standard-tile__image standard-tile__image_hover'])[3]",logger,"Iphone Image");

        Thread.sleep(2000);

    }//end of test 1
}
