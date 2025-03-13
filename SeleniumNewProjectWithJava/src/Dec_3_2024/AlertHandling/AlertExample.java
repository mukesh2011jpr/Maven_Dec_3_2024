package Dec_3_2024.AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.id("alertbtn")).click();

        Alert a= driver.switchTo().alert();
        System.out.println(a.getText());    // to fetch/print text of alert
        a.accept();
        Thread.sleep(3000);

        driver.findElement(By.id("bmwcheck")).click();

        Thread.sleep(3000);
        driver.close();

    }
}
