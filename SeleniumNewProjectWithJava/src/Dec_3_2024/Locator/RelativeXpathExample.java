package Dec_3_2024.Locator;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathExample {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        // By Relative Xpath
        WebElement UserNameTextBox =driver.findElement(By.xpath("//input[@id=\"login1\"]"));
        UserNameTextBox.sendKeys("Pinki Soni");

        // By text function
       // WebElement CreateNewAccount= driver.findElement(By.xpath(""));
       // CreateNewAccount.click();
    }

}
