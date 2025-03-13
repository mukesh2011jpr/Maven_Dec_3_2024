package Dec_3_2024.JavaScriptExecuter;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByPixel {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");  //It's use for scroll down
        Thread.sleep(3000);

        jse.executeScript("window.scrollBy(0,-1000)");  //It's use for scroll up (by using negative values)
        Thread.sleep(3000);

        driver.close();
    }
}
