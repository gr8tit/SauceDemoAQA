package base;

import Pages.InventoryPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortItemsTests extends BaseTests {

    @Test
    public void testSortItemsByName() {
        // Step 1: Go to the site.
        driver.get(baseUrl);

        // Step 2: Log in to the site.
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Step 3: Verify that the items are sorted by Name ( A -> Z ).
        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertTrue(inventoryPage.areItemsSortedByName(), "Items are not sorted by name (A -> Z)");

        // Step 4: Change the sorting to Name ( Z -> A ).
        inventoryPage.sortByNameZA();
    }

}