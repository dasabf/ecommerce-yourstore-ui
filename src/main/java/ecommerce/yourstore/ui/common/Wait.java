package ecommerce.yourstore.ui.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
    private WebDriver driver;
    private WebDriverWait wait;

    public Wait(WebDriver driver){
        this.driver = driver;
    }

    public void initializeWait(int seconds){
        wait = new WebDriverWait(this.driver, seconds);
    }

    public void waitForElementToBeClickable(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForElementToBeSelected(By locator){
        wait.until(ExpectedConditions.elementToBeSelected(locator));
    }
}
