package Dec_3_2024.ActionsClass;

import com.google.j2objc.annotations.Weak;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MoveToElementExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement MoveTo = driver.findElement(By.xpath("//span[text()='Login']"));
        Actions act = new Actions(driver);

        act.moveToElement(MoveTo)
                .pause(5000)
                .perform();
        Thread.sleep(3000);
        driver.close();
    }
}

