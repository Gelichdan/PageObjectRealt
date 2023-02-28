package tests.base;

import common.CommonAction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.listing.ListingPage;
import pages.realthome.RealtHomePage;

import java.time.Duration;
import java.util.Set;

import static common.CommonAction.stopWebDriver;

public class BaseTest {
    protected WebDriver driver = CommonAction.setWebDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected ListingPage listingPage = new ListingPage(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    protected void switchToAllert() {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

    }

    protected void switchWindow() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String window1 = driver.getWindowHandle();
        js.executeScript("window.open()");
        Set<String> currentWindows = driver.getWindowHandles();

        String window2 = null;
        for (String window : currentWindows) {
            if (!window.equals(window1)) {
                window2 = window;
                break;
            }
        }
        driver.switchTo().window(window2);
    }

    @AfterSuite(alwaysRun = true)
    protected void closeDriver() {
        stopWebDriver();
    }
}
