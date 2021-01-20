package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

    static WebDriver myDriver;

    public static enum DriverType {
        CHROME,FIREFOX,INTERNETEXPLORER;
    }

    public static  WebDriver getDriver(DriverType d)
    {
        switch (d)
        {
            case CHROME: WebDriverManager.chromedriver().setup();
                         myDriver = new ChromeDriver();
                         break;

            case FIREFOX: WebDriverManager.firefoxdriver().setup();
                            myDriver = new FirefoxDriver();
                            break;

            case INTERNETEXPLORER: WebDriverManager.iedriver().setup();
                                    myDriver = new InternetExplorerDriver();
                                    break;
        }
            return myDriver;
    }
}
