package Dec_3_2024.WebElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        // sendKeys() method
        WebElement UserNameTextBox= driver.findElement(By.id("login1"));
        UserNameTextBox.sendKeys("Mukesh Kumar");

        //submit() method
       // driver.findElement(By.className("signinbtn"));
       // UserNameTextBox.submit();

        // clear() method
        //Thread.sleep(3000);
        //UserNameTextBox.clear();

        //getTagName() method
        //System.out.println(UserNameTextBox.getTagName());

        // getText() method
       // WebElement CreateNewAccount= driver.findElement(By.xpath("//u[text()=\"Create a new account\"]"));
       // System.out.println(CreateNewAccount.getText());

        //getAttribute value method
        System.out.println(UserNameTextBox.getDomAttribute("id"));
        

        driver.close();

    }
}
