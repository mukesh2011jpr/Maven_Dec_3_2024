package TestNG.TestNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGIntroduction {

    @Test
    public void edsoServices(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://edso.in/");

    }

    @Test
    public void tataConsultancy(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://tcs.com/");
        driver.close();
    }

}
