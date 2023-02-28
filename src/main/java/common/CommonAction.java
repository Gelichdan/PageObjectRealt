package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import static common.Config.PLATFORM_AND_BROWSER;

public class CommonAction {
    private static WebDriver driver;

    public static WebDriver setWebDriver() {
        if (driver == null) {
            switch (PLATFORM_AND_BROWSER) {
                case "win_chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                default:
                    Assert.fail("no such browser");

            }

        }
        return driver;
    }


    public static void stopWebDriver() {
        driver.quit();
        driver = null;
    }
}