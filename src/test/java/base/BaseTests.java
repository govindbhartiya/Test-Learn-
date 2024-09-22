package base;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.Homepage;

import java.util.List;

public class BaseTests {

    protected WebDriver driver;
    protected Homepage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        homePage = new Homepage(driver);

    }

    @AfterClass
    public void setDone()
    {
        driver.quit();
    }

//    public static void main(String args[]){
//        BaseTests test = new BaseTests();
//        test.setUp();
//    }
}
