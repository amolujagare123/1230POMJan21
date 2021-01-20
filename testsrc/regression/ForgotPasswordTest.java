package regression;

import Util.OpenUrl;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.Login;

import java.io.IOException;

import static utility.ConfigReader.getUrl;

public class ForgotPasswordTest extends OpenUrl {


    @Test
    public void forgotPasswordTest() throws IOException {

        // 2. click on forgot password button
        Login login = new Login(driver) ;
        login.clickForgotPassword();

        ForgotPassword forgotPassword = new ForgotPassword(driver);
        // 3. enter email id (on forgot password test)
        forgotPassword.setTxtEmail("amol@gmail.com");

        //4. click on reset button
        forgotPassword.clickReset();

    }


}
