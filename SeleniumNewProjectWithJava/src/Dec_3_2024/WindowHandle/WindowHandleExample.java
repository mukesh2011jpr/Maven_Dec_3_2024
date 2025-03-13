package Dec_3_2024.WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.model.WindowID;

import java.util.Set;

public class WindowHandleExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.findElement(By.id("openwindow")).click();
        Thread.sleep(3000);

        String windowId=driver.getWindowHandle();
       // System.out.println(windowId);

        Set<String> AllWindows=driver.getWindowHandles();
       // System.out.println(AllWindows);

        for (String a:AllWindows){
            if(!a.contains(windowId))
                driver.switchTo().window(a);
            driver.findElement(By.linkText("INTERVIEW")).click();

        }

         driver.switchTo().window(windowId);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
         driver.quit();
    }
}
