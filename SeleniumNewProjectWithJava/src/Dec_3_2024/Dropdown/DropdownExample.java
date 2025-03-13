package Dec_3_2024.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Spliterator;

public class DropdownExample {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement SingleDropDown= driver.findElement(By.id("carselect"));

        Select sel= new Select(SingleDropDown);
        List<WebElement> Options =sel.getOptions();
        for(WebElement e: Options){
            System.out.println(e.getText());
        }
        driver.close();
    }
}
