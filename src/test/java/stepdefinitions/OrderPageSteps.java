package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasketPage;
import utils.DriverManager;

public class OrderPageSteps {
    BasketPage buttonsPage = new BasketPage(DriverManager.getDriver());

    @Then("should see the Order Page")
    public void shouldSeeTheOrderPage() {
    }

    @When("taps Option {string} on Order Page")
    public void tapsOptionOnOrderPage(String arg0) {
    }
}
