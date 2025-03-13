package Dec_3_2024.UploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        driver.findElement(By.id("file-upload")).sendKeys();
        driver.findElement(By.id("file-submit")).click();
        driver.close();
    }
}
