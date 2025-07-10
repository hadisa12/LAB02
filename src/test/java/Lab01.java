import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lab01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.id("username"));
        WebElement password =
                driver.findElement(By.id("password"));
        WebElement LoginBTN = driver.findElement(By.id("loginbutton"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        LoginBTN.click();
        driver.quit();
        driver.close();
    }
}
