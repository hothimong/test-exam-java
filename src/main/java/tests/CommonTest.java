package tests;

import cucumber.api.java.en.Given;
import runner.TestRunner;

public class CommonTest {
    @Given("^I open website(.*)$")
    public void openWebsite(String website) {
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
    }
}
