package demo.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AddProductTest extends TestBase{
    @BeforeMethod

    public void ensurePrecondition() {
            click(By.xpath("//a[@title= 'Show details for 14.1-inch Laptop']"));
            if(isElementPresent(By.xpath("//h1"))){
                click(By.xpath("//input[@id='add-to-cart-button-31']"));

            }
    }
    @Test
    public void addProductTest() {
        click(By.xpath("//li[@id='topcartlink']"));
        Assert.assertTrue(isProductAdded("14.1-inch Laptop"));
        click(By.xpath("//input[@id='termsofservice']"));
        click(By.xpath("//button[@id='checkout']"));
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='page-title']")));
    }
    public boolean isProductAdded(String text) {
        List<WebElement> products = driver.findElements(By.xpath("//a[@class ='product-name']"));
        for(WebElement el: products){
            if(el.getText().contains(text))
                return true;
        }
        return false;
    }


}
