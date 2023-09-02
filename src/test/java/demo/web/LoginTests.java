package demo.web;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod

    public void ensurePrecondition() {
        if( !isLoginLinkPresent()) {
            clickOnLogOutButton();
        }
        clickOnLogInLink();
    }

    @Test
    public void LoginPositiveTest() {
        fillLoginForm("petrov@gmail.com", "Petrov123$");
        clickOnLogInButton();
        Assert.assertTrue(isElementPresent(By.xpath("//a[text()='Log out']")));
    }

}
