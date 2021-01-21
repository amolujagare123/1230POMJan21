package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    WebElement dahsboard;

    @FindBy(xpath = "//span[normalize-space()='Clients']")
    WebElement clients;

    @FindBy(xpath = "//a[normalize-space()='Add Client']")
    WebElement addClients;

    @FindBy(xpath = "//a[normalize-space()='View Clients']")
    WebElement viewClients;

    @FindBy(xpath = "//span[normalize-space()='Quotes']")
    WebElement quotes;

    @FindBy(xpath = "//a[normalize-space()='Create Quote']")
    WebElement createQuote;

    @FindBy(xpath = "//a[normalize-space()='View Quotes']")
    WebElement viewQuotes;

    public Menu(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickDashboard()
    {
        dahsboard.click();
    }

    public void clickAddClient()
    {
        clients.click();
        addClients.click();
    }

    public  void clickViewClient()
    {
        clients.click();
        viewClients.click();
    }

    public void clickCreateQuotes()
    {
        quotes.click();
        createQuote.click();
    }

    public void clickViewQuotes()
    {
        quotes.click();
        viewQuotes.click();
    }

}
