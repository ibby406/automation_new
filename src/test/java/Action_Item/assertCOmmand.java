package Action_Item;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class assertCOmmand {


    public class Test {

        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            //System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.navigate().to("https://www.inviul.com");
            String actualTitle = driver.getTitle();
            driver.manage().window().maximize();
            String expectedTitle = "Avinash Mishra Blogger: Learn Selenium WebDriver, Automation Framework, QA, SEO & Digital Marketing | Inviul Blog | Inviul";
            Assert.assertEquals("Condition true", actualTitle, expectedTitle);

            driver.close();
            driver.quit();

        }
    }
}