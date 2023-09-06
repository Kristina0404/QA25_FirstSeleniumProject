package org.ait.demo.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends HelperBase {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isHomeComponentPresent() {
        return driver.findElements(
                By.xpath("//div[@id='nivo-slider']")).size() > 0;
    }

    public void clickOnLogo() {
        click(By.xpath("//div[@class='header-logo']"));
    }

    public boolean isPageTitlePresent() {
        return isElementPresent(By.xpath("//div[@class = 'page-title']"));
    }
}
