package base;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class BaseTests {
    protected FirefoxDriver driver;
    final String baseUrl = "https://www.saucedemo.com/";

    @BeforeTest
    public void setUp() {
//        System.setProperty("log4j.configurationFile", "resource/log4j2.xml");
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        driver = new FirefoxDriver();
    }

    @AfterClass
    public void tearDown() {
//        driver.quit();
//        driver.close();
    }
}
