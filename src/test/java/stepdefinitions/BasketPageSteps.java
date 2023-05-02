package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.BasketPage;
import utils.DriverManager;

public class BasketPageSteps {
    BasketPage basketPage = new BasketPage(DriverManager.getDriver());

    @Then("should see the Basket Page")
    public void shouldSeeTheBasketPage() {
    }
}


