package qa25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenSiteTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        /// driver.get("https://demowebshop.tricentis.com/");
        driver.navigate().to("https://demowebshop.tricentis.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void OpenDemoWebShopTest() {
        System.out.println("Site opened!!");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void siteByCssTest() {
        driver.findElement(By.cssSelector(".header-menu"));
        driver.findElement(By.cssSelector(".nivoSlider"));
        driver.findElement(By.cssSelector("[href='/books']"));
        driver.findElement(By.cssSelector(".master-wrapper-main.rightside-3.block block-newsletter.title"));
        driver.findElement(By.cssSelector("[name='NewsletterEmail']"));
        driver.findElement(By.cssSelector("#subscribe-loading-progress"));
        driver.findElement(By.cssSelector("[href='https://www.tricentis.com/speed/']"));
        driver.findElement(By.cssSelector("[title^='Speed']"));
        driver.findElement(By.cssSelector("[class$='default']"));
        driver.findElement(By.cssSelector(".poll-display-text"));
        driver.findElement(By.cssSelector("[id*='pollanswer'"));
        driver.findElement(By.cssSelector("#poll-voting-progress-1"));
        driver.findElement(By.cssSelector(".nivo-imageLink"));
    }
    @Test
    public void findElementXpathTest(){
        driver.findElement(By.xpath("//div[@class='header-menu']"));
        driver.findElement(By.xpath("//span[@id='subscribe-loading-progress']"));
        driver.findElement(By.xpath("//span[@id='poll-voting-progress-1']"));
        driver.findElement(By.xpath("//div[@class='nivoSlider']"));
        driver.findElement(By.xpath("//h2[contains(.,'Welcome to our store')]"));
        driver.findElement(By.xpath("//p[contains(.,'Welcome to the new Tricentis store')]"));
        driver.findElement(By.xpath("//input[@name='q']"));
        driver.findElement(By.xpath("//div[@class='search-box']"));
        driver.findElement(By.xpath("//form[@action='/search']"));
    }
}
