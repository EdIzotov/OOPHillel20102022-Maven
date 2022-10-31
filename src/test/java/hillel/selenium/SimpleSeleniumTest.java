package hillel.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleSeleniumTest {
    @Test
    public void checkSomething() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edizo\\Desktop\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        String title = driver.getTitle();
        System.out.println(title);
    }
}
