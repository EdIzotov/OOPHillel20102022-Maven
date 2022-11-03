package hillel.selenium.googlesearch.google;

import org.openqa.selenium.WebDriver;

public class GoogleSearchPage extends GooglePage {
    private WebDriver driver;

    public GoogleSearchPage() {
        this.driver = SelDriver.getDriver();
    }

    public void search(String word) {

    }
}
