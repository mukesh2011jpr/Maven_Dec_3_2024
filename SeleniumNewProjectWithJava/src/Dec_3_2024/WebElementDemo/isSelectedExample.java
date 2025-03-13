package Dec_3_2024.WebElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedExample {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement radiobutton= driver.findElement(By.id("bmwradio"));
        System.out.println(radiobutton.isSelected());    //false
        radiobutton.click();
        System.out.println(radiobutton.isSelected());    //true
        driver.close();
    }
}
