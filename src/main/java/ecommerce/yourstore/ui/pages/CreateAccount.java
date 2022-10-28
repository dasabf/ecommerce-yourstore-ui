package ecommerce.yourstore.ui.pages;

import ecommerce.yourstore.ui.common.DriverAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * The type Create account.
 */
public class CreateAccount {
    private final WebDriver driver;
    private final DriverAction driverAction;

    /**
     * Instantiates a new Create account.
     *
     * @param driver the driver
     */
    public CreateAccount(WebDriver driver){
        this.driver = driver;
        this.driverAction = new DriverAction(this.driver);
    }

    private final By titleMrRadio = By.xpath("//input[@id='id_gender1']");
    private final By titleMrsRadio = By.xpath("//input[@id='id_gender2']");
    private final By firstNameTxtBox = By.xpath("//input[@id='customer_firstname']");
    private final By lastNameTxtBox = By.xpath("//input[@id='customer_lastname']");
    private final By emailTxtBox = By.xpath("//input[@id='email']");
    private final By passwordTxtBox = By.xpath("//input[@id='passwd']");
    private final By selectDays = By.xpath("//select[@id='days']");
    private final By selectMonths = By.xpath("//select[@id='months']");
    private final By selectYears = By.xpath("//select[@id='years']");
    private final By signUpForNewsLetter = By.xpath("//input[@id='newsletter']");
    private final By specialOffers = By.xpath("//input[@id='optin']");
    private final By addressFirstName = By.xpath("//input[@id='firstname']");
    private final By addressLastName = By.xpath("//input[@id='lastname']");
    private final By addressCompany = By.xpath("//input[@id='company']");
    private final By addressLine1 = By.xpath("//input[@id='address1']");
    private final By addressCity = By.xpath("//input[@id='city']");
    private final By addressState = By.xpath("//select[@id='id_state']");
    private final By addressPinCode = By.xpath("//input[@id='postcode']");
    private final By addressCountry = By.xpath("//select[@id='id_country']");
    private final By addressMobile = By.xpath("//input[@id='phone_mobile']");
    private final By addressAlias = By.xpath("//input[@id='alias']");
    private final By registerBtn = By.xpath("//button[@id='submitAccount']");

    /**
     * Click mr radio btn.
     */
    public void clickMrRadioBtn(){
       driverAction.click(titleMrRadio);
    }

    /**
     * Click mrs radio btn.
     */
    public void clickMrsRadioBtn(){
        driverAction.click(titleMrsRadio);
    }

    /**
     * Set first name txt box.
     *
     * @param message the message
     */
    public void setFirstNameTxtBox(String message){
        driverAction.sendKeys(firstNameTxtBox, message);
    }

    /**
     * Set last name txt box.
     *
     * @param message the message
     */
    public void setLastNameTxtBox(String message){
        driverAction.sendKeys(lastNameTxtBox, message);
    }

    /**
     * Set email txt box.
     *
     * @param message the message
     */
    public void setEmailTxtBox(String message){
        driverAction.sendKeys(emailTxtBox, message);
    }

    /**
     * Set password txt box.
     *
     * @param message the message
     */
    public void setPasswordTxtBox(String message){
        driverAction.sendKeys(passwordTxtBox, message);
    }

    /**
     * Set day.
     *
     * @param day the day
     */
    public void setDay(String day){
        driverAction.selectDropDownByVisibleText(selectDays, day);
    }

    /**
     * Set month.
     *
     * @param month the month
     */
    public void setMonth(int month){
        driverAction.selectDropDownByIndex(selectMonths, month);
    }

    /**
     * Set year.
     *
     * @param year the year
     */
    public void setYear(String year){
        driverAction.selectDropDownByVisibleText(selectYears, year);
    }

    /**
     * Click sign up news letter.
     */
    public void clickSignUpNewsLetter(){
        driverAction.click(signUpForNewsLetter);
    }

    /**
     * Click special offers.
     */
    public void clickSpecialOffers(){
        driverAction.click(specialOffers);
    }

    /**
     * Set address first name.
     *
     * @param message the message
     */
    public void setAddressFirstName(String message){
        driverAction.sendKeys(addressFirstName, message);
    }

    /**
     * Set address last name.
     *
     * @param message the message
     */
    public void setAddressLastName(String message){
        driverAction.sendKeys(addressLastName, message);
    }

    /**
     * Set address company.
     *
     * @param message the message
     */
    public void setAddressCompany(String message){
        driverAction.sendKeys(addressCompany, message);
    }

    /**
     * Set address line 1.
     *
     * @param message the message
     */
    public void setAddressLine1(String message){
        driverAction.sendKeys(addressLine1, message);
    }

    /**
     * Set address city.
     *
     * @param message the message
     */
    public void setAddressCity(String message){
        driverAction.sendKeys(addressCity, message);
    }

    /**
     * Set address state.
     *
     * @param message the message
     */
    public void setAddressState(String message){
        driverAction.selectDropDownByVisibleText(addressState, message);
    }

    /**
     * Set address pin code.
     *
     * @param message the message
     */
    public void setAddressPinCode(String message){
        driverAction.sendKeys(addressPinCode, message);
    }

    /**
     * Set address country.
     *
     * @param message the message
     */
    public void setAddressCountry(String message){
        driverAction.selectDropDownByVisibleText(addressCountry, message);
    }

    /**
     * Set address mobile.
     *
     * @param message the message
     */
    public void setAddressMobile(String message){
        driverAction.sendKeys(addressMobile, message);
    }

    /**
     * Set address alias.
     *
     * @param message the message
     */
    public void setAddressAlias(String message){
        driverAction.sendKeys(addressAlias, message);
    }

    public void clickRegister(){
        driverAction.click(registerBtn);
    }
}
