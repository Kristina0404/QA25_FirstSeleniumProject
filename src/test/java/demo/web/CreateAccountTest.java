package demo.web;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {


    @BeforeMethod

    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//a[text()= 'Register']"))) {
            click(By.cssSelector(
                    "//a[text()= 'Log in']"));
        }
        click(By.xpath("//a[text()= 'Register']"));
    }

    @Test
    public void newUserRegistrationPositiveTest() {
        //gender
        click(By.xpath("//input[@id='gender-male']"));
        //first name
        type(By.xpath("//input[@id='FirstName']"), "Petr");
        //last name
        type(By.xpath("//input[@id='LastName']"), "Petrov");
        // email
        fillLoginForm("petrov@gmail.com", "Petrov123$");
        //confirm password
        type(By.xpath("//input[@id='ConfirmPassword']"), "Petrov123$");
        // registration button
        click(By.xpath("//input[@id='register-button']"));

        Assert.assertTrue(isElementPresent(By.cssSelector(".result")));

    }

}
