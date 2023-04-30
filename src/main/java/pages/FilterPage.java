package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class FilterPage {
    ElementHelper elementHelper;

    By filterItem = By.id("trendyol.com:id/textViewFilterTitle");
    By listProductButton = By.id("trendyol.com:id/btnApplyFilter");
    By checkBoxfilterItem = By.id("trendyol.com:id/filterName");

    public FilterPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkFilterItem() {
        elementHelper.checkElement(filterItem);
    }

    public void clickFilterItem(String item) {
        elementHelper.clickElementWithText(filterItem, item);
    }

    public void clickCheckBoxFilterItem(String item) {
        elementHelper.clickNearElementWithText(checkBoxfilterItem, item);
    }

    public String getListProduct() {
        return elementHelper.getText(listProductButton);
    }

    public void clickListProduct() {
        elementHelper.click(listProductButton);
    }



}
