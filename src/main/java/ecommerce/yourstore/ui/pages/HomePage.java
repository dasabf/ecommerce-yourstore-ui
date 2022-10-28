package ecommerce.yourstore.ui.pages;

import ecommerce.yourstore.ui.common.DriverAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private DriverAction driverAction;

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.driverAction = new DriverAction(driver);
    }

    private By signIn = By.xpath("//a[@class='login']");
    private By contactUs = By.xpath("//a[@title='Contact Us']");
    private By searchBar = By.xpath("//input[@id='search_query_top']");
    private By searchBtn = By.xpath("//*[@name='submit_search']");
    private By womenDress = By.xpath("//a[@title='Women']");
    private By dresses = By.xpath("//div[@id='block_top_menu']/ul/li[2]/a");
    private By tshirt = By.xpath("//div[@id='block_top_menu']/ul/li[3]/a");

    public void clickSignIn(){
        driverAction.click(signIn);
    }

    public void clickContactUs(){
        driverAction.click(contactUs);
    }

    public void sendKeysInSearchBar(String query){
        driverAction.sendKeys(searchBar, query);
    }

    public void clickSearchBtn(){
        driverAction.click(searchBtn);
    }

    public void hoverOverWomenDress(){
        driverAction.hover(womenDress);
    }


}
