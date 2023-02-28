package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class ListingPage extends BasePage {
    public ListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class='listing view-format']/div[not(@class='listing-item')]");

    public ListingPage checkCounts() {
        waitElementIsVisible(driver.findElement(card));
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 20);
        return this;
    }
}
