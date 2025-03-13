package Dec_3_2024.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.openqa.selenium.devtools.v85.debugger.Debugger.pause;

public class ClickAndHoldExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        driver.manage().window().maximize();
        WebElement elementA=driver.findElement(By.xpath("//li[text()='A']"));

        Thread.sleep(3000);

        Actions act= new Actions(driver);
        act.clickAndHold(elementA)
                .pause(Duration.ofSeconds(10))
                .release(elementA)
                .pause(Duration.ofSeconds(10))
                .build()
                .perform();


        driver.close();
    }
}
