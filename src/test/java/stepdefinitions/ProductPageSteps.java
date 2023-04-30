package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasketPage;
import utils.DriverManager;

public class ProductPageSteps {
    BasketPage buttonsPage = new BasketPage(DriverManager.getDriver());

    @Then("should see the Product Page")
    public void shouldSeeTheProductPage() {
    }

    @When("save Product Name on Product Page")
    public void saveProductNameOnProductPage() {
    }

    @And("taps Add To Basket {string} on Product Page")
    public void tapsAddToBasketOnProductPage(String arg0) {
    }

    @And("taps Size {string} on Product Page")
    public void tapsSizeOnProductPage(String arg0) {
    }

    @And("taps Size Add to Basket on Product Page")
    public void tapsSizeAddToBasketOnProductPage() {
    }
}
