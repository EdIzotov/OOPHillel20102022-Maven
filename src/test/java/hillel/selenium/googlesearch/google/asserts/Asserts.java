package hillel.selenium.googlesearch.google.asserts;

import org.testng.Assert;

import java.util.List;

public class Asserts {
    public static void checkSearchResultContainsWord(List<String> results, String searchWord) {
        for (String res: results) {
            if (!res.isBlank()) {
                Assert.assertTrue(res.toLowerCase().contains(searchWord.toLowerCase()));
            }
        }
    }
}
