package Dec_3_2024.iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IframeExample {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        //List<WebElement> allElements= driver.findElements(By.tagName("iframe"));
        //System.out.println(allElements.size());

        //iframe by Id
        driver.switchTo().frame("frame1");

        WebElement element=driver.findElement(By.xpath("//h1[text()='This is sample page']"));
        System.out.println(element.getText());

        driver.close();

    }
}
