package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.*;
public class PageBase {
    public static WebDriver driver;

    public static final Duration WAIT = ofSeconds(30);

    void clickElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }


    //constructor
    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // method to wait for element visibility
    public static void waitForVisibility(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //method for clicking
    public void click(WebElement element) {
        waitForVisibility(element);
        element.click();
    }

}
