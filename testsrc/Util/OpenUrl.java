package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import utility.Driver;


import java.io.IOException;

import static utility.ConfigReader.getUrl;
import static utility.Driver.DriverType.CHROME;
import static utility.Driver.DriverType.FIREFOX;
import static utility.Driver.getDriver;

public class OpenUrl {

    public static WebDriver driver;


    @BeforeClass
    public void openUrl() throws IOException {

        driver = getDriver(CHROME);
        driver.manage().window().maximize();
        driver.get(getUrl());
    }

}
