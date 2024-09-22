package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    private By statusAlert = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/span/div/div/h2");

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
