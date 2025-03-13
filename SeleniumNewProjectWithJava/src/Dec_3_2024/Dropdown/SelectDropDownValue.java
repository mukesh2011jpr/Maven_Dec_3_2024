package Dec_3_2024.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownValue {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement SingleDropDown= driver.findElement(By.id("carselect"));

        Select sel= new Select(SingleDropDown);

        // Select by Index() method
        Thread.sleep(3000);
        sel.selectByIndex(2);

        // Select by Value() method
        Thread.sleep(3000);
        sel.selectByValue("benz");

        // Select by Visible text() method
        Thread.sleep(3000);
        sel.selectByVisibleText("BMW");

        Thread.sleep(3000);
        driver.close();


    }
}
