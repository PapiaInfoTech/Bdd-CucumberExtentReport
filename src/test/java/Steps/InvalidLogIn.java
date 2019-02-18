package Steps;

import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.support.PageFactory;
import pageobject.LoginPage;

public class InvalidLogIn extends ApplicationPageBase {

    LoginPage obojOfLogInPage = PageFactory.initElements(driver,LoginPage.class);

    @Given("^User has to be in log in page$")
    public void user_has_to_be_in_log_in_page() throws Throwable {


    }

    @When("^Try log in by invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void try_log_in_by_invalid_and(String arg1, String arg2) throws Throwable {
        obojOfLogInPage.login(arg1,arg2);
    }

    @Then("^Unable to log in$")
    public void unable_to_log_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }





}