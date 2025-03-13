package Dec_3_2024.BasicsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        WebElement element= driver.findElement(By.id("login1"));
        //WebElement element = driver.findElement(By.id("testcheck"));// when no element found on webpage then it gives NoSuchElementException
        element.sendKeys("Mukesh Kumar");
        // driver.close();
    }
}
