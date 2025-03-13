package Dec_3_2024.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
    public static void main(String[] args) throws InterruptedException {
     WebDriver driver= new ChromeDriver();
     driver.navigate().to("https://selenium08.blogspot.com/2020/01/drag-drop.html");
     driver.manage().window().maximize();

        WebElement SrcElement= driver.findElement(By.id("draggable"));
        WebElement desElement= driver.findElement(By.id("droppable"));

                Actions act= new Actions(driver);

        act.dragAndDrop(SrcElement,desElement)
                .pause(3000)
                .perform();

          Thread.sleep(3000);
          driver.close();


    }
}
