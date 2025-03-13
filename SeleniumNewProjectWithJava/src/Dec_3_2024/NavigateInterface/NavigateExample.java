package Dec_3_2024.NavigateInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class NavigateExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi"); //navigate().to method also used open a website URL like get() method

        Thread.sleep(3000);
        driver.findElement(By.linkText("Create a new account")).click();

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.navigate().refresh();

        Thread.sleep(3000);
        driver.close();

    }

}
