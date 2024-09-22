package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    private WebDriver driver;
    private By searchBox = By.id("twotabsearchtextbox");
    private By searchButton = By.xpath("//*[@id=\"nav-search-submit-text\"]");


    public void searchProduct(String product)
    {
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(product);
    }

    public ProductPage clickSearchBox()
    {
        driver.findElement(searchButton).click();
        return new ProductPage(driver);
    }

    public Homepage(WebDriver driver){
        this.driver=driver;
    }
}
