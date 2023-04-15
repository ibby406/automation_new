package Action_Item;


import org.openqa.selenium.WebDriver;
import reusableLibrary.reusableMethods;

public class AI4 {
    public static void main(String[] args) throws InterruptedException {


        //set up the chrome driver
        WebDriver driver = reusableMethods.defineChromeDriver();

        //navigate to bestbuy website
        driver.navigate().to("https:bestbuy.com");

        //wait 1  second
        Thread.sleep(1000);

        //type on search field using sendkeys method

        reusableMethods.sendKeysMethod(driver, "//*[@class='search-input']", "iphone", "Search Field");

        //click on the search icon
        reusableMethods.clickMethod(driver, "//*[@class='header-search-icon']", "Search Icon");

        //select dropdown to filter by best selling
        Thread.sleep(2000);
        reusableMethods.selectByText(driver,"//*[@class='tb-select']", "Best Selling", "best selling dropdown");

        //click on first iphone link
        Thread.sleep(3000);
        reusableMethods.clickMethod(driver, "//*[@class='sku-title']", "first iphone");

        //scroll down to learn about total tech
        Thread.sleep(6000);
        reusableMethods.scrollToElementMethod(driver,"//*[@class='shop-paid-membership-banner']", "total tech");

        //click on add to cart button
        reusableMethods.clickMethod(driver, "//*[@data-button-state='ADD_TO_CART']", "add to cart button");

        //get text of add to cart
        Thread.sleep(3000);
        String result = reusableMethods.captureTextMethod(driver, "//*[@class='shop-cart-subtotal']", "cart total");

        //split text of add to cart by price
        Thread.sleep(2000);
        String[] arrayMessage = result.split(":");

        //print out price
        Thread.sleep(4000);
        System.out.println("Price is: " + arrayMessage[1]);

        //mouse hover to continue shopping
        Thread.sleep(2000);
        reusableMethods.mouseHoverMethod(driver, "//*[text()='Continue shopping']", "continue shopping -pop up");

        //click on continue shopping
        Thread.sleep(3000);
        reusableMethods.clickMethod(driver,"//*[text()='Continue shopping']", "continue shopping button click" );
    }

}