package Dec_3_2024.Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExample {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://edso.in/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  //implicitWait also called global wait
        driver.findElement(By.id("acceptCookies")).click();
        driver.close();
    }
}
