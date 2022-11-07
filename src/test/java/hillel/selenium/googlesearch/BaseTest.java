package hillel.selenium.googlesearch;

import hillel.selenium.googlesearch.google.SelDriver;
import org.testng.annotations.AfterClass;

public class BaseTest {
    @AfterClass
    public void tearDownMethod() {
        SelDriver.getDriver().close();
    }
}
