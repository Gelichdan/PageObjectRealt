package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.listing.ListingPage;

public class RealtHomePage extends BasePage {
    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    By countRooms = By.xpath("//select[@id='rooms']");
    By optionTwoRooms = By.xpath("//select[@id='rooms']/option[@value='2']");
    By findBtn = By.xpath("//div[@id='residentialInputs']//a[@class='common-search-submit btn btn-primary']");

    public RealtHomePage enterCountRoom() {
        driver.findElement(countRooms).click();
        driver.findElement(optionTwoRooms).click();

        return this;
    }

    public ListingPage clickToFind() {
        waitElementIsVisible(driver.findElement(findBtn));
        driver.findElement(findBtn).click();
        return new ListingPage(driver);
    }

}

