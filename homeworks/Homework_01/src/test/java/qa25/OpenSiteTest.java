package qa25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    }
@Test
    public void OpenDemoWebShopTest () {
    System.out.println("Site opened!!");
}

@AfterMethod
    public void tearDown() {
        driver.close();
}
}
