import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOfSelenium {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
       // driver.get("https://www.selenium.dev/downloads/");
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.close();

    }
}
