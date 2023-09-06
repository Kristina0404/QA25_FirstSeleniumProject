package org.ait.demo.fw;

import org.ait.demo.fw.HelperBase;
import org.ait.demo.models.Registration;
import org.ait.demo.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnLinkRegisterButton() {
        click(By.xpath("//a[text()= 'Register']"));
    }

    public void clickOnLogInLink() {
        click(By.xpath("//a[text()='Log in']"));
    }

    public void clickOnLogOutButton() {
        click(By.xpath("//a[text()='Log out']"));
    }

    public boolean isLoginLinkPresent() {
        return isElementPresent(By.xpath("//a[text()='Log in']"));
    }

    public void clickOnLogInButton() {
        click(By.xpath("//input[@class='button-1 login-button']"));
    }

    public void fillLoginForm(User user) {
        type(By.xpath("//input[@id='Email']"), user.getEmail());
        type(By.xpath("//input[@id='Password']"), user.getPassword());
    }

    public boolean isLogOutButtonPresent() {
        return isElementPresent(By.xpath("//a[text()='Log out']"));
    }

    public boolean isLinkRegisterPresent() {
        return isElementPresent(By.xpath("//a[text()= 'Register']"));
    }

    public void fillRegistrationsForm(Registration registration) {
        click(By.xpath("//input[@id='gender-male']"));
        //first name
        type(By.xpath("//input[@id='FirstName']"), registration.getName());
        //last name
        type(By.xpath("//input[@id='LastName']"), registration.getSurname());
        // email
        fillLoginForm(new User().setEmail(registration.getEmail()).setPassword(registration.getEmail()));
        //confirm password
        type(By.xpath("//input[@id='ConfirmPassword']"), registration.getPassword());
        // registration button
        clickOnRegisterButton();
    }

    public void clickOnRegisterButton() {
        click(By.xpath("//input[@id='register-button']"));
    }
}
