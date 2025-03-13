package Dec_3_2024.Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        // How to add cookie
        Cookie ca= new Cookie("Company","Edso Services");
        driver.manage().addCookie(ca);
        //to fetch cookie
       // System.out.println(driver.manage().getCookieNamed("Company"));

        // to fetch cookies
        System.out.println("======Before Deletion of Cookies=========");
        Set<Cookie> allCookies=driver.manage().getCookies();
        for (Cookie c:allCookies){
            System.out.println(c);
        }

       // driver.manage().deleteCookieNamed("Company");

        driver.manage().deleteAllCookies();  // It is used for delete all cookies
        System.out.println("=====After Deletion of Cookies===========");
        Set<Cookie> allCookies2=driver.manage().getCookies();
        for (Cookie c:allCookies2){
            System.out.println(c);
        }


        driver.close();
    }
}
