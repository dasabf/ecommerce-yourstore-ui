package ecommerce.yourstore.ui.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private WebDriver driver;
    private TestContext testContext = new TestContext();
    public WebDriver getWebDriverInstance(){
        return this.driver;
    }
    public void initializeBrowser(){
        System.setProperty("webdriver.chrome.driver", testContext
                .getValueFromProperties("chromeDriverLocation"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void deleteAllCookies(){
        driver.manage().deleteAllCookies();
    }
    public void openHomePage(){
        driver.get(testContext.getValueFromProperties("homePageUrl"));
    }
}
