package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends ProviderTest {
    @When("^I input username as (.*)$")
    public void selectUserName(String username) {
        getLoginPage().setUsername(username);
    }

    @When("^I input password as (.*)$")
    public void selectPassword(String password) {
        getLoginPage().setPassword(password);
    }

    @Then("^I click submit$")
    public void submit() {
        getLoginPage().clicksubmit();
    }
}
