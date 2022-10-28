package ecommerce.yourstore.ui.pages;

import ecommerce.yourstore.ui.common.DriverAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * The type Home page.
 */
public class HomePage {
    private WebDriver driver;
    private DriverAction driverAction;

    /**
     * Instantiates a new Home page.
     *
     * @param driver the driver
     */
    public HomePage(WebDriver driver){
        this.driver = driver;
        this.driverAction = new DriverAction(this.driver);
    }

    private By signIn = By.xpath("//a[@class='login']");
    private By contactUs = By.xpath("//a[@title='Contact Us']");
    private By searchBar = By.xpath("//input[@id='search_query_top']");
    private By searchBtn = By.xpath("//*[@name='submit_search']");
    private By womenDress = By.xpath("//a[@title='Women']");
    private By dresses = By.xpath("//div[@id='block_top_menu']/ul/li[2]/a");
    private By tshirt = By.xpath("//div[@id='block_top_menu']/ul/li[3]/a");

    /**
     * Click sign in.
     */
    public void clickSignIn(){
        driverAction.click(signIn);
    }

    /**
     * Click contact us.
     */
    public void clickContactUs(){
        driverAction.click(contactUs);
    }

    /**
     * Send keys in search bar.
     *
     * @param query the query
     */
    public void sendKeysInSearchBar(String query){
        driverAction.sendKeys(searchBar, query);
    }

    /**
     * Click search btn.
     */
    public void clickSearchBtn(){
        driverAction.click(searchBtn);
    }

    /**
     * Hover over women dress.
     */
    public void hoverOverWomenDress(){
        driverAction.hover(womenDress);
    }

    /**
     * Click on women tshit.
     */
    public void clickOnWomenTshit(){
        driverAction.click(tshirt);
    }
}
