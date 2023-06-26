import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Solution {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path of driver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sakshingp.github.io/assignment/login.html");
        WebElement username = driver.findElement(By.id("user_email_Login"));
        WebElement password = driver.findElement(By.id("user_password"));
        WebElement login = driver.findElement(By.name("commit"));
        username.sendKeys("abc@gmail.com");
        password.sendKeys("your_password");
        login.click();
        String actualUrl = "- https://sakshingp.github.io/assignment";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

}