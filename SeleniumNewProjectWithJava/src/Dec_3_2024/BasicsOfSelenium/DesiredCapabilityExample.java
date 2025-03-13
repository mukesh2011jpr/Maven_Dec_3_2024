package Dec_3_2024.BasicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilityExample {
    public static void main(String[] args) {
        ChromeOptions cp= new ChromeOptions(); //ChromeOptions class is used when browser is not installed on machine instead of using Desired capability class
        cp.setBinary("C:\\Users\\god\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
       // cp.addArguments("--headless"); // it executes internally and browser don't open
        WebDriver driver= new ChromeDriver(cp);
        System.out.println(cp.getBrowserVersion());
        System.out.println(cp.getBrowserName());
        driver.get("http://www.facebook.com");
        //driver.close();
    }
}
