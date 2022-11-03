package hillel.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckHTMLTagsTest {
    WebDriver driver;

    @Test
    public void checkNoInlineJS() {
        int inlineJSSize = driver.findElements(By.cssSelector("script:not([src])")).size();
        Assert.assertEquals(inlineJSSize, 0);
    }

    @Test
    public void checkSingleJS() {
        int jsFilesSize = driver.findElements(By.cssSelector("script[src]")).size();
        Assert.assertEquals(jsFilesSize, 1);
    }

    @Test
    public void checkNoInlineCSS() {
        int inlineCSSSize = driver.findElements(By.tagName("style")).size();
        Assert.assertEquals(inlineCSSSize, 0);
    }

    @Test
    public void checkSingleCSS() {
        int cssFilesSize = driver.findElements(By.cssSelector("link[rel='stylesheet']")).size();
        Assert.assertEquals(cssFilesSize, 1);
    }

    @Test
    public void checkUniqueIDs() {
        List<WebElement> elements = driver.findElements(By.cssSelector("*[id]"));
        List<String> ids = new ArrayList<>();

        for (WebElement el: elements) {
            ids.add(el.getAttribute("id"));
        }
        Set<String> uniqueIDs = new HashSet<>(ids); //{"aaa", "bbb", "ccc", "bbb"} => {"aaa", "bbb", "ccc"}
        Assert.assertEquals(uniqueIDs.size(), ids.size());
    }

    @BeforeClass
    public void setupMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edizo\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.javatpoint.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardownMethod() {
        driver.quit();
    }
}
