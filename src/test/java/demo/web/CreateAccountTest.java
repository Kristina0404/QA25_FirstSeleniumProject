package demo.web;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {


    @BeforeMethod

    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//a[text()= 'Register']"))) {
            driver.findElement(By.cssSelector(
                    "//a[text()= 'Log in']")).click();
        }
        driver.findElement(By.xpath("//a[text()= 'Register']")).click();
    }

    @Test
    public void newUserRegistrationPositiveTest() {
        //gender
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        //first name
        driver.findElement(By.xpath("//input[@id='FirstName']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).clear();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ivan");
        //last name
        driver.findElement(By.xpath("//input[@id='LastName']")).click();
        driver.findElement(By.xpath("//input[@id='LastName']")).clear();
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Ivanov");
        // email
        driver.findElement(By.xpath("//input[@id='Email']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).clear();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("haha@gmail.com");
        //password
        driver.findElement(By.xpath("//input[@id='Password']")).click();
        driver.findElement(By.xpath("//input[@id='Password']")).clear();
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Picacho123$");
        //confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).click();
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).clear();
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Picacho123$");
        // registration button
        driver.findElement(By.xpath("//input[@id='register-button']")).click();

        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/login']")));

    }
}
