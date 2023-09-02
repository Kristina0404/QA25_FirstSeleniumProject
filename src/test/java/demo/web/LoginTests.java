package demo.web;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod

    public void ensurePrecondition() {
        if( !isElementPresent(By.xpath("//a[text()='Log in']"))) {
       click(By.xpath("//a[text()='Log out']"));
   }
        click(By.xpath("//a[text()='Log in']"));
    }

    @Test
    public void LoginPositiveTest() {
        type(By.xpath("//input[@id='Email']"), "petrov@gmail.com");
        type(By.xpath("//input[@id='Password']"), "Petrov123$");
        click(By.xpath("//input[@class='button-1 login-button']"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[text()='Log out']")));
    }
}
