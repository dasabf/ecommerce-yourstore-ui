package ecommerce.yourstore.ui.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DriverAction {
    private WebDriver driver;
    private Actions actions;

    public DriverAction(WebDriver driver){
        this.driver = driver;
    }

    public void click(By locator){
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public void sendKeys(By locator, String message){
        WebElement element = driver.findElement(locator);
        element.sendKeys(message);
    }

    public void hover(By locator){
        WebElement element = driver.findElement(locator);
        actions.moveToElement(element).perform();
    }

    public String getText(By locator){
        WebElement element = driver.findElement(locator);
        return element.getText();
    }

    public void selectDropDownByVisibleText(By locator, String message){
        Select dropDown = new Select(driver.findElement(locator));
        dropDown.selectByVisibleText(message);
    }

    public void selectDropDownByIndex(By locator, int index){
        Select dropDown = new Select(driver.findElement(locator));
        dropDown.deselectByIndex(index);
    }
}
