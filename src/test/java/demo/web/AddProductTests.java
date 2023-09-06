package demo.web;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddProductTests extends TestBase {
    @BeforeMethod

    public void ensurePrecondition() {
        app.getProductHelp().product();
        if (!app.getProductHelp().isProductPresent()) {
            app.getHomePage().clickOnLogo();
        }
        addProductInCartTest();
    }

    @Test
    public void addProductInCartTest() {
        app.getProductHelp().messageToRecipientFromSender();
        Assert.assertTrue(app.getProductHelp().isShoppingCartPresent());

    }

   /*  @Test
    public void isProductInCartTest() {
        app.getProductHelp().clickOnCart();
        Assert.assertTrue(app.getProductHelp().isProductAdded());
        app.getProductHelp().clickIAgree();
        app.getProductHelp().clickOnCheckout();
        Assert.assertTrue(app.getProductHelp().isShoppingCartPresent());
    }*/


}
