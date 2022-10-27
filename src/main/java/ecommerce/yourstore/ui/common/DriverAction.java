package ecommerce.yourstore.ui.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverAction {
    private WebDriver driver;

    public DriverAction(WebDriver driver){
        this.driver = driver;
    }

    public void click(By locator){
        WebElement element = driver.findElement(locator);
        element.click();
    }
}
