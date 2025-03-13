package Dec_3_2024.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://selenium08.blogspot.com/2019/11/double-click.html");
        driver.manage().window().maximize();

        WebElement DoubleClickElement= driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));

        Actions act=new Actions(driver);
        act.doubleClick(DoubleClickElement)
       .pause(3000)
       .perform();

        Thread.sleep(3000);
        driver.close();
    }
}
