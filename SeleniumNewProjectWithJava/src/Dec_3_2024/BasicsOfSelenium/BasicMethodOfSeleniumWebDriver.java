package Dec_3_2024.BasicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodOfSeleniumWebDriver {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
       // driver.get("http://www.facebook.com");
        driver.get("https://edso.in/");
        System.out.println(driver.getTitle());     // It gives the title of a webpage
        System.out.println(driver.getCurrentUrl());  // It gives the URL of the website
        System.out.println(driver.getPageSource());   // It gives entire code of the page 
        driver.close();
    }
}
