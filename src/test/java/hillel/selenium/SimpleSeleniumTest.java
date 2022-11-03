package hillel.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.UUID;

public class SimpleSeleniumTest {
    @Test
    public void checkSomething() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edizo\\Desktop\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://151.80.70.42:3000/");
        driver.manage().window().maximize();

        String name = UUID.randomUUID().toString();
        String phone = String.valueOf(System.currentTimeMillis());

        int prevUsers = driver.findElements(By.cssSelector("ul#user-list li")).size();
        System.out.printf("Number of users before: %d%n", prevUsers);

        driver.findElement(By.cssSelector("i.mdi-content-add")).click();
//        driver.findElement(By.xpath("//i[@class='mdi-content-add']"));

        driver.findElement(By.cssSelector("div.main-content input#icon_prefix")).clear();
        driver.findElement(By.cssSelector("div.main-content input#icon_prefix")).sendKeys(name);
//        driver.findElements(By.xpath("//div[@class='main-content']//input[@id='icon_prefix']"));

        driver.findElement(By.cssSelector("div.main-content input#icon_telephone")).clear();
        driver.findElement(By.cssSelector("div.main-content input#icon_telephone")).sendKeys(phone);
//        driver.findElements(By.xpath("//div[@class='main-content']//input[@id='icon_telephone']"));

        driver.findElement(By.cssSelector("div.main-content a.save-btn")).click();
//        driver.findElement(By.xpath("//div[@class='main-content']//a[@class='save-btn']"));

        Thread.sleep(3000);

        List<WebElement> users = driver.findElements(By.cssSelector("ul#user-list li"));
        int afterUsers = users.size();
        System.out.printf("Number of users after: %d%n", afterUsers);

        boolean isPresented = false;
        for (WebElement el: users) {
            String userName = el.findElement(By.tagName("h4")).getText();
            String userPhone = el.findElement(By.tagName("p")).getText();

            if (userName.equals(name) && userPhone.equals(phone)) {
                isPresented = true;
            }
        }
        Assert.assertEquals(afterUsers, prevUsers + 1);
        Assert.assertTrue(isPresented);
    }
}
