package pages.clients;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {


    //int a =10;

    WebDriver driver;

    @FindBy(xpath = "//input[@id='client_name']")
    WebElement clientName;

    @FindBy(xpath = "//input[@id='client_surname']")
    WebElement clientSurname;

    @FindBy(xpath = "//span[@id='select2-client_language-container']")
    WebElement clientLanguage;

    @FindBy(xpath = "//input[@type='search']")
    WebElement searchBox;

    public void setLanguage(String language)
    {
        clientLanguage.click();
        searchBox.sendKeys(language);
        driver.findElement(By.xpath("//li[normalize-space()='"+language+"']")).click();
    }


    @FindBy(xpath = "//span[@id='select2-client_country-container']")
    WebElement containerCountry;

    public void setCountry(String country)
    {
        containerCountry.click();
        searchBox.sendKeys(country);
        driver.findElement(By.xpath("//li[normalize-space()='"+country+"']")).click();
    }

    @FindBy(xpath = "//span[@id='select2-client_gender-container']")
    WebElement genderContainer;

    public void setGender(String gender)
    {
        genderContainer.click();
        driver.findElement(By.xpath("//li[normalize-space()='"+gender+"']")).click();
    }

    @FindBy(xpath = "//input[@id='client_address_1']")
    WebElement clientAdd1;
    @FindBy(xpath = "//input[@id='client_address_2']")
    WebElement clientAdd2;
    @FindBy(xpath = "//input[@id='client_city']")
    WebElement clientCity;
    @FindBy(xpath = "//input[@id='client_state']")
    WebElement clientState;

    @FindBy(xpath = "//input[@id='client_zip']") WebElement clientZip;
    @FindBy(xpath = "//input[@id='client_phone']") WebElement clientPhone;
    @FindBy(xpath = "//input[@id='client_fax']") WebElement clientFax;
    @FindBy(xpath = "//input[@id='client_mobile']") WebElement clientMobile;
    @FindBy(xpath = "//input[@id='client_email']") WebElement clientEmail;
    @FindBy(xpath = "//input[@id='client_web']") WebElement clientWeb;
    @FindBy(xpath = "//input[@id='client_vat_id']") WebElement clientVat;
    @FindBy(xpath = "//input[@id='client_tax_code']") WebElement clientTax;



    @FindBy(xpath = "//input[@id='client_birthdate']")
    WebElement birthdate;

    public void setBirthdate(String setDateStr)
    {
      // 1. simply use sendkeys (if  it is editable)
      // birthdate.sendKeys(setDateStr);
        // 2. using Javascript executor - helpful if element is disabled /not editable

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','"+setDateStr+"')",birthdate);
    }


    @FindBy(xpath = "//button[@id='btn-submit']")
    WebElement clientSave;

    public AddClient(WebDriver driver) {

       this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void setClientName(String name) {
        clientName.sendKeys(name);
    }

    public void setClientSurname(String surname) {
        clientSurname.sendKeys(surname);
    }

    public void setClientAdd1(String add1) {
        clientAdd1.sendKeys(add1);
    }

    public void setClientAdd2(String add2) {
        clientAdd2.sendKeys(add2);
    }

    public void setClientCity(String city) {
        clientCity.sendKeys(city);
    }

    public void setClientState(String state) {
        clientState.sendKeys(state);
    }



    public void setClientZip(String zip) {
        clientZip.sendKeys(zip);
    }

    public void setClientPhone(String phone) {
        clientPhone.sendKeys(phone);
    }

    public void setClientFax(String fax) {
        clientFax.sendKeys(fax);
    }

    public void setClientMobile(String mobile) {
        clientMobile.sendKeys(mobile);
    }

    public void setClientEmail(String email) {
        clientEmail.sendKeys(email);
    }

    public void setClientWeb(String web) {
        clientWeb.sendKeys(web);
    }

    public void setClientVat(String vat) {
        clientVat.sendKeys(vat);
    }

    public void setClientTax(String tax) {
        clientTax.sendKeys(tax);
    }



    public void clickSave()
    {
        clientSave.click();
    }
}
