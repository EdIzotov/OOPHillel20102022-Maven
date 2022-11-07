package hillel.selenium.googlesearch.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GoogleResultPage extends GooglePage {
    private final By searchResult = By.cssSelector("div.MjjYud");
    private final WebDriver driver;

    public GoogleResultPage() {
        this.driver = SelDriver.getDriver();
    }

    public List<String> getResults() {
        List<WebElement> elements = driver.findElements(searchResult);
        List<String> result = new ArrayList<>();
        for (WebElement el: elements) {
            result.add(el.getText());
        }
        return result;
    }
}
