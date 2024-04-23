package devops.applied;

import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    WebDriver driver;

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver",
                "D:\\tools\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/upload.html");
        // Assert.assertEquals("BasicKeyboardInterfaceTest", driver.getTitle());
        // driver.findElement(By.id("textInput")).sendKeys("Pranay");
    }

    @After
    public void afterTest() {
        // driver.quit();
    }
}
