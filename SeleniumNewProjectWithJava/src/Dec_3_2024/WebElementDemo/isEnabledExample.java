package Dec_3_2024.WebElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();  //Upcasting
        driver.get("https://www.letskodeit.com/practice");

        WebElement TextBox= driver.findElement(By.id("enabled-example-input"));
        WebElement EnableButton= driver.findElement(By.id("enabled-button"));
        WebElement DisabledButton= driver.findElement(By.id("disabled-button"));

        System.out.println(TextBox.isEnabled());       //true
        DisabledButton.click();
        System.out.println((TextBox.isEnabled()));     //false
        EnableButton.click();
        System.out.println(TextBox.isEnabled());    //true

        driver.close();


    }
}
