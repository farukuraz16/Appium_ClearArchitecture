package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class BasketPage {
    ElementHelper elementHelper;
    By title = By.id("trendyol.com:id/textLeftUp");

    public BasketPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkTitle() {
    }

}
