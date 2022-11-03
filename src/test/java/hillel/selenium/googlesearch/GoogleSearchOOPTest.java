package hillel.selenium.googlesearch;

import hillel.selenium.googlesearch.google.GooglePage;
import hillel.selenium.googlesearch.google.GoogleSearchPage;
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

public class GoogleSearchOOPTest {
    WebDriver driver;
    String searchWord;

    @Test
    public void checkSearchResultContainsSearchWord() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.search(searchWord);
//        GooglePage googleResultPage = new GoogleResultPage();
//        googleResultPage.getResults();
//        Assertions.checkSearchResultContainsWord();
    }

    @BeforeClass
    public void setupMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edizo\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        searchWord = "mazda";

        driver.get("https://google.com.ua/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardownMethod() {
        driver.quit();
    }
}

