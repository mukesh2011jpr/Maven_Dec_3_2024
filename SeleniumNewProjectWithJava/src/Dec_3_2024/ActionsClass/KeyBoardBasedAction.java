package Dec_3_2024.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardBasedAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();

       WebElement SearchTextBox= driver.findElement(By.name("q"));

        Actions act= new Actions(driver);
        act.moveToElement(SearchTextBox)
                .click(SearchTextBox)
                .pause(3000)
                .keyDown(Keys.SHIFT)
                .sendKeys("tshirt")
                .keyUp(Keys.SHIFT)
                .pause(3000)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
        Thread.sleep(3000);
       // driver.close();


    }
}
