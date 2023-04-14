package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InventoryPage {

    private WebDriver driver;

    @FindBy(className = "inventory_item_name")
    private List<WebElement> itemNames;

    @FindBy(css = "select.product_sort_container")
    private WebElement sortDropdown;

    @FindBy(css = "option[value='za']")
    private WebElement sortZA;

    @FindBy(css = "option[value='az']")
    private WebElement sortAZ;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean areItemsSortedByName() {
        List<String> itemNamesText = new ArrayList<>();
        for (WebElement itemName : itemNames) {
            itemNamesText.add(itemName.getText());
        }
        List<String> sortedItemNames = new ArrayList<>(itemNamesText);
        Collections.sort(sortedItemNames);
        return sortedItemNames.equals(itemNamesText);
    }

    public void sortByNameZA() {
        sortDropdown.click();
        sortZA.click();
    }

    public void sortByNameAZ() {
        sortDropdown.click();
        sortAZ.click();
    }
}
