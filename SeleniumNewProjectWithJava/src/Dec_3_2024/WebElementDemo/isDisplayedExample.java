package Dec_3_2024.WebElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement TextBox= driver.findElement(By.id("enabled-example-input"));
        WebElement ShowButton= driver.findElement(By.id("show-textbox"));
        WebElement HideButton= driver.findElement(By.id("hide-textbox"));

        System.out.println(TextBox.isDisplayed());       //true
        HideButton.click();
        System.out.println(TextBox.isDisplayed());     //false
        ShowButton.click();
        System.out.println(TextBox.isDisplayed());    //true

        driver.close();
    }
}
