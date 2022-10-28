package ecommerce.yourstore.ui.steps;

import ecommerce.yourstore.ui.pages.CreateAccount;
import ecommerce.yourstore.ui.utilities.DriverManager;
import ecommerce.yourstore.ui.utilities.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import java.util.List;
import java.util.Map;

public class CreateAccountSteps {
    private WebDriver webDriver;
    private DriverManager driverManager;
    private TestContext testContext;
    private CreateAccount createAccount;

    public CreateAccountSteps(){
        this.driverManager = new DriverManager();
        this.webDriver = driverManager.getWebDriverInstance();
        this.testContext = new TestContext();
        this.createAccount = new CreateAccount(webDriver);
    }

    @Given("User has the below details details for account creation")
    public void userHasTheBelowDetailsDetailsForAccountCreation(DataTable dataTable) {
        List<Map<String, String>> dataMap = dataTable.asMaps(String.class, String.class);
    }
}
