package tests.searchappartments;

import org.testng.annotations.Test;
import tests.base.BaseTest;

@Test
public class SearchApartTest extends BaseTest {
    public void checkIsRedirectToListing() {
        basePage.open("https://realt.by/");

        realtHomePage.
                enterCountRoom().
                clickToFind();
        listingPage.
                checkCounts();

    }
}
