package devops.applied;

import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; // Add this line
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {
    WebDriver driver;

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "D:\\tools\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://13.232.153.58/upload.html");

        // Fill out the form
        WebElement fileInput = driver.findElement(By.id("torrent-file"));
        fileInput.sendKeys("C:\\Users\\prana\\Downloads\\chromedriver-win64 (1).zip"); // Replace with the actual path
                                                                                       // to your file

        WebElement descriptionInput = driver.findElement(By.id("description"));
        descriptionInput.sendKeys("This is a test description");

        WebElement sizeInput = driver.findElement(By.id("size"));
        sizeInput.sendKeys("100.00");

        WebElement categoryInput = driver.findElement(By.id("category"));
        categoryInput.sendKeys("Software");

        WebElement typeInput = driver.findElement(By.id("type"));
        typeInput.sendKeys("Torrent");

        // Submit the form
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @After
    public void afterTest() {
        // driver.quit();
    }
}