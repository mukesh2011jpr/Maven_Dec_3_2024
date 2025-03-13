package Dec_3_2024.Wait;

import net.bytebuddy.description.type.TypeDescription;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://edso.in/");
        driver.manage().window().maximize();

        //We can use both Implicit Wait and Explicit Wait in same script but it is not recommendable

        WebElement acceptAllCookies =driver.findElement(By.id("acceptCookies"));

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.elementToBeClickable(acceptAllCookies)).click();




        driver.close();
    
    }
}
