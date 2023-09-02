package demo.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean isHomeComponentPresent() {
        return driver.findElements(
                By.xpath("//div[@id='nivo-slider']")).size() > 0;
    }

    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
    @AfterMethod()
    public void tearDown() {
        driver.quit();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
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

    public void fillLoginForm(String email, String password) {
        type(By.xpath("//input[@id='Email']"), email);
        type(By.xpath("//input[@id='Password']"), password);
    }

    public void clickOnLogo() {
        click(By.xpath("//div[@class='header-logo']"));
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

    public void clickOnCheckout() {
        click(By.xpath("//button[@id='checkout']"));
    }

    public void clickIAgree() {
        click(By.xpath("//input[@id='termsofservice']"));
    }

    public void clickOnCart() {
        click(By.xpath("//li[@id='topcartlink']"));
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
}


