package utils;

import com.google.common.collect.Comparators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ElementHelper {

    private WebDriver driver;
    private WebDriverWait wait;

    public ElementHelper(WebDriver driver) {
        String time = ConfigReader.getProperty("wait");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(time)));
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

}
