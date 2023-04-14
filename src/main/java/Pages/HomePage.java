//package Pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class HomePage extends PageBase{
//
//    private WebDriver driver;
//    public HomePage(WebDriver driver){
//        super(driver);
//        this.driver = driver;
//    }
//
//    @FindBy(xpath = "/html/body/div/div/div[1]")
//    private WebElement formAuthentication;
//
//    public LoginPage viewLoginPage() throws InterruptedException {
//        Thread.sleep(5000);
//        formAuthentication.click();
//        return new LoginPage(driver);
//    }
//
//    public String getTitle() {
//        return driver.getTitle();
//    }
//
//}