package Dec_3_2024.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class ContextClickExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement RightClickElement = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions act= new Actions(driver);
        act.contextClick(RightClickElement)
                .pause(3000)
                .perform();

        Thread.sleep(3000);
        driver.close();

    }
}
