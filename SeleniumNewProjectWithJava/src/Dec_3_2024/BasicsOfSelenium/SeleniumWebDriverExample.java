package Dec_3_2024.BasicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriverExample {
    public static void main(String[] args) {

        // ChromeDriver driver= new ChromeDriver();  //By using ChromeDriver we run request only on Chrome Browser not for other Browsers
       // WebDriver driver= new FirefoxDriver();   // For executing test script on Firefox browser
       WebDriver driver= new ChromeDriver();// Upcasting , Here we defining  an object of
        driver.get("http://www.facebook.com");   //child class(ChromeDriver) and it is assigning to interface
        driver.close();                           // WebDriver
    }
}
