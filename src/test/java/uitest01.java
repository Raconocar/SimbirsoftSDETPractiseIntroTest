import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class uitest01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get("https://demoqa.com/automation-practice-form");
        driver.getTitle();
        WebElement firstNametextBox = driver.findElement(By.id("firstName"));
        firstNametextBox.sendKeys("Selenium");
        WebElement lastNametextBox = driver.findElement(By.cssSelector("input[id='lastName']"));
        lastNametextBox.sendKeys("Selenium");

        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        submitButton.click();
        driver.quit();
    }

}