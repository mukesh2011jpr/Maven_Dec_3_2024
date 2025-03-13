package Dec_3_2024.BasicsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsExample {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

       // List<WebElement>allElements= driver.findElements(By.tagName("testCheck")); //FindElements method if don't found elements it don't throw exception it returns empty list of array
        List<WebElement> allElements= driver.findElements(By.tagName("input"));
        System.out.println(allElements.size());
        for(WebElement e:allElements){
            System.out.println(e);
        }
    }
}
