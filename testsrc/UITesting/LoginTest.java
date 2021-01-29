package UITesting;

import Util.OpenUrl;

import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;

public class LoginTest extends OpenUrl {

    Login login;
    @BeforeClass
    public void initLoginObject()
    {
         login = new Login(driver);
    }

    @Test
    public void txtUsernameCheckVisibility()
    {
        boolean expected = true;
        boolean actual = false;
         try {
             actual = login.txtUser.isDisplayed();
         }
         catch (Exception e)
         {

         }
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void txtUsernameCheckEnability()
    {
        boolean expected = true;
        boolean actual = false;
        try {
            actual = login.txtUser.isEnabled();
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected);
    }


    @Test
    public void txtUserWatermarkCheck()
    {
        String expected ="Email";
        String actual ="";

        try {
           actual = login.txtUser.getAttribute("placeholder");
        }
        catch (Exception e )
        {

        }
        Assert.assertEquals(actual,expected,"wrong watermark");
    }


    @Test
    public void lblLoginSpellCheck()
    {
        String expected = "Login";

        String actual="";

        try
        {
            actual = login.lblLogin.getText();
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected,"wrong spelling");
    }


    @Test
    public void lblEmalFontSizeCheck()
    {
        String expected = "14px";
        String actual="";

        try
        {
            actual = login.lblEmail.getCssValue("font-size");
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected,"wrong font size");

    }


    @Test
    public void lblEmailFontFamilyCheck()
    {
        String expected ="-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";
        String actual="";

        try
        {
            actual = login.lblEmail.getCssValue("font-family");
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected,"wrong font family");
    }

    @Test
    public void lblEmailFontCheck()
    {
        String expected ="sans-serif";
        String actual="";

        try
        {
            actual = login.lblEmail.getCssValue("font-family");
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }

      boolean result = actual.contains(expected);


        Assert.assertTrue(result,"wrong font");
    }


    @Test
    public void btnColorCheck() {
        String expected = "#2C8EDD";
        String actual = "";

        try {
            String colorRGB = login.btnLogin.getCssValue("background-color");

            actual = Color.fromString(colorRGB).asHex().toUpperCase();

            System.out.println("colorRGB=" + colorRGB);
            System.out.println("actual=" + actual);
        } catch (Exception e) {

        }


        Assert.assertEquals(actual, expected, "wrong color");

    }
}
