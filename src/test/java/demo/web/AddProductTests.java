package demo.web;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddProductTests extends TestBase {
    @BeforeMethod

    public void ensurePrecondition() {
        product();
        if (!isProductPresent()) {
            clickOnLogo();
        }
        addProductInCartTest();
    }

    @Test
    public void addProductInCartTest() {
        messageToRecipientFromSender();
        Assert.assertTrue(isElementPresent(By.xpath("//li[@id='topcartlink']")));

    }

    @Test
    public void isProductInCartTest() {
        clickOnCart();
        Assert.assertTrue(isProductAdded("$25 Virtual Gift Card"));
        clickIAgree();
        clickOnCheckout();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class = 'page-title']")));
    }


}
