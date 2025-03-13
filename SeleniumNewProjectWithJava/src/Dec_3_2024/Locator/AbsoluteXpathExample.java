package Dec_3_2024.Locator;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AbsoluteXpathExample {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //Absolute Xpath, and it is not recommended because it is started from root node, if developer makes any change then this path is failed
        WebElement SigninButton=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]"));
        SigninButton.click();

    }
}
