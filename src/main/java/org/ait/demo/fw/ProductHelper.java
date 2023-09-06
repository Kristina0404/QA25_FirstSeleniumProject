package org.ait.demo.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductHelper extends HelperBase{
    public ProductHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isProductPresent() {
        return isElementPresent(By.xpath("//h1"));
    }

    public void messageToRecipientFromSender() {
        type(By.xpath("// input[@id='giftcard_2_RecipientName']"),"Ivan");
        type(By.xpath("// input[@id='giftcard_2_RecipientEmail']"),"ivanov@gmail.com");
        type(By.xpath("// input[@id='giftcard_2_SenderName']"),"Petrov");
        type(By.xpath("// input[@id='giftcard_2_SenderEmail']"),"petrov@gmail.com");
        type(By.xpath("// textarea[@id='giftcard_2_Message']"),"Have a nice day!");
        click(By.xpath("//input[@id='add-to-cart-button-2']"));
    }

    public boolean isProductAdded(String text) {
        List<WebElement> products = driver.findElements(By.xpath(
                "//a[@class='product-name']"));
        for(WebElement el: products){
            if(el.getText().contains(text))
                return true;
        }
        return false;
    }

    public void product() {
        click(By.xpath(
                "//img[@src=" +
                        "'https://demowebshop.tricentis.com/" +
                        "content/images/thumbs/0000015_25-virtual-gift-card_125.jpeg']"));
    }

    public boolean isShoppingCartPresent() {
        return isElementPresent(By.xpath("//li[@id='topcartlink']"));
    }

    public boolean isResultPresent() {
        return isElementPresent(By.cssSelector(".result"));
    }

    /* public void clickOnCheckout() {
        click(By.xpath("//button[@id='checkout']"));
    }

    public void clickIAgree() {
        click(By.xpath("//input[@id='termsofservice']"));
    }

    public void clickOnCart() {
        click(By.xpath("//li[@id='topcartlink']"));
    }

   public boolean isProductAdded() {
        return isProductAdded("$25 Virtual Gift Card");
    }*/
}
