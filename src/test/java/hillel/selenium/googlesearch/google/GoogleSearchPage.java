package hillel.selenium.googlesearch.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage extends GooglePage {
    private final By inputSearch = By.cssSelector("input[name='q']");
    private final By acceptCookies = By.cssSelector("#L2AGLb");
    private final WebDriver driver;

    public GoogleSearchPage() {
        this.driver = SelDriver.getDriver();
    }

    public void search(String word) {
        driver.get("https://www.google.com.ua/");
        driver.manage().window().maximize();
        driver.findElement(acceptCookies).click();
        driver.findElement(inputSearch).sendKeys(word);
        driver.findElement(inputSearch).sendKeys(Keys.ENTER);
    }
}
