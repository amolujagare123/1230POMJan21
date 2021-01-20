package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

    @FindBy(xpath="//input[@name='email']")
    WebElement txtEmail;

    @FindBy(xpath = "//button[normalize-space()='Reset password']")
    WebElement btnRest;


    public ForgotPassword(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public void setTxtEmail(String email)
    {
        txtEmail.sendKeys(email);
    }

    public void clickReset()
    {
        btnRest.click();
    }

}
