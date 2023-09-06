package demo.web;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    @Test
    public void isHomeComponentPresentTest() {

        Assert.assertTrue(app.getHomePage().isHomeComponentPresent());
    }

}
