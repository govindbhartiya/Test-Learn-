package seach;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ProductPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class searchProducts extends BaseTests {


    @Test(dataProvider = "demo")
    public void testSuccessfulSearch(String name){
        homePage.searchProduct(name);
        ProductPage productPage = homePage.clickSearchBox();

        List<WebElement> allDivs = driver.findElements(By.cssSelector(".a-section .puisg-row .puis-list-col-right"));
        //System.out.println("The titles are : "+ allDivs.size());

        List<String> Products = new ArrayList<>();
        List<String> Prices = new ArrayList<>();
        for(WebElement e: allDivs){
            WebElement title = e.findElement(By.cssSelector(".a-text-normal"));
            String titleName = title.getText();
            Products.add(titleName);
            //System.out.println(title.getText());
            WebElement price = e.findElement(By.cssSelector(".a-price"));
            String priceTag = price.getText();
            Prices.add(priceTag.substring(1));
            //System.out.println(price.getText());
        }

        for(String phone: Products){
            System.out.println(phone);
        }
        for(String cost: Prices){
            System.out.println(cost);
        }

        //assertTrue(productPage.getAlertText().contains("Results"),"failed");
    }
    @DataProvider(name = "demo")
    public Object[] getdata(){
        return  new Object[]{"Apple","Samsung","Oneplus"};
    }
}
