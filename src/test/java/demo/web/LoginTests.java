package demo.web;


import org.ait.demo.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod

    public void ensurePrecondition() {
        if( !app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnLogOutButton();
        }
        app.getUser().clickOnLogInLink();
    }

    @Test
    public void LoginPositiveTest() {
        app.getUser().fillLoginForm(new User()
                .setEmail("petrov@gmail.com")
                .setPassword("Petrov123$"));
        app.getUser().clickOnLogInButton();
        Assert.assertTrue(app.getUser().isLogOutButtonPresent());
    }
    @Test
    public void LoginNegativeWithoutEmailTest() {
        app.getUser().fillLoginForm(new User().setPassword("Petrov123$"));
        app.getUser().clickOnLogInButton();
        Assert.assertTrue(app.getUser().isLoginLinkPresent());
    }


}
