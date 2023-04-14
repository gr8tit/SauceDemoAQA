package base;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SauceDemoTests {
//    private static final Logger logger = LogManager.getLogger(SauceDemoTests.class);
    private FirefoxDriver driver;
    private final String baseUrl = "https://www.saucedemo.com/";
    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
        driver = new FirefoxDriver();
    }

    @BeforeMethod
    public void navigateToLoginPage() {
        driver.get(baseUrl);
        loginPage = new LoginPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testSortItemsByName() {
        //Test Reporter log4j
//        logger.info("Starting testSortItemsByName");
        // Step 1: Log in to the site.
        loginPage.login("standard_user", "secret_sauce");

         //Step 2: Wait for the page to load and the items to be visible
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_list")));

        // Step 3: Verify that the items are sorted by Name ( A -> Z ).
        List<WebElement> itemNames = driver.findElements(By.className("inventory_item_name"));
        List<String> itemNamesText = new ArrayList<>();
        for (WebElement itemName : itemNames) {
            itemNamesText.add(itemName.getText());
        }
        List<String> sortedItemNames = new ArrayList<>(itemNamesText);
        Collections.sort(sortedItemNames);
        assert sortedItemNames.equals(itemNamesText) : "Items are not sorted by name";

        //Finishing test
//        logger.info("Finished testSortItemsByName");
    }
}





//package base;
//
//import Pages.LoginPage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class SauceDemoTests extends BaseTests {
//    private LoginPage loginPage;
//
//    @BeforeMethod
//    public void navigateToLoginPage() {
//        driver.get(baseUrl);
//        this.driver();
//        loginPage = new LoginPage(driver);
//    }
//
//    @Test
//    public void testSortItemsByName() throws InterruptedException {
//        // Step 2: Log in to the site.
//        loginPage.login("standard_user", "secret_sauce");
//
//        // Wait for the page to load and the items to be visible
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_list")));
//
//
//
//        // Verify that the items are sorted by Name ( A -> Z ).
//        List<WebElement> itemNames = driver.findElements(By.className("inventory_item_name"));
//        List<String> itemNamesText = new ArrayList<>();
//        for (WebElement itemName : itemNames) {
//            itemNamesText.add(itemName.getText());
//        }
//        List<String> sortedItemNames = new ArrayList<>(itemNamesText);
//        Collections.sort(sortedItemNames);
//        assert sortedItemNames.equals(itemNamesText) : "Items are not sorted by name";
//    }
//}
