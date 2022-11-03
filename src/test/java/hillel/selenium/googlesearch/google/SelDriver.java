package hillel.selenium.googlesearch.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDriver {
    private static WebDriver driver;
    private static void createDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edizo\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static WebDriver getDriver() {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }
}
