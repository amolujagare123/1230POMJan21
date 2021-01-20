package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    // WebDriver driver;
    // WebElement txtUser = driver.findElement(By.xpath("//input[@type='email']"));

    @FindBy(xpath = "//input[@type='email']")
    WebElement txtUser;

    @FindBy (xpath = "//input[@type='password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath="//a[normalize-space()='I forgot my password']")
    WebElement lnkForgotPassword;


    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public void clickForgotPassword()
    {
        lnkForgotPassword.click();
    }



    public void setTxtUser(String user)
    {
        txtUser.sendKeys(user);
    }

    public void setTxtPassword(String pass)
    {
        txtPassword.sendKeys(pass);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }
}
