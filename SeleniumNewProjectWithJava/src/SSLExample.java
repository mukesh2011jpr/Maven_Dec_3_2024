import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLExample {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);

        WebDriver driver= new ChromeDriver();
        driver.get("https://expired.badssl.com/");
        Thread.sleep(3000);
       // driver.close();
    }
}
