package Dec_3_2024.Locator;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorExample {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //By id locator
       /* WebElement UserNameTextBox= driver.findElement(By.id("login1"));
       UserNameTextBox.sendKeys("Mukesh Kumar Saini");
       */

        //By class name locator
        /*WebElement signInBtn=driver.findElement(By.className("signinbtn"));
        signInBtn.click();
        */

        //By name locator
       /*WebElement UserNameTexBox= driver.findElement(By.name("login"));
        UserNameTexBox.sendKeys("Mukesh Kumar");

        */

        //By Link text locator
        /*WebElement CreateNewAccount= driver.findElement(By.linkText("Create a new account"));
        CreateNewAccount.click();

         */

        //By partial link text locator
       /* WebElement CreateNewAccount = driver.findElement(By.partialLinkText("Create a"));
       CreateNewAccount.click();

        */

        // By tag name locator
        /*List<WebElement> allElements =driver.findElements(By.tagName("input"));
       System.out.println(allElements.size());

         */

        // By CSS Selector locator
       WebElement UserNameTextName= driver.findElement(By.cssSelector("input[id=\"login1\"]")); //CSS selector id example
        UserNameTextName.sendKeys("Priya soni");

        WebElement signInBtn= driver.findElement(By.cssSelector("input[class='signinbtn']"));  // CSS selector class example
       signInBtn.click();




        }

    }

