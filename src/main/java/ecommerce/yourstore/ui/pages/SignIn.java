package ecommerce.yourstore.ui.pages;

import ecommerce.yourstore.ui.common.DriverAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * The type Sign in.
 */
public class SignIn {
    private WebDriver driver;
    private DriverAction driverAction;

    /**
     * Instantiates a new Sign in.
     *
     * @param driver the driver
     */
    public SignIn(WebDriver driver){
        this.driver = driver;
        driverAction = new DriverAction(this.driver);
    }

    private By createAccountEmailTxtBox = By.xpath("//input[@id='email_create']");
    private By createAccountBtn = By.xpath("//button[@id='SubmitCreate']");
    private By signInEmailTxtBox = By.xpath("//input[@id='email']");
    private By signInPasswordTxtBox = By.xpath("//input[@id='passwd']");
    private By forgetPasswordLink = By.xpath("//a[@title='Recover your forgotten password']");
    private By signInBtn = By.xpath("//button[@id='SubmitLogin']");

    /**
     * Send email id to create account.
     *
     * @param email the email
     */
    public void sendEmailIDToCreateAccount(String email) {
        driverAction.sendKeys(createAccountEmailTxtBox, email);
    }

    /**
     * Click on create account.
     */
    public void clickOnCreateAccount(){
        driverAction.click(createAccountBtn);
    }

    /**
     * Send email id to sign in.
     *
     * @param email the email
     */
    public void sendEmailIDToSignIn(String email){
        driverAction.sendKeys(signInEmailTxtBox, email);
    }

    /**
     * Send password to sign in.
     *
     * @param password the password
     */
    public void sendPasswordToSignIn(String password){
        driverAction.sendKeys(signInPasswordTxtBox, password);
    }

    /**
     * Click on forgot password.
     */
    public void clickOnForgotPassword(){
        driverAction.click(forgetPasswordLink);
    }

    /**
     * Click on sign in.
     */
    public void clickOnSignIn(){
        driverAction.click(signInBtn);
    }
}
