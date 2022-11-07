package hillel.selenium.googlesearch;

import hillel.selenium.googlesearch.google.GoogleResultPage;
import hillel.selenium.googlesearch.google.GoogleSearchPage;
import hillel.selenium.googlesearch.google.asserts.Asserts;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleSearchOOPTest extends BaseTest {
    String searchWord = "mazda";

    @Test
    public void checkSearchResultContainsSearchWord() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.search(searchWord);
        GoogleResultPage googleResultPage = new GoogleResultPage();
        List<String> results = googleResultPage.getResults();
        Asserts.checkSearchResultContainsWord(results, searchWord);
    }
}
